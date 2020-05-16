package com.company;

public class Treadmill implements Obstacles {
    private float distance;
    private String name;
    private String type ="дорожка";

    public Treadmill(float distance, String name) {
        this.distance = distance;
        this.name = name;
    }

    @Override
    public float getValue() {
        return distance;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return this.type;
    }
}


