package com.example.prusp.footballscorecounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA;
    private int shotAtemptsTeamA;
    private int offsidesTeamA;
    private int yellowCardsTeamA;
    private int redCardsTeamA;
    private int scoreTeamB;
    private int shotAtemptsTeamB;
    private int offsidesTeamB;
    private int yellowCardsTeamB;
    private int redCardsTeamB;
    private TextView scoreOfTeamATextView;
    private TextView shotAtemptsTeamATextView;
    private TextView offsidesTeamATextView;
    private TextView yellowCardsTeamATextView;
    private TextView redCardsTeamATextView;
    private TextView scoreOfTeamBTextView;
    private TextView shotAtemptsTeamBTextView;
    private TextView offsidesTeamBTextView;
    private TextView yellowCardsTeamBTextView;
    private TextView redCardsTeamBTextView;
    private List<TextView> listOfCountersTextView;
    private static final int RESET_VALUE_FOR_COUNTERS = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initTextViews();
    }

    public void initTextViews(){
        scoreOfTeamATextView = (TextView)findViewById(R.id.score_of_team_a_text_view);
        shotAtemptsTeamATextView = (TextView)findViewById(R.id.shots_attemptted_team_a_result);
        offsidesTeamATextView = (TextView)findViewById(R.id.offside_team_a_result);
        yellowCardsTeamATextView = (TextView)findViewById(R.id.yellow_card_team_a_result);
        redCardsTeamATextView = (TextView)findViewById(R.id.red_card_team_a_result);

        scoreOfTeamBTextView = (TextView)findViewById(R.id.score_of_team_b_text_view);
        shotAtemptsTeamBTextView = (TextView)findViewById(R.id.shots_attemptted_team_b_result);
        offsidesTeamBTextView = (TextView)findViewById(R.id.offside_team_b_result);
        yellowCardsTeamBTextView = (TextView)findViewById(R.id.yellow_card_team_b_result);
        redCardsTeamBTextView = (TextView)findViewById(R.id.red_card_team_b_result);
    }

    public void teamAGoalCounter(View view) {
        scoreTeamA += 1;
        updateCounter(scoreTeamA, scoreOfTeamATextView);
    }

    public void teamAShotAttempt(View view) {
        shotAtemptsTeamA += 1;
        updateCounter(shotAtemptsTeamA, shotAtemptsTeamATextView);
    }

    public void teamAOffsidesCounter(View view) {
        offsidesTeamA += 1;
        updateCounter(offsidesTeamA, offsidesTeamATextView);
    }
    public void teamAYellowCardsCounter(View view) {
        yellowCardsTeamA += 1;
        updateCounter(yellowCardsTeamA, yellowCardsTeamATextView);
    }

    public void teamARedCardsCounter(View view) {
        redCardsTeamA += 1;
        updateCounter(redCardsTeamA, redCardsTeamATextView);
    }

    public void teamBGoalCounter(View view) {
        scoreTeamB += 1;
        updateCounter(scoreTeamB, scoreOfTeamBTextView);
    }

    public void teamBShotAttempt(View view) {
        shotAtemptsTeamB += 1;
        updateCounter(shotAtemptsTeamB, shotAtemptsTeamBTextView);
    }

    public void teamBOffsidesCounter(View view) {
        offsidesTeamB += 1;
        updateCounter(offsidesTeamB, offsidesTeamBTextView);
    }

    public void teamBYellowCardsCounter(View view) {
        yellowCardsTeamB += 1;
        updateCounter(yellowCardsTeamB, yellowCardsTeamBTextView);
    }

    public void teamBRedCardsCounter(View view) {
        redCardsTeamB += 1;
        updateCounter(redCardsTeamB, redCardsTeamBTextView);
    }

    private void updateCounter(int counter, TextView resultTextView){
        resultTextView.setText(String.valueOf(counter));
    }

    public void resetAllCounters(View view) {
        setCountersValueToZero();
        createListOfCountersTextView();
        for (TextView eachTextView : listOfCountersTextView){
            updateCounter(RESET_VALUE_FOR_COUNTERS, eachTextView);
        }
    }

    private void setCountersValueToZero() {
        scoreTeamA=shotAtemptsTeamA=offsidesTeamA=yellowCardsTeamA=redCardsTeamA=0;
        scoreTeamB=shotAtemptsTeamB=offsidesTeamB=yellowCardsTeamB=redCardsTeamB=0;
    }

    private void createListOfCountersTextView(){
        listOfCountersTextView = new ArrayList<>();
        listOfCountersTextView.add(scoreOfTeamATextView);
        listOfCountersTextView.add(shotAtemptsTeamATextView);
        listOfCountersTextView.add(offsidesTeamATextView);
        listOfCountersTextView.add(yellowCardsTeamATextView);
        listOfCountersTextView.add(redCardsTeamATextView);

        listOfCountersTextView.add(scoreOfTeamBTextView);
        listOfCountersTextView.add(shotAtemptsTeamBTextView);
        listOfCountersTextView.add(offsidesTeamBTextView);
        listOfCountersTextView.add(yellowCardsTeamBTextView);
        listOfCountersTextView.add(redCardsTeamBTextView);
    }
}
