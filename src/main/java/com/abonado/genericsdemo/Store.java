package com.abonado.genericsdemo;

public class Store<T> implements Container<T> {

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
