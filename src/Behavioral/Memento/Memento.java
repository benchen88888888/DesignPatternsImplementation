package Behavioral.Memento;

/**
 * Created by benchen on 11/26/16.
 */
public class Memento {
    private String state;
    public Memento(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }

}
