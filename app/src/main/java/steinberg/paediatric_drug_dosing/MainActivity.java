package steinberg.paediatric_drug_dosing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import steinberg.paediatric_drug_dosing.factories.DrugFactory;
import steinberg.paediatric_drug_dosing.services.CalculationService;
import steinberg.paediatric_drug_dosing.types.Drug;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Drug> _drugs;
    private ArrayList<String> _drugNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _drugs = DrugFactory.GetDrugs();
        _drugNames = new ArrayList<String>();
        for (Drug drug : _drugs) {
            _drugNames.add(drug.HumanFriendlyName);
        }

        Spinner drugSpinner = findViewById(R.id.DrugSelectionSpinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, _drugNames);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        drugSpinner.setAdapter(adapter);

        final Button button = findViewById(R.id.CalculateButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView doseOutput = findViewById(R.id.DoseOutput);
                final TextView milligramsOutput = findViewById(R.id.MilligramsOutput);
                final Spinner drugSpinner = findViewById(R.id.DrugSelectionSpinner);
                final EditText weightInput = findViewById(R.id.WeightInput);
                final int drugIndex = _drugNames.indexOf(drugSpinner.getSelectedItem().toString());
                final Drug drug = _drugs.get(drugIndex);
                final int weight = Integer.parseInt(weightInput.getText().toString());
                doseOutput.setText(CalculationService.GetDoseMessage(drug, weight));
                doseOutput.setVisibility(View.VISIBLE);
                milligramsOutput.setText(CalculationService.GetMilligramsDoseMessage(drug, weight));
                milligramsOutput.setVisibility(View.VISIBLE);
            }
        });

    }
}
