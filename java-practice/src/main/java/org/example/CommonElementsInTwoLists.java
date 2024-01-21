package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CommonElementsInTwoLists {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1,2,3,7,8);
        List<Integer> list2 = List.of(1,2,3,5,6);

        List<Integer> destinationList = new ArrayList<>(list1);
        destinationList.addAll(list2);

        list1.stream().filter(list2::contains).forEach(System.out::println);
        System.out.println(destinationList);








    }
}
