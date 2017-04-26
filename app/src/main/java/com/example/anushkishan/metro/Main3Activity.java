package com.example.anushkishan.metro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        long number = (long) Math.floor(Math.random() * 9999999999L); //+ 1000000000L;
        TextView t1=(TextView)findViewById(R.id.textView6);
        t1.setText(String.valueOf(number));
    }
}
