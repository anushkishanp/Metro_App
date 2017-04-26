package com.example.anushkishan.metro;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b4=(Button)findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        AlertDialog.Builder a = new AlertDialog.Builder(MainActivity.this);
        a.setTitle("Developers");
            a.setMessage("Name : Anush Kishan \n\nCopyright © 2017 Metrio, Inc");
        a.setIcon(R.drawable.developer);
        a.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        a.show();
            }
        });

    }
    public void showalert(View v) {
        Spinner s1 = (Spinner) findViewById(R.id.s1);
        Spinner s2 = (Spinner) findViewById(R.id.s2);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        if (s1.getSelectedItem().toString().equals(s2.getSelectedItem().toString())) {
            builder.setTitle("Wrong Selection");
            builder.setMessage("Please Re-enter Source/Destination");
            builder.setIcon(R.drawable.exc_icon);
            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            builder.show();
        }
        else
            {
            final EditText editText = (EditText) findViewById(R.id.editText);

            String x = editText.getText().toString();
            int n = Integer.parseInt(x);
            if (n == 0||n=='\0') /*{
             Toast.makeText(MainActivity.this, "Number Of Tickets Can't Be 0",
                     Toast.LENGTH_LONG).show();
         }*/ {
                AlertDialog.Builder b1 = new AlertDialog.Builder(this);
                b1.setTitle("Wrong Entry");
                b1.setMessage("Please Re-enter Number Of Tickets");
                b1.setIcon(R.drawable.exc_icon);
                b1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                b1.show();
                x = editText.getText().toString();
                n = Integer.parseInt(x);
            }
            else
            {
                int price, y = s1.getSelectedItemPosition();
                int z = s2.getSelectedItemPosition();
                int rate = 10;
                price = y - z;
                price = Math.abs(price);
                if (price <= 4)
                    price = price * rate * n;
                else {
                    price = 4;
                    price = price * rate * n;
                }
                builder.setTitle("Are You Sure");
                builder.setMessage(s1.getSelectedItem()+"  ---->  "+s2.getSelectedItem()+"\nProceed To Payment  ₹" + price);
                builder.setIcon(R.drawable.tickicon);
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent activityChangeIntent = new Intent(MainActivity.this, Main4Activity.class);
                        startActivity(activityChangeIntent);
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                builder.show();
            }
        }
    }
}


