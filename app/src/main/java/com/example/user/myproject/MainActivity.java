package com.example.user.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.user.myproject.ipCalculator.Ipcalculator;
import com.example.user.myproject.teacher.Main2Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Clickforstudent(View view) {

    }

    public void teacherf(View view) {
        Intent intent =new Intent(MainActivity.this,Main2Activity.class);
        startActivity(intent);
    }

    public void OpenIPCalulator(View view) {
        Intent intent= new Intent(MainActivity.this,Ipcalculator.class);
        startActivity(intent);
    }

    public void binary(View view) {
        Intent intent= new Intent(MainActivity.this,Binary.class);
        startActivity(intent);
    }
}
