package Structural.Facade;

/**
 * Created by benchen on 11/26/16.
 */
public class ShapeMaker {
    private Shape circle;
    private Shape square;
    private Shape rectangle;

    public ShapeMaker(){
        circle = new Circle();
        square = new Square();
        rectangle = new Rectangle();
    }

    public void drawCricle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }

}
