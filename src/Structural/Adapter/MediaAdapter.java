package Structural.Adapter;

/**
 * Created by benchen on 11/24/16.
 */
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioTYpe){
        if(audioTYpe.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new VlcPlayer();
        }
        else if(audioTYpe.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
        else{
            System.out.println("ERROR: Not in the list of media adapters");
            advancedMediaPlayer = null;
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(fileName);
        }
        else if(audioType.equalsIgnoreCase(fileName)){
            advancedMediaPlayer.playMp4(fileName);
        }
        else{
            //Do nothing
            System.out.println("Cannot Play an unknown file format");
        }
    }
}
