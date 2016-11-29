package Behavioral.Memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by benchen on 11/26/16.
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();
    public void add(Memento state){
        mementoList.add(state);
    }
    public Memento get(int index){
        return mementoList.get(index);
    }
}
