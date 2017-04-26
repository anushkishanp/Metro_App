package com.example.anushkishan.metro;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Button r = (Button) findViewById(R.id.but2);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Spinner s = (Spinner) findViewById(R.id.spinner2);
                if (s.getSelectedItem().equals("Paytm")) {

                    Intent a = new Intent(Main4Activity.this, Main2Activity.class);
                    startActivity(a);
                }
                else
                {
                    Toast.makeText(Main4Activity.this, "Sorry For The Inconvenience. The Site Is Under Construction",
                            Toast.LENGTH_LONG).show();

                }
            }
        });
    }
}
