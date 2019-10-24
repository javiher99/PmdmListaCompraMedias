package com.example.PmdmListaCompra;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CuartaVerduras extends AppCompatActivity {
    Spinner spVerdura;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuarta_verduras);

        //Spinner
        spVerdura = findViewById(R.id.spVerduras);

        String [] spinnerVerdura = getResources().getStringArray(R.array.Verdura);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,spinnerVerdura);
        spVerdura.setAdapter(adapter3);
    }
}
