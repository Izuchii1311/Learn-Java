package oop_java.polymorphism;

public class PolymorphismApp {
    public static void main(String[] args) {
        // Employee employee = new Employee("Izuchii");
        // employee.sayHello("Luthfi Nur Ramadhan");

        // employee = new Manager("Frieren");
        // employee.sayHello("Luthfi Nur");

        // employee = new ViceManager("Hutao");
        // employee.sayHello("Luthfi");

        sayHello(new Employee("Izuchii"));
        sayHello(new Manager("Hutao"));
        sayHello(new ViceManager("Frieren"));
    }

    // jika tidak ada polymorphism maka kita akan membuat method ini berulang
    static void sayHello(Employee employee) {
        // pengecekan object agar lebih aman menggunakan instanceof
        if (employee instanceof ViceManager) {
            // merubah objectnya menjadi object ViceManager
            ViceManager viceManager = (ViceManager) employee;
            System.out.println("Hello ViceManager " + viceManager.name);
            viceManager.sayHello("agus");
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello Employee " + employee.name);
        }
    }
}
