package com.example.homefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class bachelors extends AppCompatActivity {

    private TextView text1,text2,text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bachelors);

        text1 = (TextView) findViewById(R.id.view1);
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bhActivity();

            }
        });
        text2 = (TextView) findViewById(R.id.view2);
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bhActivity();

            }
        });
        text3 = (TextView) findViewById(R.id.view3);
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bhActivity();

            }
        });
    }
    public void bhActivity() {

        Intent intent = new Intent(this, bh.class);
        startActivity(intent);
    }
}
