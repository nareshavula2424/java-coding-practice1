package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println(num+" is even number");
        }else{
            System.out.println(num+" is odd number");
        }
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(3);
        list.add(1);
        list.add(12);
        list.add(14);
        List<Integer> list1 = list.stream().filter(e->e %2 == 0).collect(Collectors.toList());
        System.out.println(list1);
    }





}
