package org.example.exceptions;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionExampleUsingThrowsAndThrow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the numerator");
            int numerator = sc.nextInt();
            System.out.println("Enter the denimonator");
            int denominator = sc.nextInt();
            int res = divideNumbers(numerator,denominator);
            System.out.println("Result "+res);

        }catch (ArithmeticException e){
            System.err.println("Error "+e.getMessage());
        }catch (Exception e){
            System.err.println("Unexpected error occurred "+e);
        }finally {
            sc.close();
        }
    }
    public static int divideNumbers(int numerator, int denominator) throws ArithmeticException {
        if(denominator == 0){
            throw new ArithmeticException("denominator can't be zero");
        }
        return numerator/denominator;
    }
}
