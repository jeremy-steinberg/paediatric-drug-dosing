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
        result.append(totalString + " mLs " + drug.FrequencyMessage);

        if (drug.MessageMillileters != null && !drug.MessageMillileters.isEmpty())
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

        if (drug.MessageMilligrams != null && !drug.MessageMilligrams.isEmpty())
        {
            result.append(" " + drug.MessageMilligrams);
        }

        return result.toString();
    }
}
