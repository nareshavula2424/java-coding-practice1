package org.example.interfaces;

public class CustomerManager {
    public static void main(String[] args) throws CloneNotSupportedException {
        CustomerExampleForCloneable customer = new CustomerExampleForCloneable(10);
        CustomerExampleForCloneable customer1 = (CustomerExampleForCloneable) customer.clone();
        System.out.println("Customer a :"+customer.a);
        System.out.println("Customer of copy a :"+customer1.a);
    }
}
