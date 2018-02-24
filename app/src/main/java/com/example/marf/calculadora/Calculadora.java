package com.example.marf.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculadora extends AppCompatActivity implements View.OnClickListener{

    int operation = 0;
    String antiguonum;
    String antiguonum2;
    String antiguonum3;
    String antiguonum4;
    String numnuevo;
    float resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        //cambio de git
        Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17;
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn10 = (Button) findViewById(R.id.btn10);
        btn11 = (Button) findViewById(R.id.btn11);
        btn12 = (Button) findViewById(R.id.btn12);
        btn13 = (Button) findViewById(R.id.btn13);
        btn14 = (Button) findViewById(R.id.btn14);
        btn15 = (Button) findViewById(R.id.btn15);
        btn16 = (Button) findViewById(R.id.btn16);
        btn17 = (Button) findViewById(R.id.btn17);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);
        btn13.setOnClickListener(this);
        btn14.setOnClickListener(this);
        btn15.setOnClickListener(this);
        btn16.setOnClickListener(this);
        btn17.setOnClickListener(this);

        TextView tvHello = (TextView) findViewById(R.id.txtr);
        tvHello.setText("");
    }

    @Override
    public void onClick(View v){
        TextView tvHello = (TextView) findViewById(R.id.txtr);
        switch (v.getId()) {
            case R.id.btn1:
                tvHello.setText(tvHello.getText()+"1");
                break;
            case R.id.btn2:
                tvHello.setText(tvHello.getText()+"2");
                break;
            case R.id.btn3:
                tvHello.setText(tvHello.getText()+"3");
                break;
            case R.id.btn4:
                tvHello.setText(tvHello.getText()+"4");
                break;
            case R.id.btn5:
                tvHello.setText(tvHello.getText()+"5");
                break;
            case R.id.btn6:
                tvHello.setText(tvHello.getText()+"6");
                break;
            case R.id.btn7:
                tvHello.setText(tvHello.getText()+"7");
                break;
            case R.id.btn8:
                tvHello.setText(tvHello.getText()+"8");
                break;
            case R.id.btn9:
                tvHello.setText(tvHello.getText()+"9");
                break;
            case R.id.btn10:
                tvHello.setText(tvHello.getText()+"0");
                break;
            case R.id.btn11:
                antiguonum = tvHello.getText().toString();
                tvHello.setText("");
                operation = 1;
                break;
            case R.id.btn12:
                antiguonum2 = tvHello.getText().toString();
                tvHello.setText("");
                operation = 2;
                break;
            case R.id.btn13:
                antiguonum3 = tvHello.getText().toString();
                tvHello.setText("");
                operation = 3;
                break;
            case R.id.btn14:
                antiguonum4 = tvHello.getText().toString();
                tvHello.setText("");
                operation = 4;
                break;
            case R.id.btn15:
                numnuevo = tvHello.getText().toString();
                tvHello.setText("");
                if(operation == 1) {
                    resultado = Float.parseFloat(antiguonum) + Float.parseFloat(numnuevo);
                }else if(operation == 2) {
                    resultado = Float.parseFloat(antiguonum2) - Float.parseFloat(numnuevo);
                }else if(operation == 3) {
                    resultado = Float.parseFloat(antiguonum3) / Float.parseFloat(numnuevo);
                }else if(operation == 4) {
                    resultado = Float.parseFloat(antiguonum4) * Float.parseFloat(numnuevo);
                }
                tvHello.setText(resultado+"");
                break;
            case R.id.btn16:
                tvHello.setText("");
                break;
            case R.id.btn17:
                tvHello.setText("");
                break;
        }
    }
}
