package com.example.homefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ch extends AppCompatActivity implements View.OnClickListener {

    ImageView CH1,CH2,CH3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch);

        CH1 = (ImageView) findViewById(R.id.ch1id);
        CH2 = (ImageView) findViewById(R.id.ch2id);
        CH3 = (ImageView) findViewById(R.id.ch3id);


        CH1.setOnClickListener(this);
        CH2.setOnClickListener(this);
        CH3.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.ch1id)
        {
            CH1.setVisibility(v.GONE);
            CH2.setVisibility(v.VISIBLE);

        }
        if(v.getId()==R.id.ch2id)
        {
            CH2.setVisibility(v.GONE);
            CH3.setVisibility(v.VISIBLE);

        }
        if(v.getId()==R.id.ch3id)
        {
            CH3.setVisibility(v.GONE);
            CH1.setVisibility(v.VISIBLE);

        }

    }
}