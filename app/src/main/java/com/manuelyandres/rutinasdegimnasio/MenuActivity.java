package com.manuelyandres.rutinasdegimnasio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    private Button btnRut1;
    private Button btnRut2;
    private Button btnRut3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btnRut1 = findViewById(R.id.btnRutina1);
        btnRut2 = findViewById(R.id.btnRutina2);
        btnRut3 = findViewById(R.id.btnRutina3);

    }
}