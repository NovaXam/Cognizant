package com.cognizant;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    //array
        int [] newArr;

        newArr = new int[10];
        newArr[0] = 10;
        newArr[1] = 11;

        System.out.println(Arrays.toString(newArr));

        String [] newArrStr = {"one", "two", "three"};
        System.out.println(Arrays.toString(newArrStr));

        //arrayList
        ArrayList<Integer> collection = new ArrayList<>();
        collection.add(23);
        collection.add(76);
        collection.add(1, -1);

        System.out.println(collection);

        collection.set(0, 99);
        System.out.println(collection);
        System.out.println(collection.indexOf(76));
        System.out.println(collection.size());
        System.out.println(collection.get(0));
        for(Integer var : collection) System.out.print(var + " ");
    }
};