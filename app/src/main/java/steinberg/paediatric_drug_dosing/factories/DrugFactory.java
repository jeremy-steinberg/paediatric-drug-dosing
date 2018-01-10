package steinberg.paediatric_drug_dosing.factories;
import java.util.ArrayList;
import steinberg.paediatric_drug_dosing.types.Drug;
public class DrugFactory {

    public static ArrayList<Drug> GetDrugs()
    {
        ArrayList<Drug> drugs = new ArrayList<Drug>();

        drugs.add(new Drug("Paracetamol120", "Paracetamol 120mg/5mL (15mg/kg)", "FOUR times a day", 0.625, 15, 42, 1000));
        drugs.add(new Drug("Paracetamol250", "Paracetamol 250mg/5mL (15mg/kg)","FOUR times a day", 0.3, 15, 20, 1000));

        Drug drug = new Drug("Prednisolone", "Prednisolone 5mg/1mL (1-2/kg)", "ONCE daily", 0.2, 1, 8, 40);
        drug.MessageMillileters = "\nIf child has been taking an oral corticosteroid for more than a few days, give 2 mg/kg (i.e. 0.4mL/kg, with a higher maximum of 12mL) once daily";
        drug.MessageMilligrams = "\nIf child has been taking an oral corticosteroid for more than a few days, give 2 mg/kg (higher maximum of 60mg) once daily";
        drug.HighMillilitersMaximum = 8;
        drug.HighMilligramsMaximum = 40;
        drugs.add(drug);

        return drugs;
    }
}
