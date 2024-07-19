package oop_java.enum_class;

public enum Level {
//    kebiasaannya menggunakan huruf besar

//    Harus panggil constructor
    STANDARD("Standard Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    private String description;

//    Constructor
    Level(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
