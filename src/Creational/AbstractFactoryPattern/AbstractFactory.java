package Creational.AbstractFactoryPattern;

/**
 * Created by benchen on 11/24/16.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);

}
