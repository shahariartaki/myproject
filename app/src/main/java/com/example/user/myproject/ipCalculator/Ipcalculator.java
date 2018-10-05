package com.example.user.myproject.ipCalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.example.user.myproject.R;

public class Ipcalculator extends AppCompatActivity {
    EditText editText,editText1,editText2,editText3,editText4;

    int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipcalculator);
        editText=findViewById(R.id.editText);
        editText1=findViewById(R.id.editText3);
        editText2=findViewById(R.id.editText4);
        editText3=findViewById(R.id.editText5);
        editText4=findViewById(R.id.editText6);


    }
}
