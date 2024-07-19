package oop_java.Exception;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest(null, null);

        try {
            ValidationUtil.validate(loginRequest);
        } catch (ValidationException | NullPointerException e) {
            System.out.println("Terjadi Error, Dengan Pesan : " + e.getMessage());
            // Terjadi Error, Dengan pesan : Email tidak boleh kosong.
        } finally {
            System.out.println("Error atau tidaknya ini tetap dijalankan.");
        }
    }
}
