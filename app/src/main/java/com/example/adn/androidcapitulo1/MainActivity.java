package com.example.adn.androidcapitulo1;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button boton;
    EditText txtNombre;
    Button btnSaludar;
    Button btnLanzarActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton=(Button)findViewById(R.id.boton1);
        btnLanzarActivity=(Button)findViewById(R.id.boton2);
        txtNombre=(EditText)findViewById(R.id.editText);
        boton.setOnClickListener(this);
        btnLanzarActivity.setOnClickListener(this);
        btnSaludar=(Button)findViewById(R.id.button3);
        btnSaludar.setOnClickListener(this);
    }
    public void onClick(View v){
        if(v.getId()==R.id.boton1){

            Toast.makeText(getBaseContext(), "me pulsaron", Toast.LENGTH_LONG).show();
        }
        else if(v.getId()==R.id.button3){
            String nombre= txtNombre.getText().toString();
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Hola " + nombre)
                    .setPositiveButton("Aceptar",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                }
                            });
            AlertDialog alert = builder.create();
            alert.show();
            txtNombre.setText("");

        }
        else if(v.getId()== R.id.boton2){
            Intent i = new Intent(getApplicationContext(),imagen.class);
            startActivity(i);

        }
    }

}

