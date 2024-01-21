package org.example.interfaces;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class JavaCallable implements Callable{

    @Override
    public Object call() throws Exception {
        Random r = new Random();
        int randNo = r.nextInt(10);
        Thread.sleep(2000);
        return randNo;
    }
}
public class CallableInterfaceExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask[] randomNoTasks = new FutureTask[10];
        for(int i =0;i<10;i++){
            Callable clble = new JavaCallable();
            randomNoTasks[i]= new FutureTask(clble);
            Thread t1 = new Thread(randomNoTasks[i]);
            t1.start();
        }
        for(int j =0;j<10;j++){
            Object o = randomNoTasks[j].get();
            System.out.println("Random number is " +o);
        }

    }
}
