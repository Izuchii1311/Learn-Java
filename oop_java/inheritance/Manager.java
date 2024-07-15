package oop_java.inheritance;

class Manager {
    String name;
    String company;

    Manager(String name) {
        this.name = name;
    }

    Manager(String name, String company) {
        this.name = name;
        this.company = company;
    }

    void sayHello(String name) {
        System.out.println("Hello, " + this.name + " now you work as Manager..?");
    }
}