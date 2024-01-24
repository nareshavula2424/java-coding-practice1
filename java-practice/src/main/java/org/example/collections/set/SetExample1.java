package org.example.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample1 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(2);
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(6);
        set1.add(7);
        set1.add(8);
        set1.add(4);
        set1.add(5);
        set1.add(2);
        set.addAll(set1);
        if (set.contains(1)){
            System.out.println("Element is present");
        }else{
            System.out.println("Element is not present");
        }
        System.out.println(set);

    }
}
