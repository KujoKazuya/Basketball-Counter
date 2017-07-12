package com.example.android.basketballcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void teamAPlusTwo (View view){
        scoreA = scoreA + 2;
        displayA(scoreA);
    }

    public void teamAPlusThree (View view){
        scoreA = scoreA + 3;
        displayA(scoreA);
    }

    public void teamAPlusOne (View view){
        scoreA = scoreA + 1;
        displayA(scoreA);
    }

    public void teamBPlusTwo (View view){
        scoreB = scoreB + 2;
        displayB(scoreB);
    }

    public void teamBPlusThree (View view){
        scoreB = scoreB + 3;
        displayB(scoreB);
    }

    public void teamBPlusOne (View view){
        scoreB = scoreB + 1;
        displayB(scoreB);
    }

    public void scoreReset (View view){
        scoreA = 0;
        scoreB = 0;
        displayA(scoreA);
        displayB(scoreB);
    }

    private void displayA(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.team_a_score);
        quantityTextView.setText("" + number);
    }

    private void displayB(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.team_b_score);
        quantityTextView.setText("" + number);
    }
}
