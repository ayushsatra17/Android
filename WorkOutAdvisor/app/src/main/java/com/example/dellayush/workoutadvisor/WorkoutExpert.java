package com.example.dellayush.workoutadvisor;

import java.util.ArrayList;
import java.util.List;

public class WorkoutExpert {
    List<String> getWorkOuts(String workoutType){
        List<String> toDoWorkout = new ArrayList<String>();
        if(workoutType.equals("Chest")){
            toDoWorkout.add("Bench Press");
            toDoWorkout.add("Cable Flys");
        }else if(workoutType.equals("Cardio")){
            toDoWorkout.add("Bicycle");
            toDoWorkout.add("Tredmill");
        }else if(workoutType.equals("Biceps")){
            toDoWorkout.add("Biceps Curls");
        }else if(workoutType.equals("Triceps")){
            toDoWorkout.add("Tricep Ext");
            toDoWorkout.add("Tricep Curls");
        }else if(workoutType.equals("Legs")){
            toDoWorkout.add("Run");
        }
        return  toDoWorkout;
    }
}
