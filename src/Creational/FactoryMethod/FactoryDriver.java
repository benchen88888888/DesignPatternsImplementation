package Creational.FactoryMethod;

/**
 * Created by benchen on 9/25/16.
 */
public class FactoryDriver {
    public static void main(String args[]){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.draw();
    }
}
