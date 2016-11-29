package Structural.Adapter;



/**
 * Created by benchen on 11/24/16.
 */
public class AdapterDriver {
    public static void main(String args[]){
        AudioAdapter audioPlayer = new AudioAdapter();
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
