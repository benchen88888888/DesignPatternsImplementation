package Creational.Prototype;

/**
 * Created by benchen on 11/24/16.
 */
public class Rectangle extends Shape {
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Draw the rectangle");
    }
}
