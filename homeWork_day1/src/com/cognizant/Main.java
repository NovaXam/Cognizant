package com.cognizant;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //test case Question 1
        int [] incomeArr = {5, 99, 0, 45, -1, -111, 10000};
        System.out.println(Arrays.toString(findLargestAndSmallest(incomeArr)));

        //test case Question 2
        int []  testArr =  {1, 4, 3, 3, 0, 1, 10, 4, -1, 21, 0};
        System.out.println(Arrays.toString(removeDuplicatesFromArray(testArr)));

        //test case Question 3
        System.out.println(sumOfTwoLargest(testArr));

        //test case Bonus
        int[] array1 = {1,4,7,9,0,0,0};
        int[] array2 = {1,5,11};
        System.out.println(Arrays.toString(mergeSortedArrays(array1, array2)));
    };

    //Question 1: Find the smallest and largest numbers in an array
    public static int [] findLargestAndSmallest(int [] array) {

        int length = array.length;

        int max = searchMax(array);
        int min= searchMin(array);

        int [] finalList = {min, max};

        return finalList;
    }

    public static int searchMax(int [] arr) {

        int length = arr.length;
        int maxValue= arr[0];

        for (int i = 1; i < length; i++) {
             if(maxValue < arr[i]) {
                 maxValue = arr[i];
             }
        };

        return maxValue;
    };

    public static int searchMin(int [] arr) {

        int length = arr.length;
        int minVal = arr[0];

        for (int i = 1; i < length; i++) {
            if(minVal > arr[i]) {
                minVal = arr[i];
            }
        };

        return minVal;
    };

    //Question 2: Remove duplicates from an array
    public static Object[] removeDuplicatesFromArray(int[] array) {

        ArrayList<Integer> temp = new ArrayList<>();
        int index = 0;
        while (index < array.length) {
            if (temp.indexOf(array[index]) == -1) {
                temp.add(array[index]);
            }
            index++;
        };

        Object [] resultArr = temp.toArray();
        return resultArr;
    };

    //Question 3. Sum of the two largest values
    public static int sumOfTwoLargest(int[] array) {
        if (array.length == 0) return 0;
        if (array.length == 1) return array[0];

        Arrays.sort(array);

        return array[array.length-1] + array[array.length-2];
    };


    //BONUS QUESTION
    public static int[] mergeSortedArrays(int[] array1, int[] array2) {
        int index2, length = array2.length - 1;

        while (length >=0 )  {
            Arrays.sort(array1);
            int index = Arrays.binarySearch(array1, 0);
            array1[index] = array2[length];
            length--;
        };

        return array1;
    };
};
