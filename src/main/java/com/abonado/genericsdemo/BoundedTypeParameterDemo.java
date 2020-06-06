package com.abonado.genericsdemo;

import java.util.Arrays;
import java.util.List;

public class BoundedTypeParameterDemo {
    public static void main(String[] args) {
        GenericsDemo<List<String>> gd = new GenericsDemo<>();
        gd.set(Arrays.asList( "String1", "Rama"));
        System.out.println(gd.get());
        System.out.println(gd.getSize());
    }
}

class GenericsDemo<T extends List<?>>{
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
