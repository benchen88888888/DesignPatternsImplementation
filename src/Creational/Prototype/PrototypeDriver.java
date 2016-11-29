package Creational.Prototype;

/**
 * Created by benchen on 11/24/16.
 */
public class PrototypeDriver {
    public static void main(String args[]){
        System.out.println("Prototype Pattern");
        ShapeCache.loadCache();

        Shape clonedShape1 = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape: "+clonedShape1.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape: "+clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape: "+clonedShape3.getType());
    }
}
