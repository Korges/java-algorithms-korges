package com.codecool.krk;

import com.codecool.krk.flattening.multidimensional.list.FlatteningMultidimensionalList;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FlatteningMultidimensionalListTest {

    public ArrayList fillList() {

        ArrayList list = new ArrayList<>();

        list.add(1);
        list.add(3);
        ArrayList simpleList1 = new ArrayList();
        simpleList1.add("age");
        simpleList1.add(5);
        list.add(simpleList1);
        list.add("Kraków");
        LinkedList simpleList2 = new LinkedList();
        simpleList2.add(1);
        ArrayList simpleList3 = new ArrayList();
        simpleList3.add(3);
        ArrayList simpleList4 = new ArrayList();
        simpleList4.add(4);
        simpleList4.add(5);
        simpleList3.add(simpleList4);
        simpleList3.add("codecool");
        simpleList2.add(simpleList3);
        simpleList2.add(6);
        simpleList2.add(7);
        list.add(simpleList2);

        return list;
    }

    @Test
    void flattenGivenListTest() {
        List preList = fillList();
        List list = FlatteningMultidimensionalList.flattenGivenList(preList);
        String expected = "[1, 3, age, 5, Kraków, 1, 3, 4, 5, codecool, 6, 7]";
        assertEquals(expected, list.toString());
    }

}