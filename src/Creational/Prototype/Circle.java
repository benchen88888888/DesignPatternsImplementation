package Creational.Prototype;

/**
 * Created by benchen on 11/24/16.
 */
public class Circle extends Shape {
    public Circle(){
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}
