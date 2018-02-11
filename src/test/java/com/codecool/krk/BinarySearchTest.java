package com.codecool.krk;

import com.codecool.krk.binary.search.BinarySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class BinarySearchTest {

    public int[] fillList() {

        int[] list = new int[100];
        for(int i=0; i<100; i++) {
            list[i]=i*2;
        }
        return list;
    }

    @Test
    void binarySearchTestIfTrue() {
        int[] list = fillList();
        Assertions.assertTrue(BinarySearch.runBinarySearch(list, 16));
    }

    @Test
    void binarySearchTestIfFalse() {
        int[] list = fillList();
        assertFalse(BinarySearch.runBinarySearch(list, 15));
    }


}