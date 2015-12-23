package v1ch14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Eric on 12/23/2015.
 */


class OKListenerClass implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("OK button clicked");

    }
}

class CancelListenerClass implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Cancel button clicked");
    }
}

public class HandleEvent extends JFrame {
    public HandleEvent() throws HeadlessException {
        JButton jbtOK = new JButton("OK");
        JButton jbtCancel = new JButton("Cancel");

        JPanel panel = new JPanel();
        panel.add(jbtOK);
        panel.add(jbtCancel);

        this.add(panel);
        OKListenerClass okListenerClass = new OKListenerClass();
        CancelListenerClass cancelListenerClass = new CancelListenerClass();

        jbtOK.addActionListener(okListenerClass);
        jbtCancel.addActionListener(cancelListenerClass);

    }

    public static void main(String[] args) {
        JFrame frame = new HandleEvent();
        frame.setTitle("Handle Event");
        frame.setSize(200, 150);
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
