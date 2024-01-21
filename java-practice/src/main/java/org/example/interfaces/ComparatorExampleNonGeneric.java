package org.example.interfaces;
/*
This is the comparator example using old style i.e, NON-GENERIC
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student {
    String studentName;
    int rollNo;
    int age;

    public Student(String studentName, int rollNo, int age) {
        this.studentName = studentName;
        this.rollNo = rollNo;
        this.age = age;
    }
}

class AgeComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;
        if(s1.age == s1.age){
            return 0;
        }else if(s1.age > s2.age){
            return 1;
        }else {
            return -1;
        }

    }
}
class NameComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;
        return s1.studentName.compareTo(s2.studentName);
    }
}
public class ComparatorExampleNonGeneric {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(new Student("Naresh",1001,24));
        al.add(new Student("Nagendra",1002,26));
        al.add(new Student("Sai",1003,28));
        al.add(new Student("Lakshman",1004,34));
        System.out.println("Sorting by name:");
        Collections.sort(al,new AgeComparator());
        Iterator itr = al.iterator();
        while (itr.hasNext()){
            Student st = (Student) itr.next();
            System.out.println("Student name: " +st.studentName);
            System.out.println("Student roll: " +st.rollNo);
            System.out.println("Student age: " +st.age);
            System.out.println("**************************************************");



        }

    }

}
