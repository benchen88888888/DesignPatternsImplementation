package Structural.Proxy;

/**
 * Created by benchen on 11/26/16.
 */
public class ProxyDriver {
    public static void main(String args[]){
        System.out.println("Proxy Pattern");
        Image image = new ProxyImage("appa.png");
        //image was loaded in disk
        image.display();
        System.out.println();
        //imsage will not be loadded from disk
        image.display();
    }
}
