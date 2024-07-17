package oop_java.implements_case;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        car.drive();                                // Avanza Drive
        System.out.println(car.getTier());          // 4
        System.out.println(car.getBrand());         // Haha
        System.out.println(car.isMaintenance());    // false
        System.out.println(car.isBig());            // true
    }
}
