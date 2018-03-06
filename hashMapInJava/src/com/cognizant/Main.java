package com.cognizant;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	//hashMap
        HashMap<String, Student> classCog =  new HashMap<>();
        Student first = new Student();
        first.age = 34;
        first.name = "Max";
        classCog.put("f2245", first);
        System.out.println(classCog);
    }
}
