package java_dasar;

public class RecursiveMethod {
    public static void main(String[] args) {
        // System.out.println(factorialLoop(5));
        loop(2091210);
    }

    // Stack Overflow
    static void loop(int value) {
        if (value == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop ke-" + value);
            loop(value - 1);
        }
    }

    // Factorial
    // static int factorialLoop(int value) {
    //     if (value == 1) {
    //         return 1;
    //     } else {
    //         return value * factorialLoop(value - 1);
    //     }
    // }


    // Factorial menggunakan perulangan biasa
    // static int factorialLoop(int value) {

    //     // 5! = 5×4×3×2×1 = 120
    //     // 4! = 4×3×2×1 = 24
    //     // 3! = 3×2×1 = 6
    //     // 2! = 2×1 = 2
    //     // 1! = 1

    //     var result = 1;
    //     for (int i = 1; i <= value; i++) {
    //         result *= i;
    //     }

    //     return result;
    // }
}
