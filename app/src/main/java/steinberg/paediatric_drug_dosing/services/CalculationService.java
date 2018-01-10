package steinberg.paediatric_drug_dosing.services;

import java.text.DecimalFormat;

import steinberg.paediatric_drug_dosing.types.Drug;

public class CalculationService {

    private static DecimalFormat formatter = new DecimalFormat("#.#");

    public static String GetDoseMessage(Drug drug, int weight)
    {
        double totalUnrounded = Math.min(weight * drug.VariableMilliliters, drug.MaximumMilliliters);
        String totalString = formatter.format(totalUnrounded);
        return totalString + " mLs " + drug.FrequencyMessage;
    }

    public static String GetMilligramsDoseMessage(Drug drug, int weight)
    {
        double totalUnrounded = Math.min(weight * drug.VariableMilligrams, drug.MaximumMilligrams);
        String totalString = formatter.format(totalUnrounded);
        return totalString + " mgs " + drug.FrequencyMessage;
    }
}
