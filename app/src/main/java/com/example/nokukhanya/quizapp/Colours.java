package com.example.nokukhanya.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;
import static android.os.Build.VERSION_CODES.M;
import static com.example.nokukhanya.quizapp.R.id.BtnColourSolutins;
import static com.example.nokukhanya.quizapp.R.id.btnClockSolutions;
import static com.example.nokukhanya.quizapp.R.id.buttonScore;

public class Colours extends AppCompatActivity implements View.OnClickListener {

    public RadioGroup Group1, Group2, Group3, Group4, Group5;
    private TextView question1, question2, question3, question4, question5;

    int score = 0;
    Intent i;

    public Button btnScore;
    public Button ColourSolutions;
    ColourClass color = new ColourClass();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_colours);

        Group1 = (RadioGroup) findViewById(R.id.groupOne);
        Group2 = (RadioGroup) findViewById(R.id.groupTwo);
        Group3 = (RadioGroup) findViewById(R.id.groupThree);
        Group4 = (RadioGroup) findViewById(R.id.groupFour);
        Group5 = (RadioGroup) findViewById(R.id.groupFive);

        btnScore = (Button) findViewById(buttonScore);
        btnScore.setOnClickListener(this);

        ColourSolutions = (Button) findViewById(BtnColourSolutins);
        ColourSolutions.setOnClickListener(this);


        question1 = (TextView) findViewById(R.id.textView1);
        question2 = (TextView) findViewById(R.id.textView2);
        question3 = (TextView) findViewById(R.id.textView3);
        question4 = (TextView) findViewById(R.id.textView4);
        question5 = (TextView) findViewById(R.id.textView5);


        question1.setText(color.getQuestions(0));
        question2.setText(color.getQuestions(1));
        question3.setText(color.getQuestions(2));
        question4.setText(color.getQuestions(3));
        question5.setText(color.getQuestions(4));

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == buttonScore) {


            int group1Id = Group1.getCheckedRadioButtonId();

            if (group1Id == R.id.Rad3) {
                score = score + 1;

            }

            int group2Id = Group2.getCheckedRadioButtonId();
            if (group2Id == R.id.rad6) {
                score = score + 1;

            }
            int group3Id = Group3.getCheckedRadioButtonId();
            if (group3Id == R.id.rad7)

            {
                score = score + 1;
            }

            int group4Id = Group4.getCheckedRadioButtonId();
            if (group4Id == R.id.rad12)

            {
                score = score + 1;
            }

            int group5Id = Group5.getCheckedRadioButtonId();
            if (group5Id == R.id.rad14)

            {
                score = score + 1;
            }

            if (score >= 5)

                Toast.makeText(Colours.this, "WOW YOU MADE IT....Score:" + score, Toast.LENGTH_LONG).show();
            else {

                Toast.makeText(Colours.this, "Score:" + score, Toast.LENGTH_LONG).show();
            }
            score = 0;


            ColourSolutions.setVisibility(View.VISIBLE);

        }


        if (v.getId() == BtnColourSolutins) {

            i = new Intent(Colours.this, colourMemo.class);
            startActivity(i);

        }
    }
}




