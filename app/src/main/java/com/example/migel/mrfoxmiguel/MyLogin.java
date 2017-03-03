package com.example.migel.mrfoxmiguel;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MyLogin extends AppCompatActivity {

    EditText email, contraseña;
    TextView registro;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email=(EditText)findViewById(R.id.email);
        contraseña=(EditText)findViewById(R.id.contraseña);
        login=(Button)findViewById(R.id.login);
        registro=(TextView)findViewById(R.id.registrar);

        Typeface font = Typeface.createFromAsset(getApplicationContext().getAssets(), "AmaticSC-Regular.ttf");
        email.setTypeface(font);
        contraseña.setTypeface(font);
    }

    public void Siguiente(View v){
        Intent i = new Intent(this, MyMain.class);
        startActivity(i);
    }


}
