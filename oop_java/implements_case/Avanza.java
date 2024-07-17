package oop_java.implements_case;

public class Avanza implements Car{
    public void drive() {
        System.out.println("Avanza Drive");        
    }   
    
    public int getTier() {
        return 4;
    }

    // Interface Extends di Class Utama
    public String getBrand() {
        return "Haha";
    }

    public boolean isMaintenance() {
        return false;
    }
}