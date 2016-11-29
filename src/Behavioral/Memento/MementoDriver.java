package Behavioral.Memento;

/**
 * Created by benchen on 11/26/16.
 */
public class MementoDriver {
    public static void main(String args[]){
        Orginator orginator = new Orginator();
        CareTaker careTaker = new CareTaker();

        orginator.setState("State 1");
        orginator.setState("State 2");
        careTaker.add(orginator.saveStateToMemento());

        orginator.setState("State 3");
        careTaker.add(orginator.saveStateToMemento());

        orginator.setState("State 4");
        System.out.println("Current State: " + orginator.getState());

        orginator.getStateFromMomento(careTaker.get(0));
        System.out.println("First saved State: " + orginator.getState());
        orginator.getStateFromMomento(careTaker.get(1));
        System.out.println("Second saved State: " + orginator.getState());
    }
}
