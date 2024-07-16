package oop_java.access_modifier.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Indomie", 3000);
        
        System.out.println(product.name);   // Indomie
        System.out.println(product.price);  // 3000
    }
}
