package com.manuelyandres.rutinasdegimnasio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import com.google.android.material.textfield.TextInputEditText;

public class Rutina1Ej1Activity extends AppCompatActivity {

    private Button btnAtras,btnVolverinicio,btnAdelante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rutina1_ej1);
        btnAtras = findViewById(R.id.btnatra);
        btnVolverinicio = findViewById(R.id.btnvolvinicio);
        btnAdelante = findViewById(R.id.btnadel);
    }
}