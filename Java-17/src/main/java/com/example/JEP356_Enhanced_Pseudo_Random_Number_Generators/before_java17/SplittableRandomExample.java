package com.example.JEP356_Enhanced_Pseudo_Random_Number_Generators.before_java17;

import java.util.SplittableRandom;

public class SplittableRandomExample {
    public static void main(String[] args) {
        //creating a random int
        System.out.println("-- single random int --");
        int i = new SplittableRandom().nextInt(10, 100);
        System.out.println(i);
        //creating stream of ints
        System.out.println("-- stream  --");
        new SplittableRandom()
                .ints(5, 10, 100)
                .forEach(System.out::println);
    }
}