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
    private TextView scoreOfTeamATextView;
    private TextView shotAtemptsTeamATextView;
    private TextView offsidesTeamATextView;
    private TextView yellowCardsTeamATextView;
    private TextView redCardsTeamATextView;
    private List<TextView> listOfCountersTextView;
    private static final int RESET_VALUE_FOR_COUNTERS = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initTextViews();
        initCountersAndSetValueToZero();
        createListOfCountersTextView();
    }

    private void initCountersAndSetValueToZero() {
        scoreTeamA=shotAtemptsTeamA=offsidesTeamA=yellowCardsTeamA=redCardsTeamA=0;
    }

    public void initTextViews(){
        scoreOfTeamATextView = (TextView)findViewById(R.id.score_of_team_a_text_view);
        shotAtemptsTeamATextView = (TextView)findViewById(R.id.shots_attemptted_team_a_result);
        offsidesTeamATextView = (TextView)findViewById(R.id.offside_team_a_result);
        yellowCardsTeamATextView = (TextView)findViewById(R.id.yellow_card_team_a_result);
        redCardsTeamATextView = (TextView)findViewById(R.id.red_card_team_a_result);
    }

    private void createListOfCountersTextView(){
        listOfCountersTextView = new ArrayList<>();
        listOfCountersTextView.add(scoreOfTeamATextView);
        listOfCountersTextView.add(shotAtemptsTeamATextView);
        listOfCountersTextView.add(offsidesTeamATextView);
        listOfCountersTextView.add(yellowCardsTeamATextView);
        listOfCountersTextView.add(redCardsTeamATextView);
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

    private void updateCounter(int counter, TextView resultTextView){
        resultTextView.setText(String.valueOf(counter));
    }

    public void resetAllCounters(View view) {
        initCountersAndSetValueToZero();
        for (TextView eachTextView : listOfCountersTextView){
            updateCounter(RESET_VALUE_FOR_COUNTERS, eachTextView);
        }
    }
}
