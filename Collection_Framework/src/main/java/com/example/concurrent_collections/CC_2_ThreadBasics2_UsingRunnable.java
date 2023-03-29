package com.example.concurrent_collections;

public class CC_2_ThreadBasics2_UsingRunnable implements Runnable {

    public void run() {
        System.out.println("My name is: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Runnable task = new CC_2_ThreadBasics2_UsingRunnable();
        Thread t2 = new Thread(task);
        t2.start();

        System.out.println("My name is: " + Thread.currentThread().getName());
    }

}