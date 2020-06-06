package com.abonado.genericsdemo;

interface Container<T> {
    public void set(T t);
    public T get();
}