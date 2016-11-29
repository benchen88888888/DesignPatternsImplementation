package Creational.AbstractFactoryPattern;

/**
 * Created by benchen on 11/23/16.
 */
public class AbstractFactoryDriver {
    public static void main(String args[]){
        System.out.println("This is the abstract factory method");
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");

        Shape shape1 = shapeFactory.getShape("square");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("circle");
        shape2.draw();

        Color color1 = colorFactory.getColor("red");
        color1.fill();
        Color color2 = colorFactory.getColor("blue");
        color2.fill();

    }
}
