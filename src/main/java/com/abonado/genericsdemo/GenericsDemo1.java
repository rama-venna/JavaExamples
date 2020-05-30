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

    }


}
class Store<T> implements Container<T>{

    private T t;

    @Override
    public void set(T t) {
        this.t = t;
    }

    @Override
    public T get() {
        return t;
    }
}

interface Container<T> {
    public void set(T t);
    public T get();
}
