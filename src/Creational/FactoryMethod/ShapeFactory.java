package Creational.FactoryMethod;

/**
 * Created by benchen on 9/25/16.
 */
public class ShapeFactory {
    public Shape getShape(String shape){
        if(shape.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        else if(shape.equalsIgnoreCase("Square")){
            return new Square();
        }
        else{
            return null;
        }
    }
}
