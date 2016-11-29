package Behavioral.State;

/**
 * Created by benchen on 11/26/16.
 */
public class StartState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("player is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return"Start State";
    }
}
