package Behavioral.Template;

/**
 * Created by benchen on 11/26/16.
 */
public class Cricket extends Game{
    @Override
    void init() {
        System.out.println("Cricket Game Initializing");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Starting");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Ended");
    }
}
