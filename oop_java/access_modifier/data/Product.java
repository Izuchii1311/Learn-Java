package oop_java.access_modifier.data;

public class Product {
    // protected hanya bisa diakses di class yang sama & di package yang sama
    public String name;
    public int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
