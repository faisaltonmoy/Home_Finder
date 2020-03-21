package com.example.homefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Residence extends AppCompatActivity {

    private TextView text1,text2,text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_residence);

        text1 = (TextView) findViewById(R.id.view1);
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rsActivity();

            }
        });
        text2 = (TextView) findViewById(R.id.view2);
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rsActivity();

            }
        });
        text3 = (TextView) findViewById(R.id.view3);
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rsActivity();

            }
        });
    }
    public void rsActivity() {

        Intent intent = new Intent(this, rs.class);
        startActivity(intent);
    }
}