package org.example.threads;
class MyThread2 implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        task1();
        task2();
        task3();

    }
    void task1(){
        System.out.println("this is task one");
    }
    void task2(){
        System.out.println("This is task 2");
    }
    void task3(){
        System.out.println("this is task 3");
    }


}
public class RunningSingleThread {
    public static void main(String[] args) {
        MyThread2 obj = new MyThread2();
        Thread  t1 = new Thread(obj);
        t1.start();




    }
}
