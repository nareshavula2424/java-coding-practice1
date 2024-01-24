package org.example.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add(0,"B");
        list.add("C");
        list.remove(1);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            String str = (String) iterator.next();
            System.out.println(str);

        }
    }
}
