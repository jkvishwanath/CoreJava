package com.example.JEP356_Enhanced_Pseudo_Random_Number_Generators.before_java17;

import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandomExample {
    public static void main(String[] args) {
        //creating a random int
        System.out.println("-- single random int --");
        int i = ThreadLocalRandom.current().nextInt(10, 100);
        System.out.println(i);
        //creating stream of ints
        System.out.println("-- stream --");
        ThreadLocalRandom.current()
                         .ints(5, 10, 100)
                         .forEach(System.out::println);
    }
}