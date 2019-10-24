package com.example.PmdmListaCompra;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Cuentas extends AppCompatActivity {

    Double sumaTotal, pr1;

    // Getter y Setter
    public Double getSumaTotal() {
        return sumaTotal;
    }

    public void setSumaTotal(Double sumaTotal) {
        this.sumaTotal = sumaTotal;
    }

    public Double getPr1() {
        return pr1;
    }

    public void setPr1(Double pr1) {
        this.pr1 = pr1;
    }

    // ToString
    @Override
    public String toString() {
        return "Cuentas{" +
                "sumaTotal=" + sumaTotal +
                ", pr1=" + pr1 +
                '}';
    }

    // 
}
