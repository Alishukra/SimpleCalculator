package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button addbtn,minusbtn,timesbtn,modulbnt,powerbtn,dividebtn;
    EditText firstNo,secondNo;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //my code start here
        firstNo=(EditText)findViewById(R.id.fnumber);
        secondNo=(EditText)findViewById(R.id.snumber);
        result=(TextView)findViewById(R.id.display);
        //add button
        addbtn= (Button)findViewById(R.id.plus);
        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int fno= Integer.parseInt(firstNo.getText().toString());
                int sno=Integer.parseInt(secondNo.getText().toString());
                int total = fno+sno;
                result.setText(String.valueOf(total));
            }
        });
        //minus button
        minusbtn=(Button)findViewById(R.id.minus);
        minusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int fno=Integer.parseInt(firstNo.getText().toString());
                int sno=Integer.parseInt(secondNo.getText().toString());
                int total= fno-sno;
                result.setText(String.valueOf(total));
            }
        });
        //times button
        timesbtn=(Button)findViewById(R.id.times);
        timesbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int fno=Integer.parseInt(firstNo.getText().toString());
                int sno=Integer.parseInt(secondNo.getText().toString());
                int total= fno*sno;
                result.setText(String.valueOf(total));
            }
        });
        //moduller division button
        modulbnt=(Button)findViewById(R.id.moduler);
        modulbnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int fno=Integer.parseInt(firstNo.getText().toString());
                int sno=Integer.parseInt(secondNo.getText().toString());
                int total= fno%sno;
                result.setText(String.valueOf(total));
            }
        });
        //power button
        powerbtn=(Button)findViewById(R.id.power);
        powerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int fno=Integer.parseInt(firstNo.getText().toString());
                int sno=Integer.parseInt(secondNo.getText().toString());
                int total= ((int)Math.pow(fno,sno));
                result.setText(String.valueOf(total));
            }
        });
        //divide button
        dividebtn=(Button)findViewById(R.id.divide);
        dividebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int fno=Integer.parseInt(firstNo.getText().toString());
                int sno=Integer.parseInt(secondNo.getText().toString());
                int total= fno/sno;
                result.setText(String.valueOf(total));
            }
        });

    }
}