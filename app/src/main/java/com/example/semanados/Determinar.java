package com.example.semanados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Determinar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_determinar);


        final EditText eNombre = (EditText) findViewById(R.id.etNombre);
        final EditText eEdad = (EditText) findViewById(R.id.etEdad);
        Button bEnviar = (Button) findViewById(R.id.btEnviarDatos);
        bEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = eNombre.getText().toString();
                String edad = eEdad.getText().toString();
                Bundle pasarDatos = new Bundle();
                pasarDatos.putString("pNombre", nombre);
                pasarDatos.putString("pEdad", edad);
                Intent siga = new
                        Intent(Determinar.this,Determinar2.class);
                siga.putExtras(pasarDatos);
                startActivity(siga);

            }
        });

    }

}






