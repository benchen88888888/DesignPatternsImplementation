package Creational.Prototype;

/**
 * Created by benchen on 11/24/16.
 */
public class Square extends Shape {
    public Square(){
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Draw a square");
    }
}
