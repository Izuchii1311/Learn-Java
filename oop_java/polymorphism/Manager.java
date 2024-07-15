package oop_java.polymorphism;

class Manager extends Employee{
    String address;

    // Name dikirimkan ke Parent Class - Employee
    Manager(String name) {
        super(name);
    }

    Manager(String name, String address) {
        super(name);
        this.address = address;
    }


    void sayHello(String name) {
        System.out.println("Hai " + name + " your position as Manager");
    }
}
