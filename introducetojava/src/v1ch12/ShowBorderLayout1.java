package v1ch12;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Eric on 12/17/2015.
 */
public class ShowBorderLayout1 extends JFrame {
    public ShowBorderLayout1() {

//        JFrame j = new JFrame();
//        j.setLayout(new BorderLayout(5, 10));

        this.setLayout(new BorderLayout(5,10));

        this.add(new JButton("EAST"), BorderLayout.EAST);
        this.add(new JButton("SOUTH"), BorderLayout.SOUTH);
        this.add(new JButton("WEST"), BorderLayout.WEST);
        this.add(new JButton("NORTH"), BorderLayout.NORTH);
        this.add(new JButton("CENTER"), BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        ShowBorderLayout1 frame = new ShowBorderLayout1();
        frame.setTitle("ShowBorderLayout");
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}