package v1ch12;

import com.sun.org.apache.bcel.internal.generic.NEW;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

/**
 * Created by Eric on 12/17/2015.
 */
public class TestSwingCommonFeatures extends JFrame {
    public TestSwingCommonFeatures() {
        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 2, 2));
        JButton jbtLeft = new JButton("LEFT");
        JButton jbtCenter = new JButton("Center");
        JButton jbtRight = new JButton("Right");
        jbtLeft.setBackground(Color.WHITE);
        jbtCenter.setForeground(Color.GREEN);
        jbtRight.setToolTipText("This is the Right button");

        p1.add(jbtLeft);
        p1.add(jbtCenter);
        p1.add(jbtRight);
        p1.setBorder(new TitledBorder("Three Buttons"));

        Font largeFont = new Font("TimesRoman", Font.BOLD, 2);
        Border lineBorder = new LineBorder(Color.black, 2);

        JPanel p2 = new JPanel(new GridLayout(1, 2, 5, 5));
        JLabel jlblRed = new JLabel("Red");
        JLabel jlblOrange = new JLabel("Orange");
        jlblRed.setForeground(Color.RED);
        jlblOrange.setForeground(Color.orange);
        jlblRed.setFont(largeFont);
        jlblOrange.setFont(largeFont);
        jlblRed.setBorder(lineBorder);
        jlblOrange.setBorder(lineBorder);

        p2.add(jlblRed);
        p2.add(jlblOrange);
        p2.setBorder(new TitledBorder("Two Lables"));

        this.setLayout(new GridLayout(2, 1, 5, 5));
        this.add(p1);
        this.add(p2);

    }

    public static void main(String[] args) {
        JFrame frame = new TestSwingCommonFeatures();
        frame.setTitle("TestSwingCommonFeatures");
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
