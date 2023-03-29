package com.example.concurrent_collections;

import java.util.HashMap;

public class CC_2_ThreadBasics2_UsingRunnable implements Runnable {

    public void run() {
        System.out.println("My name is: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Runnable task = new CC_2_ThreadBasics2_UsingRunnable();
        Thread t2 = new Thread(task);
        t2.start();
        HashMap hashMap = new HashMap();
        hashMap.put(1,"Vissu");
        System.out.println(hashMap.get(1));

        System.out.println("My name is: " + Thread.currentThread().getName());
    }

}