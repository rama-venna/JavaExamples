package com.abonado.genericsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsDemo1 {

    public static void main(String[] args) {
        Container<String> stringStore = new Store<>();
        stringStore.set("Rama");
        System.out.println(stringStore.get());

        Container<List<Integer>> integerList = new Store<>();
        integerList.set(Arrays.asList(1, 2 , 3));
        System.out.println(integerList.get());

        //you can add any subtypes of number
        List<Number> numberList = new ArrayList<>();
        numberList.add(1); //Integer
        numberList.add(5l); //long

        List<String> list1 = Arrays.asList("A", "B", "C");
        List<String> list2 = Arrays.asList("C", "D", "E");

        getCommonElementsCount(list1, list2);

    }


    public static void getCommonElementsCount(List<?> list1, List<?> list2){
        int count = 0;

        for(Object element: list1){
            if(list2.contains(element)){
                count++;
            }
            //list2.add(25); you can't add
        }

        System.out.println("count::::" + count);
    }

    public static void invalidAggregate(List<?> list1, List<?> list2, List<?> list3){
        //list3.addAll(list1); //not allowed
        list3.add(null); //null is okay
    }


}



