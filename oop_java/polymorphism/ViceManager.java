package oop_java.polymorphism;

class ViceManager extends Manager{
    // Name dikirimkan ke Parent Class - Manager
    ViceManager(String name) {
        super(name);
    }

    // Method class ini sendiri
    void sayHello(String name) {
        System.out.println("Hai " + name + " your position as Vice Manager");
    }
}
