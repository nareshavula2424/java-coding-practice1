package org.example.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class ListIteratorExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        ListIterator<Integer> lit = list.listIterator();
        while (lit.hasNext()){
            Integer a = lit.next();
           if(a % 2 == 0){
               lit.set(11);
           }else{
               lit.set(22);
           }
        }
        lit.add(33);
        while (lit.hasPrevious()){
            Integer b = lit.previous();
            System.out.println(b);

        }
        System.out.println(list);

    }
}
