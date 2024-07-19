package oop_java.keyword_static;

// Import Static
import static oop_java.keyword_static.Constant.*;

public class StaticApp {
    public static void main(String[] args) {
        // Mengakses Static
        System.out.println(Constant.APPLICATION);                   // Belajar Java
        System.out.println(Constant.VERSION);                       // 1.0

        System.out.println(MathUtil.sum(1,2,3,4,5));      // 15

        Country.City city = new Country.City();
        city.setName("Bandung");
        System.out.println(city.getName());                         // Bandung

        System.out.println(Application.PROCESSORS);

        // Import Static
        System.out.println(APPLICATION);
    }
}
