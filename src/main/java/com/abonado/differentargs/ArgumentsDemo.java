package com.abonado.differentargs;
import java.util.Arrays;

public class ArgumentsDemo {
    public static void main(String[] args) {
        System.out.println("VM Arguments:::" );
        System.out.println(System.getProperty("myName"));

        System.out.println("Program Arguments:::" );
        Arrays.stream(args).forEach(System.out::println);


        System.out.println("Env Arguments:::::");
        System.out.println(System.getenv("APP_HOME"));




    }
}