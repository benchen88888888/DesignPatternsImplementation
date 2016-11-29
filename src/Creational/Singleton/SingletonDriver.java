package Creational.Singleton;

/**
 * Created by benchen on 11/24/16.
 */
public class SingletonDriver {
    public static void main(String args[]){
        System.out.println("This is the Singleton Pattern");
        SingleObject appa = SingleObject.getInstance();
        appa.showMessage();
    }
}
