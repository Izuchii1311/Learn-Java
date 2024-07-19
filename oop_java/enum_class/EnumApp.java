package oop_java.enum_class;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Izuchii");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());     // Izuchii
        System.out.println(customer.getLevel());    // PREMIUM
        System.out.println(customer.getLevel().getDescription());    // Premium Level

//        KONVERSI ENUM
        String levelName = Level.VIP.name();
        System.out.println(levelName);                            // VIP

//        KONVERSI STRING to ENUM
        Level level = Level.valueOf("PREMIUM");             // PREMIUM
        System.out.println(level);                                // PREMIUM
//        Level level2 = Level.valueOf("PERTAMAX");                 // Error
//        System.out.println(level2);                               // Error

//        MENGECEK ENUM
        System.out.println("SEMUA LEVEL");
        Level[] levels = Level.values();
        for (var lv : levels) {
            System.out.println(lv);
        }
    }
}
