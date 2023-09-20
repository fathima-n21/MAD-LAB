package com.sam.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText n1,n2,r;
    Button b1,b2,b3,b4;
    String s1,s2;
    Integer num1,num2,res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=(EditText)  findViewById(R.id.num1);
        n2=(EditText)  findViewById(R.id.num2);
        r=(EditText)  findViewById(R.id.res);
        b1=(Button) findViewById(R.id.add);
        b2=(Button) findViewById(R.id.sub);
        b3=(Button) findViewById(R.id.multi);
        b4=(Button) findViewById(R.id.div);
    }
    public void add(View v){
        num1=Integer.parseInt(String.valueOf(n1.getText()));
        num2=Integer.parseInt(String.valueOf(n2.getText()));
        res=num1+num2;
        r.setText(Integer.toString(res));
    }
    public void sub(View v){
        num1=Integer.parseInt(String.valueOf(n1.getText()));
        num2=Integer.parseInt(String.valueOf(n2.getText()));
        res=num1-num2;
        r.setText(Integer.toString(res));
    }
    public void multi(View v){
        num1=Integer.parseInt(String.valueOf(n1.getText()));
        num2=Integer.parseInt(String.valueOf(n2.getText()));
        res=num1*num2;
        r.setText(Integer.toString(res));
    }
    public void div(View v){
        num1=Integer.parseInt(String.valueOf(n1.getText()));
        num2=Integer.parseInt(String.valueOf(n2.getText()));
        res=num1/num2;
        r.setText(Integer.toString(res));
    }
}