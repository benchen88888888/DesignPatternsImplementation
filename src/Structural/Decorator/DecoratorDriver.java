package Structural.Decorator;

/**
 * Created by benchen on 11/26/16.
 */
public class DecoratorDriver {
    public static void main(String args[]){


        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape blueRectangle = new BlueShapeDecorator(new Rectangle());

        circle.draw();
        System.out.println("----------------------------");
        redCircle.draw();
        System.out.println("----------------------------");
        blueRectangle.draw();
    }
}
