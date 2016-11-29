package Structural.Decorator;

/**
 * Created by benchen on 11/26/16.
 */
public class BlueShapeDecorator extends ShapeDecorator{
    public BlueShapeDecorator(Shape decoratedShape){
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setBlueBorder(decoratedShape);
    }

    private void setBlueBorder(Shape decoratedShape){
        System.out.println("Border Color: Blue");
    }
}
