import java.util.ArrayList;

/**
 * Created by student on 3/8/18.
 */
public class Tim {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("first string");
        array.add("second");
        System.out.println(array.contains("second"));
        ArrayList<Car> carList = new ArrayList<>();
        Car firstCar = new Car(100, "Mer");
        carList.add(firstCar);
        Car secondCar = new Car(400, "Boo");
        Car thirdCar = new Car(100, "Mer");


        carList.add(secondCar);
        carList.add(thirdCar);

        System.out.println(firstCar.equals(new Car(100, "Mer")));
        System.out.println(carList.contains(firstCar));
        System.out.println(carList.contains(thirdCar));
        System.out.println(firstCar.equals(thirdCar));
    }


}
