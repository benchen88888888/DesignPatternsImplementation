package Structural.Facade;

/**
 * Created by benchen on 11/26/16.
 */
public class FacadeDriver {
    public static void main(String args[]){
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCricle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
