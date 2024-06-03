package java_dasar;

public class OperasiMatematika {
    public static void main(String[] args) {
        var a = 10;
        var b = 5;

        System.out.println("Operasi Matematika");
        System.out.println(a + b); // 10 + 5 = 15
        System.out.println(a - b); // 10 - 5 = 5
        System.out.println(a * b); // 10 * 5 = 50
        System.out.println(a / b); // 10 / 5 = 2
        System.out.println(a % b); // 10 % 5 = 0
        System.out.println();

        System.out.println("Augmented Assignment");
        System.out.println(a += b); // a = a + b -> 10 + 5 = 15, a sekarang 15
        System.out.println(a -= b); // a = a - b -> 15 - 5 = 10, a sekarang 10
        System.out.println(a *= b); // a = a * b -> 10 * 5 = 50, a sekarang 50
        System.out.println(a /= b); // a = a / b -> 50 / 5 = 10, a sekarang 10
        System.out.println(a %= b); // a = a % b -> 10 % 5 = 0, a sekarang 0
        System.out.println();

        int c = +100;
        int d = -10;

        System.out.println("Unary Operator");
        c++;    // c = 100 + 1 = 101
        System.out.println(c);
        d--;    // d = -10 - 1 = -11
        System.out.println(d);
        System.out.println(!true);  // false
    }
}
