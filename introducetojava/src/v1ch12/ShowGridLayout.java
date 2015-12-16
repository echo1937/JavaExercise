package v1ch12;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Eric on 12/16/2015.
 */
public class ShowGridLayout extends JFrame {
    public ShowGridLayout() {
        setLayout(new GridLayout(3, 2, 5, 5));

        add(new JLabel("First Name"));
        add(new JTextField(8));
        add(new JLabel("MI"));
        add(new JTextField(2));
        add(new JLabel("Last Name"));
        add(new JTextField(8));
    }

    public static void main(String[] args) {
        ShowGridLayout frame = new ShowGridLayout();
        frame.setTitle("ShowFlowLayout");
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
