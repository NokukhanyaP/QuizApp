package com.example.nokukhanya.quizapp;

import static android.R.attr.x;

/**
 * Created by Nokukhanya on 2017/06/28.
 */

public class memoClass {

    private String[] colourAnswers = {"1.Blue,Yellow and Red",
            "2.BLue and Yellow",
            "3.Yellow and Red",
            "4.Blue and Red",
            "5.Green,Orange and Violet"};

    private String[] clockAnswers = {"1.00:00(AM)",
            "2.12:00 (PM)",
            "3.00:30 (AM)",
            "4.13:00 (PM)",
            "5.01:00(AM)",
            "6.16:30 (PM)",
            "7.13:05 (PM)",
            "8.06:15 (AM)",
            "9.19:45 (PM)",
            "10.08:50 (AM)"};

    public memoClass() {
        super();
    }

    public String getColourAnswers(int x) {

        String colourAnswer = colourAnswers[x];
        return colourAnswer;
    }

    public String getClockAnswers(int x) {

        String clockAnswer = clockAnswers[x];

        return clockAnswer;

    }
}




