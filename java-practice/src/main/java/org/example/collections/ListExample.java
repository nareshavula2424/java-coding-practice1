package org.example.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        System.out.println(list1.get(0));
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list1.addAll(list2);
        System.out.println(list1);
        System.out.println(list1.getFirst());
        System.out.println(list1.getLast());
        list1.addFirst(9);
        System.out.println(list1);
        list1.addLast(10);
        System.out.println(list1);
        list1.add(4,11);
        System.out.println(list1);
        list1.add(22);
        list1.add(null);
        list1.add(null);
        list1.add(null);
        list1.add(null);
        list1.add(null);
        System.out.println(list1);
    }
}
