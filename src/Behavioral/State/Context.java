package Behavioral.State;

/**
 * Created by benchen on 11/26/16.
 */
public class Context {
    private State state;
    public Context(){
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
