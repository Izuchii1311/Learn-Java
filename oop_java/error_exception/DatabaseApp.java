package oop_java.error_exception;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("Admin", null);
        System.out.println("success");          // Tidak bisa Connect ke Database
    }

    public static void connectDatabase(String username, String password) {
        if(username == null || password == null) {
            throw new DatabaseError("Tidak bisa Connect ke Database");
        }
    }
}
