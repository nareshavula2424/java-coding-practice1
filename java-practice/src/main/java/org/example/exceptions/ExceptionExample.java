package org.example.exceptions;

public class ExceptionExample {
    public static void main(String[] args) {
      try{
          System.out.println("open files");
          int n = args.length;
          System.out.println("n :"+n);
          int a = 45/n;
          System.out.println("a :"+a);
      }catch (ArithmeticException ae){
          System.out.println(ae);
          System.out.println("Please pass the data while running this program");
      }
      finally {
          System.out.println("closed the files");
      }


    }
}
