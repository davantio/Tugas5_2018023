package com.example.surabayavirtualtourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InfoPecel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infopecel);
    }

    public void kuliner(View view){
        Intent a = new Intent(InfoPecel.this,
                KulinerFragment.class);
        startActivity(a);
    }
}