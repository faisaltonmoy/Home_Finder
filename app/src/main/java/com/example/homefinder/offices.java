package com.example.homefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class offices extends AppCompatActivity {

    private TextView text1,text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offices);

        text1 = (TextView) findViewById(R.id.view1);
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ofActivity();

            }
        });
        text2 = (TextView) findViewById(R.id.view2);
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ofActivity();

            }
        });
    }
    public void ofActivity() {

        Intent intent = new Intent(this, of.class);
        startActivity(intent);
    }
}
