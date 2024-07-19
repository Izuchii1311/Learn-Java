package oop_java.record_class;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("Izuna@gmail.com", "password");

        System.out.println(loginRequest);   // LoginRequest[email=Izuna@gmail.com, password=password]
        System.out.println(loginRequest.email());       // Izuna@gmail.com
        System.out.println(loginRequest.password());    // password
        loginRequest.sayHello();                        // Hai Izuna@gmail.com

        System.out.println(new LoginRequest());
        // Membuat Constructor Record di Java.
        // LoginRequest[email=, password=]
        System.out.println(new LoginRequest("Izuna@gmail.com"));
        // Membuat Constructor Record di Java.
        // LoginRequest[email=Izuna@gmail.com, password=]
        System.out.println(new LoginRequest("Izuna@gmail.com", "password"));
        // Membuat Constructor Record di Java.
        // LoginRequest[email=Izuna@gmail.com, password=password]
    }
}
