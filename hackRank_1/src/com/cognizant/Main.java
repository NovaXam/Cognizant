package com.cognizant;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int [] arr = {5, 6, 7};
	    int num = 4;

        Arrays.sort(arr);
        Arrays.binarySearch(arr, num);
    }
}
