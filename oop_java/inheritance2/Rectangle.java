package oop_java.inheritance2;

class Rectangle extends Shape{
    int getCorner() {
        return 4;
    }

    int getParentCorner() {
        return super.getCorner();
    }
}
