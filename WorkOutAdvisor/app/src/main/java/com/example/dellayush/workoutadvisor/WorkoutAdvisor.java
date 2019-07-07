package com.example.dellayush.workoutadvisor;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class WorkoutAdvisor extends AppCompatActivity {

    private WorkoutExpert expert = new WorkoutExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_advisor);
    }

    public void performAction(View view){
        TextView textview = (TextView) findViewById(R.id.workoutName);
        Spinner spinner = (Spinner) findViewById(R.id.workoutChoice);
        String workoutSelected = String.valueOf(spinner.getSelectedItem());
        List<String> workoutToDo = expert.getWorkOuts(workoutSelected);
        StringBuilder s = new StringBuilder();
        for(String work : workoutToDo){
            s.append(work).append("\n");
        }
        textview.setText(s);
    }

}
