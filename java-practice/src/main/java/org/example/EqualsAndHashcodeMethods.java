package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Employeee{
    int id;
    String name;

    Employeee(int id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Employeee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employeee employeee = (Employeee) o;
        return id == employeee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
public class EqualsAndHashcodeMethods {
    public static void main(String[] args) {
        int a =10;
        int b =10;
        String name1 ="abc";
        String name2 = new String("abc");
        String name3 = new String("abc");
        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());
        System.out.println(name1.equals(name2));
        System.out.println(name2.equals(name3));
        System.out.println(name1 == name2);
        System.out.println(a==b);

        Employeee emp1 = new Employeee(1,"Naresh");
        Employeee emp2 = new Employeee(1,"Nagendra");
        System.out.println(emp1.equals(emp2));
        Map<Employeee,String> map= new HashMap<>();
        map.put(emp1,"IT");
        map.put(emp2,"IT");
        System.out.println(map);
        System.out.println(map.get(emp1));
    }
}
