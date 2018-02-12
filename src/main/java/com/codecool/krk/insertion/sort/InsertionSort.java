package com.codecool.krk.insertion.sort;

import java.util.ArrayList;

public class InsertionSort {

    public static ArrayList<Integer> sort(ArrayList<Integer> dataToSort) {

        long startTime = System.currentTimeMillis();

        for(int i=1; i<dataToSort.size(); i++) {

            int currentValue = dataToSort.get(i);

            while(i > 0 && dataToSort.get(i - 1) > currentValue) {
                dataToSort.set(i, dataToSort.get(i - 1));
                i = i - 1;
            }
            dataToSort.set(i, currentValue);
        }

        System.out.println("InsertionSort - Sorting have taken : " + (System.currentTimeMillis() - startTime)/1000F + " seconds.");

        return dataToSort;
    }
}
