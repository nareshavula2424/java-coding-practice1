package org.example.interfaces;

public class CustomerManager {
    public static void main(String[] args) throws CloneNotSupportedException {
        Customer customer = new Customer(10);
        Customer customer1 = (Customer) customer.clone();
        System.out.println("Customer a :"+customer.a);
        System.out.println("Customer of copy a :"+customer1.a);
    }
}
