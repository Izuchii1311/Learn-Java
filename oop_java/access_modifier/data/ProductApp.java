package oop_java.access_modifier.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Indomie", 3000);
        
        System.out.println(product.name);                               // Indomie
        System.out.println(product.price);                              // 3000

        // hasil dari method toString()
        System.out.println(product);                                    // Product Name : Indomie, price : 3000

        Product product2 = new Product("Indomie", 3000);

        System.out.println(product.equals(product2));                   // true
        System.out.println(product == product2);                        // true

        // hashcode
        System.out.println(product.hashCode());                         // 186072863
        System.out.println(product2.hashCode());                        // 186072863
        System.out.println(product.hashCode() == product2.hashCode());  // true
    }
}
