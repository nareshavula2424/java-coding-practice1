package org.example;

import java.util.Scanner;

public class RangeOfPrimes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start number:");
        int start = sc.nextInt();
        System.out.println("Enter the end number");
        int end = sc.nextInt();
        for(int i = start;i<=end;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }

    }

    public static boolean isPrime(int num){
        if(num < 0){
            return  false;

        }else if(num == 1 || num == 0){
            return false;
        }else {
            for(int i = 2;i<=num/2;i++){
                if(num % i == 0){
                    return false;
                }
            }
        }
        return  true;
    }
}
