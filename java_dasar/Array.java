package java_dasar;

public class Array {
    public static void main(String[] args) {
        // Cara 1
        Integer[] array = new Integer[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

        for (Integer num : array) {
            System.out.println(num);
        }


        // Cara 2
        byte[] bytes = new byte[]{
            0,1,2,3
        };

        for (byte b : bytes) {
            System.out.println(b);
        }


        // Cara 3
        long[] numbers = {1,2,3,4,5};
        for (long num : numbers) {
            System.out.println(num);
        }


        String[][] kelompok = {
            {"Luthfi", "Izuchii"},
            {"Hutao", "Frieren"},
            {"Topaz", "Izuna"}
        };

        System.out.println(kelompok[1][0]); // Hutao
    }
}
