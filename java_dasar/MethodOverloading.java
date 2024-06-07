package java_dasar;

public class MethodOverloading {
    public static void main(String[] args) {
        var name = "Luthfi Nur Ramadhan";
        sayHello(name);
        sayHello(name, 21);
    }

    static void sayHello(String name) {
        System.out.println("Hello " + name);                        // Hello Luthfi Nur Ramadhan
    }
    static void sayHello(String name, int age) {
        System.out.println("Hello " + name + "My age now " + age);  // Hello Luthfi Nur RamadhanMy age now 21
    }
}