package Behavioral.Strategy;

/**
 * Created by benchen on 11/26/16.
 */
public class OperationAdd implements Strategy{
    @Override
    public int doOperation(int x, int y) {
        return x+y;
    }
}
