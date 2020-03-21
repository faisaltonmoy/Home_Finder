package com.example.homefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hs2 extends AppCompatActivity implements View.OnClickListener {

    ImageView HS4,HS5,HS6,HS7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hs2);

        HS4 = (ImageView) findViewById(R.id.hs4id);
        HS5 = (ImageView) findViewById(R.id.hs5id);
        HS6 = (ImageView) findViewById(R.id.hs6id);
        HS7 = (ImageView) findViewById(R.id.hs7id);

        HS4.setOnClickListener(this);
        HS5.setOnClickListener(this);
        HS6.setOnClickListener(this);
        HS7.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.hs4id)
        {
            HS4.setVisibility(v.GONE);
            HS5.setVisibility(v.VISIBLE);

        }
        if(v.getId()==R.id.hs5id)
        {
            HS5.setVisibility(v.GONE);
            HS6.setVisibility(v.VISIBLE);

        }
        if(v.getId()==R.id.hs6id)
        {
            HS6.setVisibility(v.GONE);
            HS7.setVisibility(v.VISIBLE);

        }
        if(v.getId()==R.id.hs7id)
        {
            HS7.setVisibility(v.GONE);
            HS4.setVisibility(v.VISIBLE);

        }
    }
}
