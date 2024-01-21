package org.example;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        int sum = 0;
        while (num > 0){
            rev = num%10;
            sum = (sum * 10) + rev;
            num = num / 10;
        }
        System.out.println("Reverse Of " +temp+ " is "+sum);

       int res = reverseNumber(1234);
        System.out.println(res);

    }

    public static  int reverseNumber(int num){
        String reversedNumber = new StringBuilder(String.valueOf(num)).reverse().toString();
        return  Integer.parseInt(reversedNumber);
    }

}
