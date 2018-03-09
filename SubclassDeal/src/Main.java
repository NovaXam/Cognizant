
/**
 * Created by student on 3/7/18.
 */
public class Main {
    public static void main(String [] args) {
//
//        //create instance of a parent object Shape and show it
//        Shape round = new Shape("red");
//        System.out.println(round.getColor());
//
//        //create Square instance and shot it
//        Square square= new Square(45, "yellow");
//        System.out.println(square.getArea());
//        System.out.println(square.getColor());
//
//        //create Triangle instance and show it
//        Triangle triangle = new Triangle(10, 5, 7, "black");
//        System.out.println(triangle.getArea());
//        System.out.println(triangle.getColor());
//
//        //create Vehicle instance and show it
//        Vehicle car = new Vehicle("Lexus", "34000");
//        car.goForward();
//        car.goForward();
//        car.goForward();
//        System.out.println(car.getSpeed());
////        System.out.println(((SedanCar)car).getmNumSeats());
//
//        SedanCar newCar = new SedanCar("Lexus", "Max");
//        newCar.goForward();
//        System.out.println(newCar.getSpeed());
//        System.out.println(newCar.getmNumSeats());
//
//        SedanCar oldCar = (SedanCar)getSomeVehicle();
//
//        //Card instance creating
//        Card newCard = new CardSibling(300,  "Nicola Tesla", "Visa");
//        System.out.println(newCard.getBalanace());
//        System.out.println(newCard.getOwner());
//        newCard.makeTransaction("deposit", 890);
//        System.out.println(newCard.getBalanace());
//        System.out.println(((CardSibling)newCard).getType());

        Zoo zoo = Zoo.getZoo();
        AnimalLab newAnimal = new AnimalLab();
//        zoo.addNewAnimals(newAnimal.createAnimal("Bobby", "mamal"));
        zoo.addNewAnimals(newAnimal.createAnimal("Mobby", "reptile"));
//        zoo.addNewAnimals(newAnimal.createAnimal("Zilla", "reptile"));
//        zoo.addNewAnimals(newAnimal.createAnimal("Noob", "mamal"));

        zoo.showMamalInstance();
        zoo.showReptileInstance();
    };
        public static Vehicle getSomeVehicle() {
        return new SedanCar("BMW", "23900");
        };
};