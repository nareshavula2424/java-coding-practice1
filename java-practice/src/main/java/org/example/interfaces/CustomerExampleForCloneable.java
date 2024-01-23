package org.example.interfaces;
/* We are learning the cloneable interface */
public class CustomerExampleForCloneable implements Cloneable{
    int a;

    CustomerExampleForCloneable(int a){
        this.a = a;

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
