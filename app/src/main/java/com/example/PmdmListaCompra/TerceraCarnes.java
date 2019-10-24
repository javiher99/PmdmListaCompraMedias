package com.example.PmdmListaCompra;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TerceraCarnes extends AppCompatActivity {
    Spinner spCarne;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercera_carnes);

        // Spinner
        spCarne = findViewById(R.id.spCarne);

        String [] spinnerCarne = getResources().getStringArray(R.array.Carne);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,spinnerCarne);
        spCarne.setAdapter(adapter);

    }
}
