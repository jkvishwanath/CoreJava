package com.example.concurrent_collections;

public class CC_1_ThreadBasics_using_extends_Thread extends Thread {

    public void run() {
        System.out.println("My name is: " + getName());
    }

    public static void main(String[] args) {
        CC_1_ThreadBasics_using_extends_Thread t1 = new CC_1_ThreadBasics_using_extends_Thread();
        t1.start();

        System.out.println("My name is: " + Thread.currentThread().getName());
    }

}