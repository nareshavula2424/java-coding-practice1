package org.example.threads;

import java.io.IOException;


class MyThread extends Thread{
    boolean stop = false;
    public void run(){
        for(int i = 1;i<=100000;i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);

            }
            System.out.println(i);
            if(stop) return;
        }
    }
}
public class ThreadExample1 {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread th = new Thread(myThread);
        th.start();
        try {
            System.in.read();
            myThread.stop=true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
