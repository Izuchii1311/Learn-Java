package oop_java;

// Class
public class Person {
    // Properties
    String name;
    String address;
    final String country = "Indonesia";

    // Constructor Method
    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Constructor Overloading
    Person(String name) {
        this(name, null);
    }

    // Method
    void sayHello(String name) {
        System.out.println("Hello " + name + ", my real name is " + this.name);
    }
    
    public static void main(String[] args) {
        // Object
        var person = new Person("Luthfi Nur Ramadhan", "Jl.Madesa Rt.005 Rw.011 Blok.K No.21 40233");
        person.sayHello("Izuchii");       // Hello Izuchii, my real name is Luthfi Nur Ramadhan

        System.out.println(person.name);            // Luthfi Nur Ramadhan
        System.out.println(person.address);         // Jl.Madesa Rt.005 Rw.011 Blok.K No.21 40233
        System.out.println(person.country);         // Indonesia
    }
}


