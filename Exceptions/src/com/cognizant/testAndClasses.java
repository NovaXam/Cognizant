package com.cognizant;

/**
 * Created by student on 3/6/18.
 */
public class testAndClasses {
    private String type;
    private String color;

    public String getterType() {
        return this.type;
    }

    public String getterColor() {
        return this.color;

    }

    public void setter(String color, String type) {
        this.color = color;
        this.type = type;
    };

    public String toString(int args) {
        return this.color + " " + this.type + " cost " + args + "$";
    }
}
