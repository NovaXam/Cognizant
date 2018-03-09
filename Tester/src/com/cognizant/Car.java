package src.com.cognizant;

import java.util.ArrayList;

/**
 * Created by student on 3/6/18.
 */
public class Car {
    private String model;
    private int price;
    private ArrayList<String> owner = new ArrayList<>();

    public Car(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public String getterModel() {
        return this.model;
    }

    public int getterPrice() {
        return this.price;
    }

    public void setOwner(String name) {
        this.owner.add(name);
    }

    public String getterOwner(int num) {
        return this.owner.get(num);
    }




}
