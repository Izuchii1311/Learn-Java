package oop_java.anonymouse_class;

public class HelloWorldApp {
    public static void main(String[] args) {
        // Anonymouse Class
        HelloWorld english = new HelloWorld() {
            public void sayHello() {
                System.out.println("Hello World");
            }

            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        english.sayHello();                  // Hello World
        english.sayHello("Izuchii");    // Hello Izuchii
    }
}
