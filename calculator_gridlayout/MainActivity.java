package com.sam.calculator_grid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    boolean op=true;
    String opr ="+";
    String old="";
    EditText number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number=(EditText)findViewById(R.id.number);
    }
    public void NumberEvent(View view){
        if(op){
            number.setText("");
        }
        op=false;
        String num=number.getText().toString();
        switch(view.getId()){
            case R.id.b1:
                num+="1";
                break;
            case R.id.b2:
                num+="2";
                break;
            case R.id.b3:
                num+="3";
                break;
            case R.id.b4:
                num+="4";
                break;
            case R.id.b5:
                num+="5";
                break;
            case R.id.b6:
                num+="6";
                break;
            case R.id.b7:
                num+="7";
                break;
            case R.id.b8:
                num+="8";
                break;
            case R.id.b9:
                num+="9";
                break;
            case R.id.b0:
                num+="0";
                break;
            case R.id.clr:
                num="";
                break;
        }
        number.setText(num);
    }
    public void OperatorEvent(View view){
        op=true;
        old=number.getText().toString();
        switch(view.getId()){
            case R.id.add:
                opr="+";
                break;
            case R.id.sub:
                opr="-";
                break;
            case R.id.multi:
                opr="*";
                break;
            case R.id.div:
                opr="/";
                break;
        }
    }
    public void EqualEvent(View view){
        String newNumber=number.getText().toString();
        double res=0.0;
        switch(opr){
            case "+":
                res=Double.parseDouble(old)+Double.parseDouble(newNumber);
                break;
            case "-":
                res=Double.parseDouble(old)-Double.parseDouble(newNumber);
                break;
            case "*":
                res=Double.parseDouble(old)*Double.parseDouble(newNumber);
                break;
            case "/":
                res=Double.parseDouble(old)/Double.parseDouble(newNumber);
                break;
        }
        number.setText(res+"");
    }
}