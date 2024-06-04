package java_dasar;

public class MethodArgument {
    public static void main(String[] args) {
        int[] nilai = {100, 80, 60, 40, 75, 88, 72, 40};
        sayCongrats("Luthfi", nilai);
    }

    static void sayCongrats(String name, int[] data) {
        int total = 0;
        for (int value : data) {
            total += value;
        } 

        int finalValue = total / data.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", anda lulus dengan rata rata nilai anda " + finalValue);
        } else {
            System.out.println("Maaf " + name + ", anda belum lulus dengan rata rata nilai anda " + finalValue);
        }
    }
}