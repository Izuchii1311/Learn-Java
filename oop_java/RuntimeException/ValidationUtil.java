package oop_java.RuntimeException;

public class ValidationUtil {
    public static void validateRuntime(LoginRequest loginRequest) {
        if (loginRequest.email() == null) {
            throw new NullPointerException("Email tidak boleh kosong.");
        } else if (loginRequest.email().isBlank()) {
            throw new BlankException("Email tidak boleh blank.");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password tidak boleh kosong.");
        } else if (loginRequest.password().isBlank()) {
            throw new BlankException("Password tidak boleh blank.");
        }
    }
}
