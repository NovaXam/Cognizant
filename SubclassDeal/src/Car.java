public class Car {
    private int speed;
    private String color;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }

//    public boolean equals(Object o) {
//        Car thatCar = (Car)o;
//        if (this.speed == ((Car) o).getSpeed()
//                && this.color == ((Car) o).getColor()) {
//            return true;
//        }
//        return false;
//    }
}