package oop_java.implements_case;

// interface defaultnya sudah abstract
// extends ditandakan pewarisan dari interface HasBrand dan IsMaintenance
public interface Car extends HasBrand, IsMaintenance{
    void drive();
    int getTier();

    // default method interface
    default boolean isBig() {
        return true;
    }
}
