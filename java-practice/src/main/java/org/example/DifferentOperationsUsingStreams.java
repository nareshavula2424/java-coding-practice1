package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DifferentOperationsUsingStreams {
    public static void main(String[] args) {
        List<Integer> list = List.of(10,20,56,90,23,12,33,56,10,9,6,7,9,54,55,54);
//        System.out.println("print without duplicate elements:");
//        list.stream().distinct().forEach(System.out::println);
//        System.out.println("print elements in ascending order:");
//         list.stream().sorted().forEach(System.out::println);
//        System.out.println("print elements in descending order:");
//         list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
//        System.out.println("print elements in reverse order:");
//        list.stream().collect(Collectors.toList()).reversed().forEach(System.out::println);
//        System.out.println("print element of Max:");
//        Integer maxElement = list.stream().max(Integer::compareTo).orElse(null);
//        System.out.println("Max is Element :" +maxElement);
//        System.out.println("print element of Min:");
//        Integer minElement = list.stream().min(Integer::compareTo).orElse(null);
//        System.out.println("Min is Element :" +minElement);
//        System.out.println("Count of elements in the list");
//        Long count = list.stream().count();
//        System.out.println("Count is :" +count);
        System.out.println("print elements without duplicate elements:");
        list.stream().distinct().forEach(System.out::println);
        Integer maxElement = list.stream().max(Integer::compareTo).orElse(null);
        System.out.println("Max element: " +maxElement);
        Integer minElement = list.stream().min(Integer::compareTo).orElse(null);
        list.stream().sorted().forEach(System.out::println);
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        list.stream().collect(Collectors.toList()).reversed().forEach(System.out::println);






    }
}
