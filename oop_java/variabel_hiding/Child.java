package oop_java.variabel_hiding;

public class Child extends Parent{
    String name;

    void doIt() {
        System.out.println("Do it in Child");
        System.out.println("Parent name is " + super.name);
    }
}
