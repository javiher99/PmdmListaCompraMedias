package com.example.PmdmListaCompra;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class QuintaPescados extends AppCompatActivity {
    private Spinner spPescado;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quinta_pescados);

        // Spinner
        spPescado = findViewById(R.id.spPescado);

        String [] spinnerPescado = getResources().getStringArray(R.array.Pescado);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,spinnerPescado);
        spPescado.setAdapter(adapter4);


    }
}
