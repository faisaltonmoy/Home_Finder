package com.example.homefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    private Button button;
    private EditText name,email,phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.Start);
        name = (EditText) findViewById(R.id.nameid);
        email = (EditText) findViewById(R.id.emailid);
        phone = (EditText) findViewById(R.id.phoneid);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String value1=name.getText().toString();
                String value2=email.getText().toString();
                String value3=phone.getText().toString();
                if(!value1.isEmpty() && !value2.isEmpty() && !value3.isEmpty()){

                    secondActivity();

                }else if (value1.isEmpty() || value2.isEmpty() || value3.isEmpty()){

                    Toast toast=Toast.makeText(MainActivity.this,"Please fill up the info",Toast.LENGTH_SHORT);
                    toast.show();

                }
            }




        });

    }
    public void secondActivity(){

        Intent intent = new Intent(this,Second.class);
        startActivity(intent);
        finish();

    }

}
