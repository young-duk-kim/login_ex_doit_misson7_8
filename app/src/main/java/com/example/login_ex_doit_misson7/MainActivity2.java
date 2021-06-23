package com.example.login_ex_doit_misson7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        intent = new Intent();
    }

    public void button1_clicked(View v){
        setResult(101,intent);
        finish();
    }

    public void button2_clicked(View v){
        setResult(102,intent);
        finish();
    }

    public void button3_clicked(View v){
        setResult(103,intent);
        finish();
    }
}