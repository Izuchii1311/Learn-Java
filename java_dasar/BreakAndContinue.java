package java_dasar;

public class BreakAndContinue {
    public static void main(String[] args) {
        // var counter = 1;
        // while (true) {
        //     System.out.println("Perulangan ke-" + counter);
        //     counter++;

        //     if (counter > 10) {
        //         break;
        //     }
        // }
        // System.out.println("Perulangan selesai");

        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }

            System.out.println("Perulangan ke-" + i);
        }
    }
}
