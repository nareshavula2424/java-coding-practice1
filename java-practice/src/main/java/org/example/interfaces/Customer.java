package org.example.interfaces;
/* We are learning the cloneable interface */
public class Customer implements Cloneable{
    int a;

    Customer(int a){
        this.a = a;

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
