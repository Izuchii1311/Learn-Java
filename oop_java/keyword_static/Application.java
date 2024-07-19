package oop_java.keyword_static;

public class Application {
    public static final int PROCESSORS;

    // Static Block akan diakses terlebih dahulu
    static {
        System.out.println("Mengakses class Application");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}