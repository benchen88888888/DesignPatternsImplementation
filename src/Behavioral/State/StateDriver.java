package Behavioral.State;

/**
 * Created by benchen on 11/26/16.
 */
public class StateDriver {
    public static void main(String args[]){
        Context context = new Context();
        System.out.println("State Pattern");
        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
