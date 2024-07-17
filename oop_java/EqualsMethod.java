package oop_java;

public class EqualsMethod {
    public static void main(String[] args) {
        String first = "Luthfi";
        first = first + " Nur Ramadhan";
        System.out.println(first);

        String second = "Luthfi Nur Ramadhan";
        System.out.println(second);

        // membandingkan
        System.out.println(first == second);        // false    yang dibandingkannya adalah objectnya bukan isi dari string
        
        String third = "Luthfi Nur Ramadhan";
        System.out.println(second == third);        // true     
        // kenapa tidak false? karena isinya sudah ada di memory second dan jika sama maka tidak akan dibuat ulang
        
        // oleh karena itu idealnya membandingkan menggunakan equals
        System.out.println(first.equals(second));   // true     karena yang dibandingkan isi dari objectnya
    }
}
