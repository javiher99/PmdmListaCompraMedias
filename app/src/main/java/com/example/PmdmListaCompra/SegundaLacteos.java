package com.example.PmdmListaCompra;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SegundaLacteos extends AppCompatActivity {

    private static final String B = "B";

    private double total;

    private Spinner spLacteos;
    private TextView tv;
    private Button btEnviar;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_lacteos);

        // Cojo el intent del total del Main y lo guardo en el total
        Intent intent = getIntent();
        total = intent.getDoubleExtra("A",0);

        spLacteos = findViewById(R.id.spLacteos);
        tv = findViewById(R.id.tvPrecioLacteos);
        btEnviar = findViewById(R.id.btAñadir);

        // Spinner
        String [] spinnerLacteos = getResources().getStringArray(R.array.Lacteos);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,spinnerLacteos);
        spLacteos.setAdapter(adapter2);

        spLacteos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String seleccionado = spLacteos.getSelectedItem().toString();
                tv.setText(seleccionado);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                spLacteos.setSelection(0);
            }
        });

        btEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzarActividad();
            }
        });

    }

    private void lanzarActividad(){
        Intent i = new Intent(this, MainActivity.class);
        i.putExtra(B,total);
        startActivity(i);
    }
}
