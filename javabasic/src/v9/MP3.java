package v9;

/**
 * Created by Eric on 1/13/2016.
 */
public class MP3 extends Item {
    private String artist;
    private int bitrate;

    public MP3(String title, String artist, int playingTime, boolean gotIT, int bitrate, String comment) {
        super(title, playingTime, gotIT, comment);
        this.artist = artist;
        this.bitrate = bitrate;

    }

    public static void main(String[] args) {
        MP3 mp3 = new MP3("Welcome to New York ", "Taylor Swift", 212, true, 320, "I love this song -- eric");
        mp3.print();
    }

    @Override
    public void print() {
        System.out.println("MP3: ");
        System.out.print("\t<<");
        super.print();
        System.out.println(">> by " + artist);
    }
}
