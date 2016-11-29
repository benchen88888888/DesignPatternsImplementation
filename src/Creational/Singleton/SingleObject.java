package Creational.Singleton;

/**
 * Created by benchen on 11/24/16.
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject(){}//We do not want another instance to be made therefore keep it private

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("I am the only Appa");
    }
}
