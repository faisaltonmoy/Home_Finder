package com.example.homefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class conventionHalls extends AppCompatActivity {

    private TextView text1,text2,text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convention_halls);

        text1 = (TextView) findViewById(R.id.view1);
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                chActivity();

            }
        });

    }
    public void chActivity() {

        Intent intent = new Intent(this, ch.class);
        startActivity(intent);
    }
}