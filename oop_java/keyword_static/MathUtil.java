package oop_java.keyword_static;

public class MathUtil {
    // Method Static
    public static int sum(int... values) {
        int total = 0;
        for(var value : values) {
            total += value;
        }

        return total;
    }
}
