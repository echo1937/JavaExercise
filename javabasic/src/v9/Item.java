package v9;

/**
 * Created by Eric on 1/12/2016.
 */
public class Item {
    private String title;
    private int playingTime;
    private boolean gotIT;
    private String comment;

    public Item() {
    }


    public Item(String title, int playingTime, boolean gotIT, String comment) {
        this.title = title;
        this.playingTime = playingTime;
        this.gotIT = gotIT;
        this.comment = comment;
    }

    public void print() {
        System.out.print(title);

    }
}
