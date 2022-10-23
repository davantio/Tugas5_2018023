package com.example.surabayavirtualtourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RekomPecel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rekompecel);
    }

    public void kuliner(View view){
        Intent a = new Intent(RekomPecel.this,
                MainActivity.class);
        startActivity(a);
    }
}