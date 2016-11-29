package Creational.AbstractFactoryPattern;

/**
 * Created by benchen on 11/24/16.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String factory){
        if(factory == null){
            return null;
        }

        if(factory == "color"){
            return new ColorFactory();
        }
        else if (factory == "shape"){
            return new ShapeFactory();
        }
        else{
            //invalid
            return null;
        }
    }
}
