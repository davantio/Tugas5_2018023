package com.example.surabayavirtualtourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void infopecel(View view){
        Intent a = new Intent(MainActivity.this,
                InfoPecel.class);
        startActivity(a);
    }

    public void rekompecel(View view){
        Intent a = new Intent(MainActivity.this,
                RekomPecel.class);
        startActivity(a);
    }
}