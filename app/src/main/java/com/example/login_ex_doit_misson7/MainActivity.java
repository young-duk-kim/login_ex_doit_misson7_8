package com.example.login_ex_doit_misson7;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 200 && resultCode == 101){
            Toast.makeText(getApplicationContext(),"고객관리",Toast.LENGTH_LONG).show();
        }
        else if(requestCode == 200 && resultCode == 102){
            Toast.makeText(getApplicationContext(),"매출관리",Toast.LENGTH_LONG).show();
        }
        else if(requestCode == 200 && resultCode == 103){
            Toast.makeText(getApplicationContext(),"상품관리",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(getApplicationContext(),"에러",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.login_button);
        Intent intent = new Intent(this, MainActivity2.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(intent,200);
            }
        });
    }
}