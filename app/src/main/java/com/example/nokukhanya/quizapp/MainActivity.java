package com.example.nokukhanya.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
  private Button colours,clock;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colours=(Button)findViewById(R.id.buttonColours);
        clock=(Button)findViewById(R.id.buttonClock);
        colours.setOnClickListener(this);
        clock.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonColours) {

             i = new Intent(MainActivity.this, Colours.class);
            startActivity(i);
        }

        if (v.getId() == R.id.buttonClock) {
             i = new Intent(MainActivity.this, clock.class);
            startActivity(i);

        }
    }
}



