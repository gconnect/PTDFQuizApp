package com.example.gconnect.icanquizapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import gconnect.startpage.MainActivity2;

public class MainActivity extends AppCompatActivity {
    // Declaring variables for Question
    // Question 1
    RadioButton question1_choice3;
    // Question 2
    EditText question2_answer;
    // Question 3
    CheckBox question3_choice1;
    CheckBox question3_choice2;
    CheckBox question3_choice3;
    CheckBox question3_choice4;
    // Question 4
    EditText question4_answer;
    // Question 5
    RadioButton question5_choice2;
    // Question 6
    EditText question6_answer;
    // Question 7
    CheckBox question7_choice1;
    CheckBox question7_choice2;
    CheckBox question7_choice3;
    CheckBox question7_choice4;
    // Question 8
    EditText question8_answer;
    // Question 9
    RadioButton question9_choice1;
    // Question 10
    EditText question10_answer;

// Declaring variables for answers
    int answer1_score;
    int answer2_score;
    int answer3_score;
    int answer4_score;
    int answer5_score;
    int answer6_score;
    int answer7_score;
    int answer8_score;
    int answer9_score;
    int answer10_score;
    int final_score;
    Button take_another_quiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Hide the keyboard
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_main);
        take_another_quiz = (Button) findViewById(R.id.take_another_quiz);
    }
    public void restart_quiz (View view){
        Intent i= new Intent (this, MainActivity2.class);
        startActivity(i);
    }


    public void submitAnswers(View view) {
        CharSequence resultsDisplay;



        //------------------------------------------------------------------------------------------
        // Question 1 - Correct Answer is choice_3 (Mary Slessor)
        //------------------------------------------------------------------------------------------
        Boolean answer1;
        question1_choice3 = (RadioButton) findViewById(R.id.question1_choice3);
        answer1 = question1_choice3.isChecked();
        if (answer1) {
            answer1_score = 1;
        } else {
            answer1_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question 2 - Correct Answer is "Nepal or China"
        //------------------------------------------------------------------------------------------
        String answer2;
        question2_answer = (EditText) findViewById(R.id.question2_answer);
        answer2 = question2_answer.getText().toString().toLowerCase();
        if (answer2.equals("Nepal")) {
            answer2_score = 1;
        } else {
            answer2_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question 3  - Correct Answers are #1 (USA) #3 Russia and #4 (South Africa)
        //------------------------------------------------------------------------------------------
        Boolean answer3_choice1;
        Boolean answer3_choice2;
        Boolean answer3_choice3;
        Boolean answer3_choice4;
        question3_choice1 = (CheckBox) this.findViewById(R.id.question3_choice1);
        question3_choice2 = (CheckBox) this.findViewById(R.id.question3_choice2);
        question3_choice3 = (CheckBox) this.findViewById(R.id.question3_choice3);
        question3_choice4 = (CheckBox) this.findViewById(R.id.question3_choice4);
        answer3_choice1 = question3_choice1.isChecked();
        answer3_choice2 = question3_choice2.isChecked();
        answer3_choice3 = question3_choice3.isChecked();
        answer3_choice4 = question3_choice4.isChecked();
        if (answer3_choice1 && !answer3_choice2 && answer3_choice3 && answer3_choice4) {
            answer3_score = 1;
        } else {
            answer3_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question 4 - Correct Answer is "828 metres(2,717ft) tall Burj Khalifa Dubia"
        //------------------------------------------------------------------------------------------
        String answer4;
        question4_answer = (EditText) this.findViewById(R.id.question4_answer);
        answer4 = question4_answer.getText().toString().toLowerCase();
        if (answer4.equals("828 metres")|| answer4.equals("828m")) {
            answer4_score = 1;
        } else {
            answer4_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question 5 - Correct Answer is #3 (Kogi State)
        //------------------------------------------------------------------------------------------
        Boolean answer5;
        question5_choice2 = (RadioButton) findViewById(R.id.question5_choice2);
        answer5 = question5_choice2.isChecked();
        if (answer5) {
            answer5_score = 1;
        } else {
            answer5_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question 6 - Correct Answer is "Nigeria National Demographic party or NNDP" or nndp
        //------------------------------------------------------------------------------------------
        String answer6;
        question6_answer = (EditText) findViewById(R.id.question6_answer);
        answer6 = question6_answer.getText().toString().toLowerCase();
        if (answer6.equals("Nigeria National Demographic party") || answer6.equals("NNDP")|| answer6.equals("nndp")) {
            answer6_score = 1;
        } else {
            answer6_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question 7  - Correct Answers are #1 (Science, engineering and development)
        // #2 Application of one’s knowledge for development and
        // #4 (Information, techniques and tools with which people exploit their environment to satisfy their needs)
        //------------------------------------------------------------------------------------------
        Boolean answer7_choice1;
        Boolean answer7_choice2;
        Boolean answer7_choice3;
        Boolean answer7_choice4;
        question7_choice1 = (CheckBox) this.findViewById(R.id.question7_choice1);
        question7_choice2 = (CheckBox) this.findViewById(R.id.question7_choice2);
        question7_choice3 = (CheckBox) this.findViewById(R.id.question7_choice3);
        question7_choice4 = (CheckBox) this.findViewById(R.id.question7_choice4);
        answer7_choice1 = question7_choice1.isChecked();
        answer7_choice2 = question7_choice2.isChecked();
        answer7_choice3 = question7_choice3.isChecked();
        answer7_choice4 = question7_choice4.isChecked();
        if (answer7_choice1 && answer7_choice2 && !answer7_choice3 && answer7_choice4) {
            answer7_score = 1;
        } else {
            answer7_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question 8 - Correct Answer is "Six Legs" or "6" or 6 legs
        //------------------------------------------------------------------------------------------
        String answer8;
        question8_answer = (EditText) findViewById(R.id.question8_answer);
        answer8 = question8_answer.getText().toString().toLowerCase();
        if (answer8.equals("Six Legs") || answer8.equals("6") || answer8.equals("6 legs")) {
            answer8_score = 1;
        } else {
            answer8_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question 9 - Correct Answer is #1 (Moon)
        //------------------------------------------------------------------------------------------
        Boolean answer9;
        question9_choice1 = (RadioButton) findViewById(R.id.question9_choice1);
        answer9 = question9_choice1.isChecked();
        if (answer9) {
            answer9_score = 1;
        } else {
            answer9_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question 10 - Correct Answer is "90m by 120m and 45m by 90m" or 90m by 120m
        //------------------------------------------------------------------------------------------
        String answer10;
        question10_answer = (EditText) findViewById(R.id.question10_answer);
        answer10 = question10_answer.getText().toString().toLowerCase();
        if (answer10.equals("90m by 120m and 45m by 90m")|| answer10.equals("90m by 120m")) {
            answer10_score = 1;
        } else {
            answer10_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Final Score
        //------------------------------------------------------------------------------------------
        final_score = answer1_score + answer2_score + answer3_score + answer4_score + answer5_score+answer6_score+answer7_score+answer8_score+answer9_score+answer10_score;

        if (final_score == 10) {
            resultsDisplay = "Great! You scored 10 out of 10";
        } else {
            resultsDisplay = "Try again. You scored " + final_score + " out of 10";
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, resultsDisplay, duration);
        toast.setGravity(Gravity.BOTTOM, 0, 0);
        toast.show();
    }


}
