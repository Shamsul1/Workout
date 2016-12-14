package com.example.shamsulkarim.workout;

/**
 * Created by Shamsul Karim on 17-Nov-16.
 */

public class Workout {

    String name;
    String description;
    public static final Workout[] workout = {
            new Workout("Limb loosener1", "2 pushups 2 squats"),
            new Workout("Limb loosener2", "3 pushups 3 squats"),
            new Workout("Limb loosener3", "4 pushups 4 squats"),
            new Workout("Limb loosener4", "5 pushups 5 squats")};


    public Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
