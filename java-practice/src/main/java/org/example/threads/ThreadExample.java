package org.example.threads;

public class ThreadExample {
    public static void main(String[] args) {
        System.out.println("let us find the current thread");
        Thread th = Thread.currentThread();
        System.out.println("current thread ="+th);
        System.out.println("it's name "+th.getName());

    }
}
