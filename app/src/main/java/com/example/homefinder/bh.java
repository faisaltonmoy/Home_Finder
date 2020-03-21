package com.example.homefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class bh extends AppCompatActivity implements View.OnClickListener {

    ImageView BA1,BA2,BA3,BA4,BA5,BA6,BA7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bh);

        BA1 = (ImageView) findViewById(R.id.ba1id);
        BA2 = (ImageView) findViewById(R.id.ba2id);
        BA3 = (ImageView) findViewById(R.id.ba3id);
        BA4 = (ImageView) findViewById(R.id.ba4id);
        BA5 = (ImageView) findViewById(R.id.ba5id);
        BA6 = (ImageView) findViewById(R.id.ba6id);
        BA7 = (ImageView) findViewById(R.id.ba7id);

        BA1.setOnClickListener(this);
        BA2.setOnClickListener(this);
        BA3.setOnClickListener(this);
        BA4.setOnClickListener(this);
        BA5.setOnClickListener(this);
        BA6.setOnClickListener(this);
        BA7.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.ba1id)
        {
            BA1.setVisibility(v.GONE);
            BA2.setVisibility(v.VISIBLE);

        }
        if(v.getId()==R.id.ba2id)
        {
            BA2.setVisibility(v.GONE);
            BA3.setVisibility(v.VISIBLE);

        }
        if(v.getId()==R.id.ba3id)
        {
            BA3.setVisibility(v.GONE);
            BA4.setVisibility(v.VISIBLE);

        }
        if(v.getId()==R.id.ba4id)
        {
            BA4.setVisibility(v.GONE);
            BA5.setVisibility(v.VISIBLE);

        }
        if(v.getId()==R.id.ba5id)
        {
            BA5.setVisibility(v.GONE);
            BA6.setVisibility(v.VISIBLE);

        }
        if(v.getId()==R.id.ba6id)
        {
            BA6.setVisibility(v.GONE);
            BA7.setVisibility(v.VISIBLE);

        }
        if(v.getId()==R.id.ba7id)
        {
            BA7.setVisibility(v.GONE);
            BA1.setVisibility(v.VISIBLE);

        }
    }
}
