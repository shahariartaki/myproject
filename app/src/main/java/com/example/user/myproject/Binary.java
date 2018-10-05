package com.example.user.myproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Binary extends AppCompatActivity {

    EditText decimal,hex_decimal,octal,binary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binary);
        decimal=findViewById(R.id.etdecimal);
        hex_decimal=findViewById(R.id.ethexdecimaal);
        octal=findViewById(R.id.etoctal);
        binary=findViewById(R.id.etbainary);


    }
}
