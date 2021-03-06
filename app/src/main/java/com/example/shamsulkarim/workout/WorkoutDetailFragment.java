package com.example.shamsulkarim.workout;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WorkoutDetailFragment extends Fragment {

    long workoutID;




    public WorkoutDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_workout_detail, container, false);
    }
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {

            Workout workout = Workout.workout[(int) workoutID];
            TextView title = (TextView) view.findViewById(R.id.workout_title);
            TextView description = (TextView) view.findViewById(R.id.workout_description);
            title.setText(workout.getName());
            description.setText(workout.getDescription());

        }
    }

    public void setWorkoutID(long workoutID) {
        this.workoutID = workoutID;
    }



}
