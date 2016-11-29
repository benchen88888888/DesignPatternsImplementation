package Creational.FactoryMethod;

import sun.security.provider.SHA;

/**
 * Created by benchen on 9/25/16.
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square is drawn");
    }
}
