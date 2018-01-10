package steinberg.paediatric_drug_dosing.factories;
import java.util.ArrayList;

import steinberg.paediatric_drug_dosing.types.Drug;
public class DrugFactory {

    public static ArrayList<Drug> GetDrugs()
    {
        ArrayList<Drug> drugs = new ArrayList<Drug>();

        drugs.add(new Drug("Paracetamol120", "Paracetamol 120mg/5mL (15mg/kg)", "FOUR times a day", 0.625, 15, 42, 1000));
        drugs.add(new Drug("Paracetamol250", "Paracetamol 250mg/5mL (15mg/kg)","FOUR times a day", 0.3, 15, 20, 1000));
        drugs.add(new Drug("Macrogol", "Macrogol 13.12g/sachet (0.5-1.5g/kg)","ONCE daily", 0.038, 0.5, 8, 105));

        Drug drug = new Drug("Prednisolone", "Prednisolone 5mg/1mL (1-2mg/kg)", "ONCE daily", 0.2, 1, 8, 40);
        drug.MessageMillileters = "\nIf child has been taking an oral corticosteroid for more than a few days, give 2 mg/kg (i.e. 0.4mL/kg, with a higher maximum of 12mL) once daily";
        drug.MessageMilligrams = "\nIf child has been taking an oral corticosteroid for more than a few days, give 2 mg/kg (higher maximum of 60mg) once daily";
        drug.HighMillilitersMaximum = 8;
        drug.HighMilligramsMaximum = 40;
        drugs.add(drug);

        drug = new Drug("Ibuprofen100", "Ibuprofen 100mg/5mL (5-10mg/kg)", "THREE times a day", 0.25, 5, 10, 200);
        // enable range so set a really high max
        drug.HighMillilitersMaximum = 100000000;
        drug.HighMilligramsMaximum = 100000000;
        drugs.add(drug);

        drug = new Drug("Phenoxymethylpenicillin", "Phenoxymethylpenicillin 250mg/5mL", "TWO to THREE times a day\n(10 days for strep A)", 0.25, 5, 10, 200);
        drug.WeightToMillilitersData.put(0, 5);
        drug.WeightToMillilitersData.put(20, 10);

        drug.WeightToMilligramsData.put(0, 250);
        drug.WeightToMilligramsData.put(20, 500);
        drugs.add(drug);

        return drugs;
    }
}
