package steinberg.paediatric_drug_dosing.services;

import java.text.DecimalFormat;

import steinberg.paediatric_drug_dosing.types.Drug;

public class CalculationService {

    private static DecimalFormat formatter = new DecimalFormat("#.#");

    public static String GetDoseMessage(Drug drug, int weight)
    {
        double totalUnrounded = Math.min(weight * drug.VariableMilliliters, drug.MaximumMilliliters);
        String totalString = formatter.format(totalUnrounded);

        if (drug.HighMillilitersMaximum != 0)
        {
            double highUnrounded = Math.min(totalUnrounded * 2, drug.HighMillilitersMaximum);
            totalString = totalString + " - " + formatter.format(highUnrounded);
        }

        StringBuilder result = new StringBuilder();

        if (drug.Name == "Macrogol")
        {
            result.append(totalString + " sachets " + drug.FrequencyMessage);
            result.append(" (disolved in " + MacrogolRounding(125 * totalUnrounded, 10) +  " mLs of water)" );
            result.append("\nOR\nDisimpaction Dose: " + MacrogolRounding(Math.min(8, totalUnrounded * 3), 0.25));
            result.append(" sachets daily until passes soft stool (disolved in " + MacrogolRounding(Math.min(8 * 125, totalUnrounded * 3 * 125), 10) + "mLs of water)");
        }
        else
        {
            result.append(totalString + " mLs " + drug.FrequencyMessage);
        }


        if (drug.Name == "Ibuprofen100" && weight < 10)
        {
            result.append("\nMaximum " + formatter.format(totalUnrounded) + " mLs if under THREE months");
        }
        else if (drug.Name == "Prednisolone")
        {
            double veryHighDoseUnrounded = Math.min(12, weight * 0.4);
            result.append("\nIf child has already been taking for more than a few days, give " + formatter.format(veryHighDoseUnrounded) + "mL once daily (2mg/kg with a 60mg/12mL maximum)");
        }
        else if (drug.MessageMillileters != null && !drug.MessageMillileters.isEmpty())
        {
            result.append(" " + drug.MessageMillileters);
        }


        return result.toString();
    }

    public static String GetMilligramsDoseMessage(Drug drug, int weight)
    {
        double totalUnrounded = Math.min(weight * drug.VariableMilligrams, drug.MaximumMilligrams);
        String totalString = formatter.format(totalUnrounded);

        if (drug.HighMilligramsMaximum != 0)
        {
            double highUnrounded = Math.min(totalUnrounded * 2, drug.HighMilligramsMaximum);
            totalString = totalString + " - " + formatter.format(highUnrounded);
        }

        StringBuilder result = new StringBuilder();
        result.append(totalString + " mgs " + drug.FrequencyMessage);

        if (drug.Name == "Ibuprofen100" && weight < 10)
        {
            result.append("\nMaximum " + formatter.format(totalUnrounded) + " mLs if under THREE months");
        }
        else if (drug.Name == "Prednisolone")
        {
            double veryHighDoseUnrounded = Math.min(60, weight * 2);
            result.append("\nIf child has already been taking for more than a few days, give " + formatter.format(veryHighDoseUnrounded) + "mg once daily (2mg/kg with a 60mg maximum)");
        }
        else if (drug.Name == "Macrogol")
        {
            result.append("\n (or " + MacrogolRounding(Math.min(105, (totalUnrounded * 3)), 0.25) + " mgs daily for disimpaction until passes soft stool)");
        }
        else if (drug.MessageMilligrams != null && !drug.MessageMilligrams.isEmpty())
        {
            result.append(" " + drug.MessageMilligrams);
        }

        return result.toString();
    }

    private static String MacrogolRounding(double value, double step)
    {
        double inv = 1.0/ step;
        return formatter.format(Math.round(value * inv) / inv);
    }

}
