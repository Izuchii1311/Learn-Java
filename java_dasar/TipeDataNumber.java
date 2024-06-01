package java_dasar;

public class TipeDataNumber {
    public static void main(String[] args) {
        // Integer number (bilangan bulat)

        byte iniByte    = 100;
        short iniShort  = 1000;
        int iniInt      = 10000000;
        long iniLong    = 1000000000;
        long iniLong2   = 1000000000L;
        System.out.println(iniByte);
        System.out.println(iniShort);
        System.out.println(iniInt);
        System.out.println(iniLong);
        System.out.println(iniLong2);



        // Floating Point number (bilangan pecahan)

        float iniFloat      = 100.100F;
        double iniDouble    = 100.100;

        System.out.println(iniFloat);
        System.out.println(iniDouble);



        // Literals number

        int decimalInt  = 25;
        int hexInt      = 0xFFFFFF;
        int binInt      = 0b01010101;

        System.out.println(decimalInt);
        System.out.println(hexInt);
        System.out.println(binInt);



        // Undescore number

        long balance    = 1_000_000_000_000L;
        int sum         = 60_000_000;

        System.out.println(balance);
        System.out.println(sum);
    }
}
