package com.example.homefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class of extends AppCompatActivity implements View.OnClickListener {

    ImageView OF1,OF6,OF3,OF4,OF5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_of);

        OF1 = (ImageView) findViewById(R.id.of1id);
        OF3 = (ImageView) findViewById(R.id.of3id);
        OF4 = (ImageView) findViewById(R.id.of4id);
        OF5 = (ImageView) findViewById(R.id.of5id);
        OF6 = (ImageView) findViewById(R.id.of6id);

        OF1.setOnClickListener(this);
        OF3.setOnClickListener(this);
        OF4.setOnClickListener(this);
        OF5.setOnClickListener(this);
        OF6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.of1id)
        {
            OF1.setVisibility(v.GONE);
            OF3.setVisibility(v.VISIBLE);

        }
        if(v.getId()==R.id.of3id)
        {
            OF3.setVisibility(v.GONE);
            OF4.setVisibility(v.VISIBLE);

        }
        if(v.getId()==R.id.of4id)
        {
            OF4.setVisibility(v.GONE);
            OF5.setVisibility(v.VISIBLE);

        }
        if(v.getId()==R.id.of5id)
        {
            OF5.setVisibility(v.GONE);
            OF6.setVisibility(v.VISIBLE);

        }
        if(v.getId()==R.id.of6id)
        {
            OF6.setVisibility(v.GONE);
            OF1.setVisibility(v.VISIBLE);

        }
    }
}
