package oop_java.Exception;

public class ValidationUtil {
    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
        if (loginRequest.email() == null) {
            throw new NullPointerException("Email tidak boleh kosong.");
        } else if (loginRequest.email().isBlank()) {
            throw new ValidationException("Email tidak boleh blank.");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password tidak boleh kosong.");
        } else if (loginRequest.password().isBlank()) {
            throw new ValidationException("Password tidak boleh blank.");
        }
    }
}
