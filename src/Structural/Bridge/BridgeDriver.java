package Structural.Bridge;

/**
 * Created by benchen on 11/26/16.
 */
public class BridgeDriver {
    public static void main(String args[]){
        System.out.println("Bridge Pattern");

        Shape redCircle = new Circle(100,100,10,new RedCircle());
        Shape greenCircle = new Circle(100,100,10,new GreenCircle());

        redCircle.draw();
        greenCircle.draw();

    }
}
