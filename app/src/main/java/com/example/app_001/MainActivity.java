package com.example.app_001;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  private EditText et_01;
  private EditText et_02;
  private TextView tv_01;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // obtener las referencias de las vistas (controles) dle layout
        et_01=findViewById(R.id.editTextNumber1);
        et_02= findViewById(R.id.editTextText2);
        tv_01= findViewById(R.id.textView4);
    }



    public void click_buttonSumar(View view){
        String numerouno= et_01.getText().toString();
        String numerodos= et_02.getText().toString();
        int uno = Integer.parseInt(numerouno);
        int dos= Integer.parseInt(numerodos);

        int suma= uno+dos;
        tv_01.setText(String.valueOf(suma));
    }
    public void click_buttonRestar(View view){
        String numerouno= et_01.getText().toString();
        String numerodos= et_02.getText().toString();
        int uno = Integer.parseInt(numerouno);
        int dos= Integer.parseInt(numerodos);

        int suma= uno-dos;
        tv_01.setText(String.valueOf(suma));
    }
    public void click_buttonMultiplicar(View view){
        String numerouno= et_01.getText().toString();
        String numerodos= et_02.getText().toString();
        int uno = Integer.parseInt(numerouno);
        int dos= Integer.parseInt(numerodos);

        int suma= uno*dos;
        tv_01.setText(String.valueOf(suma));
    }
    public void click_buttonDividir(View view){
        String numerouno= et_01.getText().toString();
        String numerodos= et_02.getText().toString();
        int uno = Integer.parseInt(numerouno);
        int dos= Integer.parseInt(numerodos);

        double suma= uno/dos;
        tv_01.setText(String.valueOf(suma));
    }
    public void click_buttonPotencia(View view){
        String numerouno= et_01.getText().toString();
        String numerodos= et_02.getText().toString();
        int uno = Integer.parseInt(numerouno);
        int dos= Integer.parseInt(numerodos);

        double suma= Math.pow(uno,dos);
        tv_01.setText(String.valueOf(suma));
    }
    public void click_buttonFactorial(View view){
        String numerouno= et_01.getText().toString();
        String numerodos= et_02.getText().toString();
        int uno = Integer.parseInt(numerouno);
        int dos= Integer.parseInt(numerodos);

        int suma= uno%dos;
        tv_01.setText(String.valueOf(suma));
    }
}