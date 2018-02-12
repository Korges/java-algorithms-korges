package com.codecool.krk;

import com.codecool.krk.bubble.sort.BubbleSort;
import com.codecool.krk.insertion.sort.InsertionSort;
import org.junit.jupiter.api.Test;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;


class BubbleAndInsertionSortTest {

    public ArrayList loadData() {

        ArrayList<Integer> list = new ArrayList<>();
        String path = "/home/mateusz/IdeaProjects/Algorithms/java-algorithms-korges/src/main/java/com/codecool/krk/" +
                "data/to/sort/fifty_thousand.csv";
        BufferedReader br = null;
        String line;

        try {
            br = new BufferedReader(new FileReader(path));
            while((line = br.readLine()) != null) {
                list.add(Integer.valueOf(line));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }


    @Test
    void bubbleSortTest() {
        ArrayList dataToSort = loadData();
        ArrayList sortedData = BubbleSort.sort(dataToSort);
        // use Java sort method to check the correctness of implemented BubbleSort Algorithm
        Collections.sort(dataToSort);
        assertEquals(dataToSort, sortedData);
    }

    @Test
    void insertionSortTest() {
        ArrayList dataToSort = loadData();
        ArrayList sortedData = InsertionSort.sort(dataToSort);
        // use Java sort method to check the correctness of implemented InsertionSort Algorithm
        Collections.sort(dataToSort);
        assertEquals(dataToSort, sortedData);
    }
}