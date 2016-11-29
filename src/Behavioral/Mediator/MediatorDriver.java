package Behavioral.Mediator;

/**
 * Created by benchen on 11/26/16.
 */
public class MediatorDriver {
    public static void main(String args[]){
        User denise = new User("Denise");
        User ben = new User("Ben");
        denise.sendMessage("Herp");
        ben.sendMessage("A Derp");
    }
}
