package com.abonado.genericsdemo;

import java.util.Arrays;
import java.util.List;

public class BoundedTypeParameterDemo {
    public static void main(String[] args) {
        GenericsDemo<List> gd = new GenericsDemo<>();
        gd.set(Arrays.asList(1, 2, "String"));
        System.out.println(gd.get());
        System.out.println(gd.getSize());
    }
}

class GenericsDemo<T extends List>{
    private T t;

    public void set(T t){
        this.t = t;
    }
    public int getSize(){
        return t.size();
    }

    public T get(){
        return t;
    }

}
