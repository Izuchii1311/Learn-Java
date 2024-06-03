package java_dasar;

public class DoWhileLoop {
    public static void main(String[] args) {
        var i = 0;
        do {
            System.out.println("Perulangan menggunakan Do While Loop Ke-" + i);
            i++;
        } while (i <= 10);      // jika bernilai true maka code yang ada di dalam block do akan diulangngi sebanyak nilainya.
    }
}
