package Behavioral.Template;

/**
 * Created by benchen on 11/26/16.
 */
public class AppaHype extends Game{
    @Override
    void init() {
        System.out.println("Getting the Appa");
    }

    @Override
    void startPlay() {
        System.out.println("Yip Yip!");
    }

    @Override
    void endPlay() {
        System.out.println("Appa landed");
    }
}
