package oop_java.RuntimeException;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest(null, null);

//        Runtime Exception
        LoginRequest loginRequest1 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest1);
        System.out.println("Success");

    }
}