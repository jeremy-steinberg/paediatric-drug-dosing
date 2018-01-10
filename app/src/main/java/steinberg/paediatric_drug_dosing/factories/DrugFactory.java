package steinberg.paediatric_drug_dosing.factories;
import java.util.ArrayList;

import steinberg.paediatric_drug_dosing.types.Drug;
public class DrugFactory {

    public static ArrayList<Drug> GetDrugs()
    {
        ArrayList<Drug> drugs = new ArrayList<Drug>();

        drugs.add(new Drug("Paracetamol120", "Paracetamol 120mg/5mL (15mg/kg)", "FOUR times a day", 0.625, 15, 42, 1000));
        drugs.add(new Drug("Paracetamol250", "Paracetamol 250mg/5mL (15mg/kg)","FOUR times a day", 0.3, 15, 20, 1000));

        drugs.add(new Drug("Amoxicillin125", "Amoxicillin 125mg/5mL (15-30mg/kg)","THREE times a day", 0.6, 15, 20, 500));
        drugs.add(new Drug("Amoxicillin250", "Amoxicillin 250mg/5mL (15-30mg/kg)","THREE times a day", 0.3, 15, 20, 500));

        drugs.add(new Drug("Cefaclor125", "Cefaclor 125mg/5mL (10mg/kg)","THREE times a day", 0.3, 15, 20, 500));
        drugs.add(new Drug("Cefalexin125", "Cefalexin 125mg/5mL (12.5mg/kg)","THREE times a day", 0.3, 15, 20, 500));
        drugs.add(new Drug("Cefalexin250", "Cefalexin 250mg/5mL (12.5mg/kg)","THREE times a day", 0.3, 15, 20, 500));

        drugs.add(new Drug("Coamoxiclav125-31.25", "Coamoxiclav 125-31.25mg/5mL (15mg/kg)","THREE times a day", 0.48, 12, 20, 500));
        drugs.add(new Drug("Coamoxiclav250-62.5", "Coamoxiclav 250-62.5mg/5mL (15mg/kg)","THREE times a day", 0.24, 12, 10, 500));
        drugs.add(new Drug("Cotrimoxazole480", "Cotrimoxazole 240mg/5mL (24mg/kg)","TWICE a day", 0.5, 24, 20, 960));
        drugs.add(new Drug("Erythromycin200", "Erythromycin 200mg/5mL (10mg/kg)","FOUR times a day", 0.25, 10, 25, 1000));
        drugs.add(new Drug("Erythromycin400", "Erythromycin 400mg/5mL (10mg/kg)","FOUR times a day", 0.125, 10, 12.5, 1000));
        drugs.add(new Drug("Flucloxacillin125", "Flucloxacillin 125mg/5mL (12.5mg/kg)","FOUR times a day", 0.5, 12.5, 20, 500));
        drugs.add(new Drug("Flucloxacillin250", "Flucloxacillin 250mg/5mL (12.5mg/kg)","FOUR times a day", 0.25, 12.5, 20, 500));
        drugs.add(new Drug("Lactulose", "Lactulose (0.5mL/kg)","TWICE daily (adjusted according to response)", 0.5, 0.334, 10, 500));


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
