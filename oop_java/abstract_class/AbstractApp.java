package oop_java.abstract_class;

public class AbstractApp {
    public static void main(String[] args) {
        // var location = new Location();       // kelas abstract tidak bisa dibuat langsung
        Location city = new City();                  // turunan dari kelas abstract
        city.name = "Bandung";
        city.run();
        System.out.println(city.name);          // Bandung
    }
}
