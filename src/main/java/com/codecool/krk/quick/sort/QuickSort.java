package com.codecool.krk.quick.sort;

import java.util.List;

import static java.util.Collections.swap;

public class QuickSort {

    public void sort(List<Integer> toSort) {
        if(toSort == null || toSort.size() == 0) {
            throw new IllegalArgumentException("List can not be empty!");
        }
        int n = toSort.size();
        quickSort(toSort, 0, n-1);
    }

    private static void quickSort(List<Integer> toSort, int left, int right) {
        if(left >= right) {
            return;
        }

        int pivotValue = toSort.get(right);
        int border = left -1;
        int i = left;

        while(i<right) {
            if(toSort.get(i)<pivotValue) {
                border++;
                if(border != i) {
                    swap(toSort, border, i);
                }
            }
            i++;
        }

        border++;
        if(border != right) {
            swap(toSort, border, right);
        }

        quickSort(toSort, left, border-1);
        quickSort(toSort, border+1, right);
    }
}
