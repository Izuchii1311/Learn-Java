package java_dasar;

public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "A";
        switch (nilai) {
            case "A":
                System.out.println("Wow anda lulus dengan baik.");
                break;
            case "B":
            case "C":
                System.out.println("Wow anda lulus dengan baik.");
                break;
            case "D":
                System.out.println("Anda harus mengulang kembali.");
            default:
                System.out.println("Mungkin anda salah jurusan.");
        }
    }
}
