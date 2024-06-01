package java_dasar;

public class KonversiNumber {
    public static void main(String[] args) {
        // Konversi tipe data number
        /**
         * Widening Casting (Otomatis) : byte -> short -> int -> long -> float -> double
         * Narrowing Casting (Manual)  : double -> float -> long -> int -> short -> byte
         */

        //  Widening Casting (Otomatis)
        byte a = 10;
        short b = a;
        int c = b;
        long d = c;
        float e = d;
        double f = e;

        // Narrowing Casting (Manual)
        float g = (float) f;
        long h = (long) g;
        int i = (int) h;
        short j = (short) i;
        byte k = (byte) j;


        // Jika konversi nilainya tidak sesuai dengan max / min dari setiap tipe datanya maka akan terjadi 'number overflow', jadi setelah dikonversi akan balik lagi kebelakang.
    }
}
