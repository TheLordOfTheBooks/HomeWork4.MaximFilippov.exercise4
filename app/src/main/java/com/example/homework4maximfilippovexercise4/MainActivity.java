package com.example.homework4maximfilippovexercise4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bn;
    int n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bn=(Button) findViewById(R.id.clickMe);

    }



    public void go(View view) {
        n+=1;
        if (n!=7)
            bn.setText("This is a click number:"+ n);
        else {
            n = 0;
            bn.setText("BOOM!");
        }
    }
}