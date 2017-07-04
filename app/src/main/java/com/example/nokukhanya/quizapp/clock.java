package com.example.nokukhanya.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static android.os.Build.VERSION_CODES.M;

public class clock extends AppCompatActivity implements View.OnClickListener {

    public RadioGroup Group01, Group02, Group03, Group04, Group05, Group06, Group07, Group08, Group09, Group010;
    private TextView question01, question02, question03, question04, question05, question06, question07, question08, question09, question010;

    int clockScore = 0;

    public Button WatchScore;
    private Button clockSolutins;

    Intent i;

    clockClass clock = new clockClass();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clock);

        Group01 = (RadioGroup) findViewById(R.id.grouOnee);
        Group02 = (RadioGroup) findViewById(R.id.grouptwoo);
        Group03 = (RadioGroup) findViewById(R.id.groupThreee);
        Group04 = (RadioGroup) findViewById(R.id.groupFourr);
        Group05 = (RadioGroup) findViewById(R.id.groupFivee);
        Group06 = (RadioGroup) findViewById(R.id.groupSixx);
        Group07 = (RadioGroup) findViewById(R.id.groupSevenn);
        Group08 = (RadioGroup) findViewById(R.id.groupEightt);
        Group09 = (RadioGroup) findViewById(R.id.groupNinee);
        Group010 = (RadioGroup) findViewById(R.id.groupTenn);

        WatchScore = (Button) findViewById(R.id.btnWatchScore);
        WatchScore.setOnClickListener(this);

        clockSolutins=(Button)findViewById(R.id.btnClockSolutions);
        clockSolutins.setOnClickListener(this);

        question01 = (TextView) findViewById(R.id.textView01);
        question02 = (TextView) findViewById(R.id.textView02);
        question03 = (TextView) findViewById(R.id.textView03);
        question04 = (TextView) findViewById(R.id.textView04);
        question05 = (TextView) findViewById(R.id.textView05);
        question06 = (TextView) findViewById(R.id.textView06);
        question07 = (TextView) findViewById(R.id.textView07);
        question08 = (TextView) findViewById(R.id.textView08);
        question09 = (TextView) findViewById(R.id.textView09);
        question010 = (TextView) findViewById(R.id.textView010);

        question01.setText(clock.getClockQuestions(0));
        question02.setText(clock.getClockQuestions(1));
        question03.setText(clock.getClockQuestions(2));
        question04.setText(clock.getClockQuestions(3));
        question05.setText(clock.getClockQuestions(4));
        question06.setText(clock.getClockQuestions(5));
        question07.setText(clock.getClockQuestions(6));
        question08.setText(clock.getClockQuestions(7));
        question09.setText(clock.getClockQuestions(8));
        question010.setText(clock.getClockQuestions(9));
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btnWatchScore) {


            int group01Id = Group01.getCheckedRadioButtonId();
            if (group01Id == R.id.rad01) {
                clockScore = clockScore + 1;

            }

            int group02Id = Group02.getCheckedRadioButtonId();
            if (group02Id == R.id.rad05) {
                clockScore = clockScore + 1;

            }
            int group03Id = Group03.getCheckedRadioButtonId();
            if (group03Id == R.id.rad07)

            {
                clockScore = clockScore + 1;
            }

            int group04Id = Group04.getCheckedRadioButtonId();
            if (group04Id == R.id.rad09)

            {
                clockScore = clockScore + 1;
            }

            int group05Id = Group05.getCheckedRadioButtonId();
            if (group05Id == R.id.rad011)

            {
                clockScore = clockScore + 1;
            }
            int group06Id = Group06.getCheckedRadioButtonId();
            if (group06Id == R.id.rad013)

            {
                clockScore = clockScore + 1;
            }
            int group07Id = Group07.getCheckedRadioButtonId();
            if (group07Id == R.id.rad014)

            {
                clockScore = clockScore + 1;
            }
            int group08Id = Group08.getCheckedRadioButtonId();
            if (group08Id == R.id.rad016)

            {
                clockScore = clockScore + 1;
            }
            int group09Id = Group09.getCheckedRadioButtonId();
            if (group09Id == R.id.rad019)

            {
                clockScore = clockScore + 1;
            }
            int group010Id = Group010.getCheckedRadioButtonId();
            if (group010Id == R.id.rad021)

            {
                clockScore = clockScore + 1;
            }

          if (clockScore>=10)

            Toast.makeText(clock.this,"NICE...Score:"+ clockScore, Toast.LENGTH_LONG).show();
            else {
              Toast.makeText(clock.this, "Score:" + clockScore, Toast.LENGTH_LONG).show();
          }
          clockScore =0;

            clockSolutins.setVisibility(View.VISIBLE);

        }

        if (v.getId() == R.id.btnClockSolutions) {

            i = new Intent(clock.this, MEMO.class);
            startActivity(i);
        }

    }
}




