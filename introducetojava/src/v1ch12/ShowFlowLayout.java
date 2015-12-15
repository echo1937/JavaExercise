package v1ch12;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Eric on 12/16/2015.
 */
public class ShowFlowLayout extends JFrame {
    public ShowFlowLayout() {
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));

        add(new JLabel("First Name"));
        add(new JTextField(8));
        add(new JLabel("MI"));
        add(new JTextField(2));
        add(new JLabel("Last Name"));
        add(new JTextField(8));
    }

    public static void main(String[] args) {
        ShowFlowLayout frame = new ShowFlowLayout();
        frame.setTitle("ShowFlowLayout");
        frame.setSize(200, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
