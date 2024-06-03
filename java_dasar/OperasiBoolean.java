package java_dasar;

public class OperasiBoolean {
    public static void main(String[] args) {
        var absen = 75;
        var nilai = 60;

        var lulusAbsen = absen >= 75;
        var lulusNilai = nilai >= 80;

        var lulus = lulusAbsen && lulusNilai;
        System.out.println(lulus);                  // false

        var paksaLulus = lulusAbsen || lulusNilai;
        System.out.println(paksaLulus);             // true

        var cekKelulusan = lulusAbsen || lulusNilai;
        System.out.println(!cekKelulusan);          // false
    }
}
