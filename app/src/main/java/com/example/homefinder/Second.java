package com.example.homefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Second extends AppCompatActivity {

    private Button button1,button2,button3,button4,button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button1 = (Button) findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ThirdActivity();

            }
        });
        button2 = (Button) findViewById(R.id.Bachelors);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                BachelorsActivity();


            }
        });
        button3 = (Button) findViewById(R.id.Residence);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ResidenceActivity();

            }
        });
        button4 = (Button) findViewById(R.id.ConventionHalls);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CHallsActivity();

            }
        });
        button5 = (Button) findViewById(R.id.Offices);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                OfficesActivity();

            }
        });
        Toast.makeText(this,"Welcome to Home Finder", Toast.LENGTH_LONG).show();
    }

    public void ThirdActivity(){

        Intent intent = new Intent(this,Third.class);
        startActivity(intent);

    }
    public void BachelorsActivity(){

        Intent intent = new Intent(this,bachelors.class);
        startActivity(intent);

    }
    public void ResidenceActivity(){

        Intent intent = new Intent(this,Residence.class);
        startActivity(intent);

    }
    public void CHallsActivity(){

        Intent intent = new Intent(this,conventionHalls.class);
        startActivity(intent);

    }
    public void OfficesActivity(){

        Intent intent = new Intent(this,offices.class);
        startActivity(intent);

    }
}
