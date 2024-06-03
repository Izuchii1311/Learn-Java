package java_dasar;

public class SwitchLambda {
    public static void main(String[] args) {
        var nilai = "A";
        switch (nilai) {
            case "A" -> System.out.println("Wow anda lulus dengan baik.");
            case "B", "C" -> System.out.println("Wow anda lulus.");
            case "D", "E" -> System.out.println("Anda harus mengulang kembali.");
            default -> System.out.println("Mungkin anda salah jurusan.");
        }
    }
}
