package com.example.PmdmListaCompra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    // Instancias
    Button lacteos, verduras, carnes, pescados, factura;
    TextView tvM;
    private double total;

    // Variable para el Itent
    private static final String A = "A";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instancia
        lacteos = findViewById(R.id.btLacteos);
        verduras = findViewById(R.id.btCarnes);
        carnes = findViewById(R.id.btPescados);
        pescados = findViewById(R.id.btVerduras);
        factura = findViewById(R.id.btFactura);
        tvM = findViewById(R.id.tvM);

        total = getIntent().getDoubleExtra(A,0);

        // Get intent de lacteos y sumarlo al total
        Intent intent = getIntent();
        intent.getDoubleExtra("B",0);

        

        lacteos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzarLacteos();
            }
        });

        carnes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzarCarnes();
            }
        });

        verduras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzarVerduras();
            }
        });

        pescados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzarPescados();
            }
        });

        pescados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzarPescados();
            }
        });

        factura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzarFactura();
            }
        });

    }

    // LANZADORES
    private void lanzarLacteos() {
        Intent l = new Intent(this, SegundaLacteos.class);
        l.putExtra(A,total);
        startActivity(l);
    }

    private void lanzarCarnes() {
        Intent c = new Intent(this, SegundaLacteos.class);
        startActivity(c);
    }

    private void lanzarVerduras() {
        Intent v = new Intent(this, SegundaLacteos.class);
        startActivity(v);
    }

    private void lanzarPescados() {
        Intent p = new Intent(this, SegundaLacteos.class);
        startActivity(p);
    }

    private void lanzarFactura() {
        Intent f = new Intent(this, SegundaLacteos.class);
        startActivity(f);
    }
}