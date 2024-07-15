package oop_java.inheritance2;

public class ShapeApp {
    public static void main(String[] args) {
        var shape = new Shape();
        System.out.println(shape.getCorner());              // 0

        var rectangle = new Rectangle();
        System.out.println(rectangle.getCorner());          // 4
        System.out.println(rectangle.getParentCorner());    // 0
    }
}
