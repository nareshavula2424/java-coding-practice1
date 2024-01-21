package org.example.interfaces;
/*
Comparator using generic type
 */

import java.util.*;

class Product {
    int pid;
    String pname;
    double pcost;

    public Product(int pid, String pname, double pcost) {
        this.pid = pid;
        this.pname = pname;
        this.pcost = pcost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", pcost=" + pcost +
                '}';
    }
}
class IdComparator implements Comparator<Product>{

    @Override
    public int compare(Product o1, Product o2) {
        Product p1 = (Product) o1;
        Product p2 = (Product) o2;
        if(p1.pid == p2.pid){
            return 0;
        }else if(p1.pid > p2.pid){
            return 1;
        }else {
            return -1;
        }

    }
}
class PnameComparator implements Comparator<Product>{

    @Override
    public int compare(Product o1, Product o2) {
        Product p1 = (Product) o1;
        Product p2 = (Product) o2;
        return p1.pname.compareTo(p2.pname);
    }
}
public class ComparatorExampleUsingGeneric {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product(1003,"HP Laptop",45000.0));
        list.add(new Product(1002,"Dell Laptop",55000.0));
        list.add(new Product(1005,"Dell Laptop",50000.0));
        list.add(new Product(1001,"Mac Book",145000.0));
        list.add(new Product(1004,"Lenevo Laptop",47000.0));
        Collections.sort(list,new PnameComparator());
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            Product p = (Product) itr.next();
            System.out.println(p);

        }

    }
}
