package org.example.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Naresh");
        list.add("Nagendra");
        list.add("Ravindra");
        list.add("Lakshman");
        list.add("Sai Krishna");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()){
            String s = itr.next();
            if(s.equalsIgnoreCase("Naresh")){
                itr.remove();
            }else{
                System.out.println(s);
            }
        }
    }
}
