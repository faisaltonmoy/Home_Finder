package com.example.homefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class rs extends AppCompatActivity implements View.OnClickListener {

    ImageView RS1,RS2,RS3,RS4,RS5,RS6,RS7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rs);

        RS1 = (ImageView) findViewById(R.id.rs1id);
        RS2 = (ImageView) findViewById(R.id.rs2id);
        RS3 = (ImageView) findViewById(R.id.rs3id);
        RS4 = (ImageView) findViewById(R.id.rs4id);
        RS5 = (ImageView) findViewById(R.id.rs5id);
        RS6 = (ImageView) findViewById(R.id.rs6id);
        RS7 = (ImageView) findViewById(R.id.rs7id);

        RS1.setOnClickListener(this);
        RS2.setOnClickListener(this);
        RS3.setOnClickListener(this);
        RS4.setOnClickListener(this);
        RS5.setOnClickListener(this);
        RS6.setOnClickListener(this);
        RS7.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.rs1id)
        {
            RS1.setVisibility(v.GONE);
            RS2.setVisibility(v.VISIBLE);

        }
        if(v.getId()==R.id.rs2id)
        {
            RS2.setVisibility(v.GONE);
            RS3.setVisibility(v.VISIBLE);

        }
        if(v.getId()==R.id.rs3id)
        {
            RS3.setVisibility(v.GONE);
            RS4.setVisibility(v.VISIBLE);

        }
        if(v.getId()==R.id.rs4id)
        {
            RS4.setVisibility(v.GONE);
            RS5.setVisibility(v.VISIBLE);

        }
        if(v.getId()==R.id.rs5id)
        {
            RS5.setVisibility(v.GONE);
            RS6.setVisibility(v.VISIBLE);

        }
        if(v.getId()==R.id.rs6id)
        {
            RS6.setVisibility(v.GONE);
            RS7.setVisibility(v.VISIBLE);

        }
        if(v.getId()==R.id.rs7id)
        {
            RS7.setVisibility(v.GONE);
            RS1.setVisibility(v.VISIBLE);

        }
    }
}
