package java_dasar;

public class Scope {
    public static void main(String[] args) {
        sayHello("Izuchii");
    }

    public static void sayHello(String name) {
        var hello = "Hello " + name;
        if (!name.isEmpty()) {
            String hi = "Hi " + name;
            System.out.println(hi);
        }

        System.out.println(hello);
        // System.out.println(hi); // error
    }
}