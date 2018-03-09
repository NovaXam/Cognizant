package com.cognizant;

/**
 * Created by student on 3/6/18.
 */
public class Car {

    protected String model;
    protected int price;
    public Car(String model, int price) {
        this.model = model;
        this.price = price;
    };

    public Car getter() {
        return this;
    }

    public String toString() {
        return this.model + " " + this.price;
    }


}
