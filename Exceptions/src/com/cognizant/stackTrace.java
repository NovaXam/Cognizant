package com.cognizant;

/**
 * Created by student on 3/6/18.
 */
public class stackTrace {
    public static void main(String [] args) {

//        String str = null;
//        printFunc(str);

        arrCheck();

        //tester class instance
        testAndClasses item = new testAndClasses();
        item.setter("red", "morningwaker");
        System.out.println(item.toString(25));
        System.out.println(item.getterColor()+ " " + item.getterType());

        //car class instance
        Car myCar = new Car("Lexus", 25000);
        System.out.println(myCar.getter());
        myCar.price = 20020;
        System.out.println(myCar.getter());

        Person max = new Person("max", "dude", null);
    };
    public static void printFunc(String str) {
        System.out.println(str.length());
    };

    public static void arrCheck() {
        String[] sArr = new String[3];
        sArr[0] = "first";
        sArr[1] = "second";
        sArr[2] = "third";
    };
};