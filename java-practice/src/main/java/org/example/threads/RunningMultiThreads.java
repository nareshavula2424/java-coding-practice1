package org.example.threads;
class MyThread1 implements Runnable{
    String str;
    MyThread1(String str){
        this.str= str;
    }

    @Override
    public void run() {

        for(int i = 1;i<=10;i++){
            System.out.println(str+" :"+i);
        }

    }
}
public class RunningMultiThreads {
    public static void main(String[] args) {
        MyThread1 obj1 = new MyThread1("cut the ticket");
        MyThread1 obj2 = new MyThread1("show the seat");

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

    }
}
