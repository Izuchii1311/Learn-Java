package oop_java.inheritance;

public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Luthfi");
        manager.name = "Izuchii";
        // manager.sayHello("Luthfi Nur Ramadhan");    // Hello, Izuchii how your day now..?

        var viceManager = new ViceManager("Agus");
        viceManager.name = "Agus";
        // viceManager.sayHello("Ali");                // Hello, Agus how your day now..?

        System.out.println(manager);
        System.out.println(viceManager);
    }
}