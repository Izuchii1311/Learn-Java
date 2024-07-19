package oop_java.record_class;

// Constructornya disimpan sebagai parameter
public record LoginRequest(String email, String password) {
    public LoginRequest {
        System.out.println("Membuat Constructor Record di Java.");
    }

    public LoginRequest(String email) {
        this(email, "");
    }

    public LoginRequest() {
        this("", "");
    }

    public void sayHello() {
        System.out.println("Hai " + this.email);
    }
}
