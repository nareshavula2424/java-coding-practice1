package org.example;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        PrimeNumber p = new PrimeNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        if(p.isPrime(num)){
            System.out.println(num+ " prime number");
        }else{
            System.out.println(num+" not a prime number");
        }
    }
    public boolean isPrime(int num){
        if(num < 0){
            return  false;

        }else if(num == 0 || num == 1){
            return false;
        }else{
            for(int i = 2;i<num/2;i++){
                if(num % i == 0){
                    return false;
                }
            }
        }
        return  true;
    }
}
