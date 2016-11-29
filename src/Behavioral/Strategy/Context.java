package Behavioral.Strategy;

/**
 * Created by benchen on 11/26/16.
 */
public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int x,int y){
        return strategy.doOperation(x,y);
    }
}
