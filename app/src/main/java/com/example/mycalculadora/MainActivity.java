package com.example.mycalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText Num1, Num2;
    Button Suma, Resta, Multi, Dividir;
    TextView Resu;

    
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Num1 = findViewById (R.id.Num1);
        Num2 = findViewById (R.id.Num2);

        Suma = findViewById(R.id.Suma);
        Resta = findViewById(R.id.Resta);
        Multi = findViewById(R.id.Multi);
        Dividir = findViewById(R.id.Dividir);
        Resu = findViewById(R.id.Resu);

        Suma.setOnClickListener(this);
        Resta.setOnClickListener(this);
        Multi.setOnClickListener(this);
        Dividir.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        String n1 = Num1.getText().toString();
        String n2 = Num2.getText().toString();

        int Nentero1 = Integer.parseInt(n1);
        int Nentero2 = Integer.parseInt(n2);
        int resulta = 0;

        switch (view.getId()){
            case R.id.Suma:
                resulta=Nentero1+Nentero2;

                break;
            case R.id.Resta:
                resulta=Nentero1-Nentero2;

                break;
            case R.id.Multi:
                resulta=Nentero1*Nentero2;

                break;
            case R.id.Dividir:
                resulta=Nentero1/Nentero2;
                break;


        }
Resu.setText(""+resulta);
        
        
    }
}