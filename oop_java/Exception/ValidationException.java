package oop_java.Exception;

public class ValidationException extends Throwable{
//    private String message;
//
//    @Override
//    public String getMessage() {
//        return message;
//    }

    public ValidationException(String message) {
//        kirim data ke Throwable
        super(message);
    }
}
