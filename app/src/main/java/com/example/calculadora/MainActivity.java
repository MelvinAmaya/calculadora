package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public TextView resultado;
    public Button division;
    public Button Multipli;
    public Button resta;
    public Button suma;


    float num1 = 0.0f;
    float num2 = 0.0f;
    String operar ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultado= findViewById(R.id.txtResultado);
        division = findViewById(R.id.btnDividir);
        Multipli = findViewById(R.id.btnMulti);
        resta = findViewById(R.id.btnRes);
        suma = findViewById(R.id.btnSuma);


    }
    //boton 9
    public void escribirNueve(View view) {
        if(operar != ""){

            num1 = Float.parseFloat(resultado.getText().toString());
            if(num1 == 0.0f){
                resultado.setText("9");
            }
            else
            {
                resultado.setText(resultado.getText().toString()+"9");
            }
        }
        else
        {
            num2 = Float.parseFloat(resultado.getText().toString());
            if(num2 == 0.0f){
                resultado.setText("9");
            }
            else
            {
                resultado.setText(resultado.getText().toString()+"9");
            }
        }
    }
    //boton 8
    public void escribirOcho(View view) {
        if(operar.equals("")) {
            num1 = Float.parseFloat(resultado.getText().toString());
            if (num1 == 0.0f) {
                resultado.setText("8");
            } else {
                resultado.setText(resultado.getText().toString() + "8");
            }
        }
        else
        {
            num2 = Float.parseFloat(resultado.getText().toString());
            if (num2 == 0.0f) {
                resultado.setText("8");
            } else {
                resultado.setText(resultado.getText().toString() + "8");
            }
        }
    }
    //boton 7
    public void escribirSiete(View view) {
        if(operar.equals("")) {
            num1 = Float.parseFloat(resultado.getText().toString());
            if (num1 == 0.0f) {
                resultado.setText("7");
            } else {
                resultado.setText(resultado.getText().toString() + "7");
            }
        }
        else
        {
            num2 = Float.parseFloat(resultado.getText().toString());
            if(num2 == 0.0f){
                resultado.setText("7");
            }
            else
            {
                resultado.setText(resultado.getText().toString()+"7");
            }
        }
    }
    //boton 6
    public void escribirSeis(View view) {
        if (operar.equals("")) {
            num1 = Float.parseFloat(resultado.getText().toString());
            if (num1 == 0.0f) {
                resultado.setText("6");
            } else {
                resultado.setText(resultado.getText().toString() + "6");
            }
        }
        else
        {
            num2 = Float.parseFloat(resultado.getText().toString());
            if (num2 == 0.0f) {
                resultado.setText("6");
            } else {
                resultado.setText(resultado.getText().toString() + "6");
            }
        }
    }
    //boton 5
    public void escribirCinco(View view) {
        if (operar.equals("")) {
            num1 = Float.parseFloat(resultado.getText().toString());
            if (num1 == 0.0f) {
                resultado.setText("5");
            } else {
                resultado.setText(resultado.getText().toString() + "5");
            }
        }
        else
        {
            num2 = Float.parseFloat(resultado.getText().toString());
            if(num2 == 0.0f){
                resultado.setText("5");
            }
            else
            {
                resultado.setText(resultado.getText().toString()+"5");
            }
        }
    }
    //boton 4
    public void escribirCuatro(View view) {
        if (operar.equals("")) {
            num1 = Float.parseFloat(resultado.getText().toString());
            if (num1 == 0.0f) {
                resultado.setText("4");
            } else {
                resultado.setText(resultado.getText().toString() + "4");
            }
        }
        else
        {
            num2 = Float.parseFloat(resultado.getText().toString());
            if (num2 == 0.0f) {
                resultado.setText("4");
            } else {
                resultado.setText(resultado.getText().toString() + "4");
            }
        }
    }
    //boton 3
    public void escribirTres(View view) {
        if (operar.equals("")) {
            num1 = Float.parseFloat(resultado.getText().toString());
            if (num1 == 0.0f) {
                resultado.setText("3");
            } else {
                resultado.setText(resultado.getText().toString() + "3");
            }
        }
        else
        {
            num2 = Float.parseFloat(resultado.getText().toString());
            if (num2 == 0.0f) {
                resultado.setText("3");
            } else {
                resultado.setText(resultado.getText().toString() + "3");
            }
        }
    }
    //boton 2
    public void escribirDos(View view) {
        if (operar.equals("")) {
            num1 = Float.parseFloat(resultado.getText().toString());
            if (num1 == 0.0f) {
                resultado.setText("2");
            } else {
                resultado.setText(resultado.getText().toString() + "2");
            }
        }
        else
        {
            num2 = Float.parseFloat(resultado.getText().toString());
            if (num2 == 0.0f) {
                resultado.setText("2");
            } else {
                resultado.setText(resultado.getText().toString() + "2");
            }
        }
    }
    //boton 1
    public void escribirUno(View view) {
        if (operar.equals("")) {
            num1 = Float.parseFloat(resultado.getText().toString());
            if (num1 == 0.0f) {
                resultado.setText("1");
            } else {
                resultado.setText(resultado.getText().toString() + "1");
            }
        }
        else
        {
            num2 = Float.parseFloat(resultado.getText().toString());
            if (num2 == 0.0f) {
                resultado.setText("1");
            } else {
                resultado.setText(resultado.getText().toString() + "1");
            }
        }
    }
    //boton 0
    public void escribirCero(View view) {
        if (operar.equals("")) {
            num1 = Float.parseFloat(resultado.getText().toString());
            if (num1 == 0.0f) {
                resultado.setText("0");
            } else {
                resultado.setText(resultado.getText().toString() + "0");
            }
        }
        else
        {
            num2 = Float.parseFloat(resultado.getText().toString());
            if (num2 == 0.0f) {
                resultado.setText("0");
            } else {
                resultado.setText(resultado.getText().toString() + "0");
            }
        }
    }
    //boton punto
    public void escribirPunto(View view) {
        if (operar.equals("")) {
            num1 = Float.parseFloat(resultado.getText().toString());
            if (num1 == 0.0f) {
                resultado.setText("0");
            } else {
                resultado.setText(resultado.getText().toString() + ".");
            }
        }
        else{
            num2 = Float.parseFloat(resultado.getText().toString());
            if (num2 == 0.0f) {
                resultado.setText("0");
            } else {
                resultado.setText(resultado.getText().toString() + ".");
            }
        }
    }
    //Division
    public void Division(View view) {
       if(operar!= "")
           {

               operar = "/";
           }
       else
       {
           num1 = Float.parseFloat(resultado.getText().toString());
           operar = "/";
       }
        resultado.setText("0");
        division.setBackgroundColor(Color.parseColor("#A85D05"));
        Multipli.setBackgroundColor(Color.parseColor("#E07A00"));
        suma.setBackgroundColor(Color.parseColor("#E07A00"));
        resta.setBackgroundColor(Color.parseColor("#E07A00"));
    }
    //Multiplicacion
    public void Multiplicacion(View view) {
        if(operar!= "")
        {

            operar = "*";
        }
        else
        {
            num1 = Float.parseFloat(resultado.getText().toString());
            operar = "*";
        }
        resultado.setText("0");
        division.setBackgroundColor(Color.parseColor("#E07A00"));
        Multipli.setBackgroundColor(Color.parseColor("#A85D05"));
        suma.setBackgroundColor(Color.parseColor("#E07A00"));
        resta.setBackgroundColor(Color.parseColor("#E07A00"));
    }

    //Resta
    public void Resta(View view) {
        if(operar!= "")
        {

            operar = "-";
        }
        else
        {
            num1 = Float.parseFloat(resultado.getText().toString());
            operar = "-";
        }
        resultado.setText("0");
        division.setBackgroundColor(Color.parseColor("#E07A00"));
        Multipli.setBackgroundColor(Color.parseColor("#E07A00"));
        suma.setBackgroundColor(Color.parseColor("#E07A00"));
        resta.setBackgroundColor(Color.parseColor("#A85D05"));
    }

    //Suma
    public void Suma(View view) {
        if(operar!= "")
        {

            operar = "+";
        }
        else
        {
            num1 = Float.parseFloat(resultado.getText().toString());
            operar = "+";
        }
        resultado.setText("0");
        division.setBackgroundColor(Color.parseColor("#E07A00"));
        Multipli.setBackgroundColor(Color.parseColor("#E07A00"));
        suma.setBackgroundColor(Color.parseColor("#A85D05"));
        resta.setBackgroundColor(Color.parseColor("#E07A00"));
    }

    //boton resultado
    public void Resultado(View view) {
        float result;
        num2 = Float.parseFloat(resultado.getText().toString());
        if(operar.equals("/")){
            if(num2 == 0.0f){
                Toast.makeText(this,"¡Imposible operar entre cero!",Toast.LENGTH_LONG).show();
            }
            else
            {
                result = num1 / num2;
                resultado.setText(result+"");
            }
        }
        else if(operar.equals("*"))
        {
            result = num1 * num2;
            resultado.setText(result+"");
        }
        else if(operar.equals("-"))
        {
            result = num1 - num2;
            resultado.setText(result+"");
        }
        else if(operar.equals("+"))
        {
            result = num1 + num2;
            resultado.setText(result+"");
        }
        division.setBackgroundColor(Color.parseColor("#E07A00"));
        Multipli.setBackgroundColor(Color.parseColor("#E07A00"));
        suma.setBackgroundColor(Color.parseColor("#E07A00"));
        resta.setBackgroundColor(Color.parseColor("#E07A00"));
    }

    //boton porcentaje
    public void Porcentajer(View view) {
        num1 = Float.parseFloat(resultado.getText().toString());
       float porcen = num1/100;
        resultado.setText(porcen+"");
    }

    //boton limpiar
    public void LimpiarResultado(View view) {
        resultado.setText("0");
        num1 = 0.0f;
        num2 = 0.0f;
        operar = "";
        division.setBackgroundColor(Color.parseColor("#E07A00"));
        Multipli.setBackgroundColor(Color.parseColor("#E07A00"));
        suma.setBackgroundColor(Color.parseColor("#E07A00"));
        resta.setBackgroundColor(Color.parseColor("#E07A00"));
    }
    //cambiar signo
    public void Signo(View view) {
        if (resultado.getText().toString()=="0")
        {
            resultado.setText("0");
        }
        else
        {
            if (Float.parseFloat(resultado.getText().toString()) > 0.0f){
                resultado.setText("-"+resultado.getText().toString());
            }
            else
            {
                resultado.setText(resultado.getText().toString().substring(1,resultado.length()));
            }
        }
        }
        // boton borrar
        public void borrar(View view){
        int longitudcadena = resultado.getText().toString().trim().length();

        if(longitudcadena == 1){
            resultado.setText("0");
        }
        else
        {
            resultado.setText(resultado.getText().toString().trim().substring(longitudcadena-1,longitudcadena));
        }
        }
    }

