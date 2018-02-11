package com.codecool.krk.flattening.multidimensional.list;

import java.util.ArrayList;
import java.util.List;

public class FlatteningMultidimensionalList {

    private static ArrayList<Object> postFlatteningList = new ArrayList<>();


    public static List flattenGivenList(List<Object> list) {

        for(Object element : list) {
             if(element instanceof List) {
                list = (List<Object>) element;
                flattenGivenList(list);
            } else {
                postFlatteningList.add(element);
            }
        }
        return postFlatteningList;
    }
}
