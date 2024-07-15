package oop_java.variabel_hiding;

public class MainClass {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "Agus";
        child.doIt();                       // do it in child
        System.out.println(child.name);     // agus

        Parent parent = (Parent) child;
        parent.doIt();                      // do it in child  
        System.out.println(parent.name);    // null
    }
}
