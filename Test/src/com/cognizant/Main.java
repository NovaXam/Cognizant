package com.cognizant;

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car("BMW", 25000);
        myCar.setOwner("Yan");

        //Animal
            //1. instanciate
            //2. get name ans speed using getters
            //3. print output
            //4. set new values using setters
            //5. get new values
            //6. print new output

        Animals dear = new Animals();
        dear.setName("leopard");
        dear.setEndangered("yes");
        dear.setTopSpeed(100);
        dear.setNumLebs(4);

        System.out.println("name: " + dear.getName() + "\ndanger: " + dear.getDangerLevel() + ";\ntopSpeed: " + dear.getTopSpeed() + "\nnumber of legs: " + dear.getNumLegs() );

        dear.setTopSpeed(120);
        dear.setName("deer");
        dear.setEndangered("no");

        System.out.println("\n");
        System.out.println("name: " + dear.getName() + "\ndanger: " + dear.getDangerLevel() + ";\ntopSpeed: " + dear.getTopSpeed() + "\nnumber of legs: " + dear.getNumLegs() );
        dear.toString();

        Animals leo = new Animals();
        leo.setName("leo");
        leo.setEndangered("yes");
        leo.setTopSpeed(80);
        leo.setNumLebs(4);
        leo.toString();
    }
}
