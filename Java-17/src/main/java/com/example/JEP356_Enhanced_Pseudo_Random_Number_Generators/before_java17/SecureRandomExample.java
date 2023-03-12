package com.example.JEP356_Enhanced_Pseudo_Random_Number_Generators.before_java17;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class SecureRandomExample {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        //creating a random int
        System.out.println("-- single random int --");
        int i = new SecureRandom().nextInt(100);
        System.out.println(i);
        //creating stream of ints
        System.out.println("-- stream --");
        new SecureRandom()
                .ints(5, 10, 100)
                .forEach(System.out::println);
    }
}