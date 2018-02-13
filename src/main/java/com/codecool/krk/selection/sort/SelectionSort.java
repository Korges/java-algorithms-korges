package com.codecool.krk.selection.sort;

import java.util.ArrayList;

public class SelectionSort {

    public static ArrayList<Integer> sort(ArrayList<Integer> dataToSort) {

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < dataToSort.size() -1; i++) {
            int index = i;
            for (int j = i+1; j < dataToSort.size(); j++) {
                if (dataToSort.get(j) < dataToSort.get(index)) {
                    index = j;
                }
            }

            int lesserNumber = dataToSort.get(index);
            dataToSort.set(index, dataToSort.get(i));
            dataToSort.set(i, lesserNumber);
        }

        System.out.println("SelectionSort - Sorting have taken : " + (System.currentTimeMillis() - startTime)/1000F + " seconds.");

        return dataToSort;
    }
}
