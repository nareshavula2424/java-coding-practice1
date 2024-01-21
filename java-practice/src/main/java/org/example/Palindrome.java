package org.example;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {
        String str1 = "MOMS";
        boolean flag = true;
        for(int i = 0;i<str1.length();i++){
            if(str1.charAt(i) != str1.charAt(str1.length()-1-i)){
                flag = false;
            }
        }
        if(flag){
            System.out.println(str1+" is a palindrome ");
        }else{
            System.out.println(str1+" is not a palindrome ");
        }


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int num = sc.nextInt();
//        int temp = num;
//        int sum = 0;
//        int rev = 0;
//        while(num > 0){
//          rev = num%10;
//           sum = (sum*10)+rev;
//           num = num / 10;
//        }
//        if(temp == sum){
//            System.out.println(temp + " is a palindrome number");
//        }else{
//            System.out.println(temp + " is not a palindrome");
//        }
        String str = " I AM naresh i am COMFORTABLE with JAVA";
        int strNum = 12321;
        boolean res1 = isPalindromeInteger(strNum);
        boolean res = isPalindrome(str);
        System.out.println(res);
        System.out.println(res1);

    }

    public static boolean isPalindrome(String str){
        String cleanStr = str.replaceAll("\\s+"," ").toLowerCase();
        return IntStream.range(0,cleanStr.length()/2)
                .noneMatch(i->cleanStr.charAt(i) != cleanStr.charAt(cleanStr.length()-1-i));
    }

    public static boolean isPalindromeInteger(int num){
        String strNum = String.valueOf(num);
        return IntStream.range(0,strNum.length()/2)
                .noneMatch(i->strNum.charAt(i) != strNum.charAt(strNum.length()-1 -i));
    }





}
