package com.example.JEP356_Enhanced_Pseudo_Random_Number_Generators.before_java17;

import java.util.Random;

class Example1 {
    public static void main (String[] args) {
        Random rand = new Random();
        int max=100,min=50;
        System.out.println("Generated numbers are within "+min+" to "+max);
        System.out.println(rand.nextInt(max - min + 1) + min);
        System.out.println(rand.nextInt(max - min + 1) + min);
        System.out.println(rand.nextInt(max - min + 1) + min);
    }
}
