package day37_OOP_Inheritance_SuperKeyWord;

class A {
    public A(int a) {// what if parent class is not default constructor;
        System.out.println("A");
    }
}

class B extends A {

    public B() { // if constructor has an argument to pass we need tou use super keyword to call from Parent class;
        super(5);
        System.out.println("B");
    }

}

public class ConstructorPractice {
    public static void main(String[] args) {

        B obj = new B();
    }
}
