package Structural.Bridge;

/**
 * Created by benchen on 11/26/16.
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Red Circle with radius: "+radius+" x: "+x+" y: "+y );

    }
}
