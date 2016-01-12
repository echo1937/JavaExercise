package v9;

/**
 * Created by Eric on 1/12/2016.
 */
public class CD extends Item {
    private String title;
    private String artist;
    private int numofTracks;
    private int playingTime;
    private boolean gotIT;
    private String comment;


    public CD(String title, String artist, int numofTracks, int playingTime, String comment) {
        this.title = title;
        this.artist = artist;
        this.numofTracks = numofTracks;
        this.playingTime = playingTime;
        this.comment = comment;
    }

    public static void main(String[] args) {

    }

    public void print() {
        System.out.println("CD:" + title + ":" + artist);
    }
}
