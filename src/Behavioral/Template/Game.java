package Behavioral.Template;

/**
 * Created by benchen on 11/26/16.
 */
public abstract class Game {
    abstract void init();
    abstract void startPlay();
    abstract void endPlay();

    public final void play(){
        init();
        startPlay();
        endPlay();
    }
}
