package java_dasar;

public class TipeDataNonPrimitive { 
    public static void main(String[] args) {
        Long angka;
        Long angkaNull;

        angka = (long) 100;
        angkaNull = null;

        System.out.println(angka);      // 100
        System.out.println(angkaNull);  // null

        
        // primitive conversion to non primitive
        int iniInt = 100;
        Integer iniInt2 = iniInt;

        System.out.println(iniInt2);


        // conversion to Object
        int age = 20;
        Integer ageObject = age;

        int ageAgain = ageObject;

        short shortAge = ageObject.shortValue();
        Short shortValue = ageObject.shortValue();
        byte byteAge = ageObject.byteValue();
        double doubleAge = ageObject.doubleValue();
    }
}