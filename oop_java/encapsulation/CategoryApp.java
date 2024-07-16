package oop_java.encapsulation;

public class CategoryApp {
    public static void main(String[] args) {
        var category = new Category();
        // category.setId(null);                       // ID tidak boleh kosong
        category.setId("2");                        // ID tidak boleh kosong
        System.out.println(category.getId());          // 2
    }
}
