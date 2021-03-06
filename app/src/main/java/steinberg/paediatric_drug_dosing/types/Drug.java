package steinberg.paediatric_drug_dosing.types;
import java.util.TreeMap;

public class Drug {
    // Required fields
    public final String Name;
    public final String HumanFriendlyName;
    public final String FrequencyMessage;
    public final double BaseMilliliters;
    public final double BaseMilligrams;
    public final double MaximumMilliliters;
    public final double MaximumMilligrams;

    // Special fields
    public String MessageMillileters;
    public String MessageMilligrams;
    public double HighMillilitersMaximum;
    public double HighMilligramsMaximum;
    public TreeMap<Integer, Integer> WeightToMillilitersData = new TreeMap<Integer, Integer>();
    public TreeMap<Integer, Integer> WeightToMilligramsData = new TreeMap<Integer, Integer>();

    public Drug(String name, String humanFriendlyName, String frequencyMessage, double baseMilliliters, double baseMilligrams,
                double maximumMilliliters, double maximumMilligrams)
    {
        Name = name;
        HumanFriendlyName = humanFriendlyName;
        FrequencyMessage = frequencyMessage;
        BaseMilliliters = baseMilliliters;
        BaseMilligrams = baseMilligrams;
        MaximumMilliliters = maximumMilliliters;
        MaximumMilligrams = maximumMilligrams;
    }
}
