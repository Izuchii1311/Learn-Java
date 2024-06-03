package java_dasar;

public class SwitchYeild {
    public static void main(String[] args) {
        // Tanpa menggunakan yield
        
        var nilai = "A";
        String message;

        switch (nilai) {
            case "A" -> message = "Nilai anda sangat baik.";
            case "B", "C" -> message = "Nilai anda cukup.";
            case "D" -> message = "Nilai anda kecil & harus mengulanginya kembali.";
            default -> message = "Anda tidak lulus.";
        };
        System.out.println(message);


        // Menggunakan yield

        var absen = "A";
        String absenMessage = switch (absen) {
            case "A": 
                yield "Absensi anda sangat baik.";
            case "B", "C": 
                yield "Absensi anda sangat baik.";
            case "D" : 
                yield "Absensi anda sangat baik.";
            default :
                yield "Anda harus selalu hadir!!";
        };
        System.out.println(absenMessage);
    }
}
