package Behavioral.Template;

/**
 * Created by benchen on 11/26/16.
 */
public class TemplateDriver {
    public static void main(String args[]){
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new AppaHype();
        game.play();
    }
}
