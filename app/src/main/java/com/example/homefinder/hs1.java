package com.example.homefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hs1 extends AppCompatActivity implements View.OnClickListener {

    ImageView HS1,HS2,HS3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hs1);

        HS1 = (ImageView) findViewById(R.id.hs1id);
        HS2 = (ImageView) findViewById(R.id.hs2id);
        HS3 = (ImageView) findViewById(R.id.hs3id);

        HS1.setOnClickListener(this);
        HS2.setOnClickListener(this);
        HS3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.hs1id)
        {
         HS1.setVisibility(v.GONE);
         HS2.setVisibility(v.VISIBLE);

        }
        if(v.getId()==R.id.hs2id)
        {
            HS2.setVisibility(v.GONE);
            HS3.setVisibility(v.VISIBLE);

        }
        if(v.getId()==R.id.hs3id)
        {
            HS3.setVisibility(v.GONE);
            HS1.setVisibility(v.VISIBLE);

        }
    }
}
