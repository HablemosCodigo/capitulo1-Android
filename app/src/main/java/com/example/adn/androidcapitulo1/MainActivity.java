package com.example.adn.androidcapitulo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton=(Button)findViewById(R.id.boton1);
        boton.setOnClickListener(this);
    }
    public void onClick(View v){
        if(v.getId()==R.id.boton1){

            Toast.makeText(getBaseContext(), "me pulsaron", Toast.LENGTH_LONG).show();
        }
    }

}

