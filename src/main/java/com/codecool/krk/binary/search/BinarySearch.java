package com.codecool.krk.binary.search;

public class BinarySearch {

    public static boolean runBinarySearch(int[] numbersList, int searchedNumber) {

        int first = 0;
        int last = numbersList.length - 1;
        int iteration = 0;

        while(first<=last) {
            iteration++;
            int middle = (first + last)/2;

            if(numbersList[middle] > searchedNumber) {
                last = middle - 1 ;
            } else if (numbersList[middle] < searchedNumber) {
                first = middle + 1;
            } else if (numbersList[middle] == searchedNumber) {
                System.out.println("Found at iteration number : " + iteration);
                return true;
            }
        }
        return false;
    }
}
