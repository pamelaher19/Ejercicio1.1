package com.example.ejercicio11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityResultado extends AppCompatActivity {
    TextView resultado, calculo;
    Button goBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        assignValues();
        goBack.setOnClickListener(this::onClickBack);
    }

    protected void onClickBack(View view){
        Intent panel = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(panel);
    }

    private void assignValues(){
        Bundle bnd = getIntent().getExtras();
        resultado = findViewById(R.id.txtResul);
        calculo = findViewById(R.id.txtTitulo);
        goBack = findViewById(R.id.btnAtras);

        calculo.setText(bnd.getString("calculo"));
        resultado.setText(String.valueOf(bnd.getDouble("resultado")));
    }
}