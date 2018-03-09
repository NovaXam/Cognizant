/**
 * Created by student on 3/7/18.
 */
public class Vehicle {
    private String model;
    private String price;
    private double speed;

    public Vehicle(String model, String price) {
        this.model = model;
        this.price = price;
        this.speed = 0.0;
    };

    public void goForward() {
        this.speed += 10;
    };

    public String getModel() {
        return this.model;
    };

    public double getSpeed() {
        return this.speed;
    };
};