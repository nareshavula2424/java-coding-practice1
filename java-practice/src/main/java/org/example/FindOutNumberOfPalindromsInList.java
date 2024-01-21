package org.example;


import java.util.List;

public class FindOutNumberOfPalindromsInList {
    public static void main(String[] args) {
        List<String> list = List.of("MOM","DAD","NANNA","AMMA");
        int count = 0;
        for(String list1:list){
            list1.toLowerCase();
            if(isPalindrome(list1)){
                count++;
                System.out.println(list1);

            }

        }
        System.out.println("The count of Palindromes are "+count);


    }
    public static boolean isPalindrome(String name){
        boolean flag = true;
        for(int i =0;i<name.length();i++){
            if(name.charAt(i)!= name.charAt(name.length()-1-i)){
                flag=false;
            }
        }
       return flag;
    }
}
