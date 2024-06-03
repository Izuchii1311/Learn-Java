package java_dasar;

public class OperasiPerbandingan {
    public static void main(String[] args) {
        var a = 10;
        var b = 5;

        System.out.println(a > b);      // true
        System.out.println(b > a);      // false
        System.out.println(a >= b);     // true
        System.out.println(b >= a);     // false
        System.out.println(a == b);     // false
        System.out.println(a == a);     // true
        System.out.println(a != a);     // false
        System.out.println(a != b);     // true

        var c = 1;
        var d = 1;
        System.out.println();
        System.out.println(c >= d);     // true
        System.out.println(c <= d);     // true
    }
}
