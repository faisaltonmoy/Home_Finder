package com.example.homefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Third extends AppCompatActivity {

    private TextView text1,text2,text3,text4,text5,text11,text12,text13,text14,text15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        text1 = (TextView) findViewById(R.id.view1);
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                hsActivity();

            }
        });
        text2 = (TextView) findViewById(R.id.view2);
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                hsActivity();

            }
        });
        text3 = (TextView) findViewById(R.id.view3);
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                hsActivity();

            }
        });
        text4 = (TextView) findViewById(R.id.view4);
        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                hsActivity();

            }
        });
        text5 = (TextView) findViewById(R.id.view5);
        text5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                hsActivity();

            }
        });
        text11 = (TextView) findViewById(R.id.view11);
        text11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HSActivity();

            }
        });
        text12 = (TextView) findViewById(R.id.view12);
        text12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HSActivity();

            }
        });text13 = (TextView) findViewById(R.id.view13);
        text13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HSActivity();

            }
        });text14 = (TextView) findViewById(R.id.view14);
        text14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HSActivity();

            }
        });text15 = (TextView) findViewById(R.id.view15);
        text15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HSActivity();

            }
        });



    }

         public void hsActivity() {

             Intent intent = new Intent(this, hs1.class);
             startActivity(intent);
         }

        public void HSActivity(){

            Intent intent1 = new Intent(this,hs2.class);
            startActivity(intent1);

    }
}

