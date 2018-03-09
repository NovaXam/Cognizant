package com.cognizant;

/**
 * Created by student on 3/6/18.
 */
public class Animals {
    private int numLebs;
    private int topSpeed;
    private boolean isEndangered = true;
    private String name;

    public Animals(){};

    public void setNumLebs(int legs) {
        this.numLebs = legs;
    };

    public void setTopSpeed(int speed) {
        this.topSpeed = speed;
    };

    public void setEndangered(String level) {
        if (level == "yes") {
            this.isEndangered = true;
        } else this.isEndangered = false;
    };

    public void setName(String name) {
        this.name = name;
    };

    public String getName() {
        return this.name;
    };

    public int getTopSpeed() {
        return this.topSpeed;
    };

    public boolean getDangerLevel() {
        return this.isEndangered;
    };

    public int getNumLegs() {
        return this.numLebs;
    };

    public String toString() {
        System.out.println("The ".concat(this.name).concat(" has a top speed of ") + this.getTopSpeed());
        return null;
    }
};
