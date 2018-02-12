package com.codecool.krk.bubble.sort;

import java.util.ArrayList;

public class BubbleSort {

    public static ArrayList<Integer> sort(ArrayList<Integer> dataToSort) {

        long startTime = System.currentTimeMillis();

        boolean isSorted = false;

        while(!isSorted) {

            isSorted = true;

            for(int i = 0; i < dataToSort.size() - 1; i++) {

                if(dataToSort.get(i) > dataToSort.get(i +1)) {

                    isSorted = false;
                    int temp = dataToSort.get(i);
                    dataToSort.set(i, dataToSort.get(i+1));
                    dataToSort.set(i+1, temp);
                }
            }
        }

        System.out.println("BubbleSort - Sorting have taken : " + (System.currentTimeMillis() - startTime)/1000F + " seconds.");

        return dataToSort;
    }
}
