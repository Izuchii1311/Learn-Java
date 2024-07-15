package oop_java.inheritance;

class ViceManager extends Manager {
    ViceManager(String name) {
        super(name);
    }

    // child class akan memiliki property dan method yang dimiliki parent nya
    void sayHello(String name) {
        System.out.println("Hello, " + this.name + " now you work as Vice Manager..?");
    }
}