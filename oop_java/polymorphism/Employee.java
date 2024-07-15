package oop_java.polymorphism;

class Employee {
    // Parent Class yang menerima Name
    String name;

    Employee(String name) {
        this.name = name;
    }

    // Method class ini sendiri
    void sayHello(String name) {
        System.out.println("Hai " + this.name + " your position as Employee and your real name is " + name);
    }
}