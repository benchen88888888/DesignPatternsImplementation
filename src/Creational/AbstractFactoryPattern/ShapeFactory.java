package Creational.AbstractFactoryPattern;

/**
 * Created by benchen on 11/24/16.
 */
public class ShapeFactory extends AbstractFactory{
    @Override
    Color getColor(String color) {
        return null;//Since this is a shape factory you do not get the color
    }

    @Override
    Shape getShape(String shape) {

        if(shape == null){
            return null;
        }

        if(shape.equalsIgnoreCase("circle")){
            return new Circle();
        }
        else if(shape.equalsIgnoreCase("square")){
            return new Square();
        }
        else if(shape.equalsIgnoreCase("rectangle")){
            return  new Rectangle();
        }
        else{
            //invalid answer
            System.out.println("invalid shape");
            return null;
        }
    }
}
