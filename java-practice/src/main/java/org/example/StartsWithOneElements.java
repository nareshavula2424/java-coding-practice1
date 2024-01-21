package org.example;

import java.util.Arrays;
import java.util.List;

public class StartsWithOneElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,11,23,45,12,24,14,16);
        List<String> list1 =  list.stream().map(n->n+" ")
                  .filter(number->number.startsWith("1"))
                  .toList();
        System.out.println(list1);
    }
}
