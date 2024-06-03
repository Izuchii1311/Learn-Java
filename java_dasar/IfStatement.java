package java_dasar;

public class IfStatement {
    public static void main(String[] args) {
        var nilai = 80;
        var absen = 60;
        
        if (nilai >= 75) {
            System.out.println("Nilai anda Lulus.");    
        } else {
            System.out.println("Nilai anda Belum Lulus.");
        }
        if (absen >= 75) {
            System.out.println("Absen anda Lulus.");
        } else {
            System.out.println("Absen anda Belum Lulus.");
        }
        
        var lulus = nilai >= 75 && absen >= 75;
        System.out.println(lulus);
        if (lulus == true) {
            System.out.println("Anda dinyatakan lulus");
        } else {
            System.out.println("Anda belum dinyatakan lulus");
        }
    }
}
