package steinberg.paediatric_drug_dosing.types;

public class Drug {
    public String Name;
    public String HumanFriendlyName;
    public String FrequencyMessage;
    public double VariableMilliliters;
    public double VariableMilligrams;
    public double MaximumMilliliters;
    public double MaximumMilligrams;

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
