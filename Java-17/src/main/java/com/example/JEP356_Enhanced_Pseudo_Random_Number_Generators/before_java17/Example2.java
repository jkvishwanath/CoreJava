package com.example.JEP356_Enhanced_Pseudo_Random_Number_Generators.before_java17;

/*package whatever //do not write package name here */

class GFGenerateRandomNumberWithInGivenRangeExample2G {
    public static void main (String[] args) {
        int max=100,min=50;
        System.out.println("Generated numbers are within "+min+" to "+max);
        System.out.println(min + (int)(Math.random() * ((max - min) + 1)));
        System.out.println(min + (int)(Math.random() * ((max - min) + 1)));
        System.out.println(min + (int)(Math.random() * ((max - min) + 1)));
    }
}
