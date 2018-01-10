package steinberg.paediatric_drug_dosing.factories;
import java.util.ArrayList;
import steinberg.paediatric_drug_dosing.types.Drug;
public class DrugFactory {

    public static ArrayList<Drug> GetDrugs()
    {
        ArrayList<Drug> drugs = new ArrayList<Drug>();

        drugs.add(new Drug("Paracetamol120", "Paracetamol 120mg/5mL (15mg/kg)", "FOUR times a day", 0.625, 15, 42, 1000));
        drugs.add(new Drug("Paracetamol250", "Paracetamol 250mg/5mL (15mg/kg)","FOUR times a day", 0.3, 15, 20, 1000));

        return drugs;
    }
}
