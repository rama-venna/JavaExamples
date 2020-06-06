package com.abonado.genericsdemo;

public class UnboundWildCardDemo {
    public static void main(String[] args) {
        Store<Object> objectStore = new Store<Object>();
        objectStore.set("Rama");
        print(objectStore);
        printMethod(objectStore);

        //objectStore = new Store<Integer>(); --> Not allowed.
        Store<Integer> integerStore = new Store<Integer>();
        //print(integerStore); --> Not allowed
        printMethod(integerStore);

        Store<?> someStore = new Store<String>();
        //someStore.set("Test"); --> Not allowed.

        //print(someStore); --> Not allowed.
        printMethod(someStore);


    }

    public static void print(Store<Object> store){
        System.out.println(store.get());
    }

    public static void printMethod(Store<?> store){
        System.out.println(store.get());
    }
}


