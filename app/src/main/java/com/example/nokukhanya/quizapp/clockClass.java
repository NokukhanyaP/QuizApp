package com.example.nokukhanya.quizapp;

/**
 * Created by Nokukhanya on 2017/06/27.
 */

public class clockClass {

    private String[] clockQuestions = {"Twelve O'clock (AM)",
                                      "Twelve O'Clock (PM)",
                                      "Half past twelve (AM)",
                                      "One O'clock (PM)",
                                      "One O'Clock(AM)", "Half past four (PM)",
                                      "Five minutes past three (PM)",
                                      "Quarter past six (AM)", "Quarter to Eight (PM)",
                                       "10 minutes to Nine (AM)"};


    public clockClass() {
        super();
    }

    public String getClockQuestions(int x) {

        String clockQuestion = clockQuestions[x];
        return clockQuestion;

    }
}
