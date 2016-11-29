package Structural.Adapter;

/**
 * Created by benchen on 11/24/16.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing Mp4 File.  Name: "+fileName);
    }

    @Override
    public void playVlc(String fileName) {
        System.out.println("Does Nothing");
    }
}
