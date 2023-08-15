package com.example.quizsampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String [] questions = {"Java is a person","Java was introduce in 1940",
                                   "Java has abstract class","Java support interface",
                                   "Java was created using python"};

    private boolean [] ans = {false,false,true,true,false};

    private int score = 0;
    private int index = 0;

    Button yesButton;
    Button noButton;
    TextView questionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yesButton = (Button) findViewById(R.id.yesButton);
        noButton = (Button) findViewById(R.id.noButton);
        questionTextView = (TextView) findViewById(R.id.questionTextView);
        questionTextView.setText(questions[index]);

        yesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                If the array is not going out of bound
                if (index <= questions.length-1){
//                    if you given correct answer
                    if (ans[index] == true) {
                        score++;
                    }
                    index++;
                    if (index <= questions.length-1){
                        questionTextView.setText(questions[index]);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Your Score is: "+ score, Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        noButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  If the array is not going out of bound
                if (index <= questions.length-1){
//                    if you not given correct answer
                    if (ans[index] == false) {
                        score++;
                    }
                    index++;
                    if (index <= questions.length-1){
                        questionTextView.setText(questions[index]);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Your Score is: "+ score, Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}