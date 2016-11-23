package com.example.shamsulkarim.workout;

/**
 * Created by Shamsul Karim on 17-Nov-16.
 */

public class Workout {

    String name;
    String description;
    private static final Workout[] workout = {
            new Workout("Limb loosener", "2 pushups 2 squats"),
            new Workout("Limb loosener", "3 pushups 3 squats"),
            new Workout("Limb loosener", "4 pushups 4 squats"),
            new Workout("Limb loosener", "5 pushups 5 squats")};


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
