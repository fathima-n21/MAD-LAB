package com.sam.facebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText email;
    EditText pass;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email=(EditText) findViewById(R.id.email);
        pass=(EditText) findViewById(R.id.pass);
        btn1=(Button) findViewById(R.id.btn1);
    }

    public void clickme(View view){
        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
        String str=email.getText().toString();
        intent.putExtra("email",str);
        startActivity(intent);
    }
}