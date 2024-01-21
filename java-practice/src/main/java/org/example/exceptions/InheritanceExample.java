package org.example.exceptions;
class A {
    A(){
        System.out.println("constructor of class A");
    }

}

class B extends A {
    B(){
        System.out.println("Constructor of class B");
    }
}




public class InheritanceExample {
    public static void main(String[] args) {
        B b = new B();
    }
}
