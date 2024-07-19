package oop_java.access_modifier.data;

public class Product {
    // protected hanya bisa diakses di class yang sama & di package yang sama
    public String name;
    public int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return "Product Name : " + name + ", price : " + price;
    }

    // override equals
    public boolean equals(Object o) {
        if (o == this) return true;

        // Cek apakah instance dari Product / bukan Product
        if (!(o instanceof Product)) {
            return false;
        }

        // konversi menjadi Object Product
        Product product = (Product) o;

        if (this.price != product.price) {
            return false;
        }

        if (this.name != null) {
            return this.name.equals(product.name);
        } else {
            return product.name == null;
        }
    }

    // override hashCode
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }
}
