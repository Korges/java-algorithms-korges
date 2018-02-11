package com.codecool.krk.merge.sort;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    private static List<Integer> extraList;

    public void sort(List<Integer> toSort) {

        if(toSort == null) {
            throw new IllegalArgumentException("List can not be empty!");
        }
        extraList = new ArrayList<>(toSort.size());
        mergeSort(toSort, 0, toSort.size()-1);
    }

    private static void mergeSort(List<Integer> toSort, int leftIndex, int rightIndex) {

        if(leftIndex < rightIndex) {
            int middle = (leftIndex + rightIndex)/2;
            mergeSort(toSort, leftIndex, middle);
            mergeSort(toSort, middle+1, rightIndex);
            merge(toSort, leftIndex, middle, rightIndex);
        }
    }

    private static void merge(List<Integer> toSort, int leftIndex, int middle, int rightIndex) {

        for(int i=leftIndex; i<=rightIndex; i++) {
            extraList.add(i, toSort.get(i));
        }

        int finger1 = leftIndex;
        int finger2 = middle +1;
        int current = leftIndex;

        while(finger1 <= middle && finger2 <= rightIndex) {

            if(extraList.get(finger1) <= extraList.get(finger2)) {
                toSort.set(current, extraList.get(finger1));
                finger1++;
            } else {
                toSort.set(current, extraList.get(finger2));
                finger2++;
            }
            current++;
        }
        while(finger1 <= middle) {
            toSort.set(current, extraList.get(finger1));
            current++;
            finger1++;
        }
    }
}
