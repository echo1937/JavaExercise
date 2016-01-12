package v9;

import java.util.ArrayList;

/**
 * Created by Eric on 1/12/2016.
 */
public class Database {
    private ArrayList<Item> listItem = new ArrayList<Item>();


    public void add(Item item) {
        listItem.add(item);
    }

//    public void list() {
//        for (CD cd : listCD) {
//            cd.print();
//        }
//        for (DVD dvd : listDVD) {
//            dvd.print();
//        }
//    }

    public void list() {
        for (Item item : listItem) {
            item.print();
        }
    }

    public static void main(String[] args) {
        Database db = new Database();

        db.add(new CD("abc", "abc", 4, 60, "..."));
        db.add(new CD("def", "def", 4, 60, "..."));
        db.add(new DVD("xxx", "aaa", 60, "..."));
        db.list();


    }

}
