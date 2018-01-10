package steinberg.paediatric_drug_dosing.types;

public class Drug {
    // Required fields
    public final String Name;
    public final String HumanFriendlyName;
    public final String FrequencyMessage;
    public final double VariableMilliliters;
    public final double VariableMilligrams;
    public final double MaximumMilliliters;
    public final double MaximumMilligrams;

    // Special fields
    public String MessageMillileters;
    public String MessageMilligrams;
    public double HighMillilitersMaximum;
    public double HighMilligramsMaximum;

    public Drug(String name, String humanFriendlyName, String frequencyMessage, double variableMilliliters, double variableMilligrams,
                double maximumMilliliters, double maximumMilligrams)
    {
        Name = name;
        HumanFriendlyName = humanFriendlyName;
        FrequencyMessage = frequencyMessage;
        VariableMilliliters = variableMilliliters;
        VariableMilligrams = variableMilligrams;
        MaximumMilliliters = maximumMilliliters;
        MaximumMilligrams = maximumMilligrams;
    }
}
