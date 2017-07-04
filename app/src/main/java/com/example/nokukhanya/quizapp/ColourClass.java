package com.example.nokukhanya.quizapp;

/**
 * Created by Nokukhanya on 2017/06/23.
 */

public class ColourClass {

    private String[] questions={"1.Which of the following are PRIMARY COLOURS?",
                                "2.Which Primary colours makes colour GREEN when mixed together?",
                                "3.Which Primary colours makes colour ORANGE when mixed together?",
                                "4.Which Primary colours makes colour VIOLET when mixed together?",
                                "5.Which of the folllowing colors are SECONDARY COLOURS?"};

    public ColourClass() {
        super();
    }


    public String getQuestions(int x) {

        String question = questions[x];
        return question;
    }

    }

