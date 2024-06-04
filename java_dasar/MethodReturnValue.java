package java_dasar;

public class MethodReturnValue {
    public static void main(String[] args) {
        var value = methodReturn();
        System.out.println(value);
    }

    static String methodReturn() {
        return "Hallo";
    }
}
