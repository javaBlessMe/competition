package com.company;


public class Wall implements Obstacles {
    private float height;
    private String name;
    private String type ="стена";
    public Wall(float height, String name) {
        this.height = height;
        this.name = name;
    }


    @Override
    public float getValue() {
        return this.height;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return this.type;
    }
}
