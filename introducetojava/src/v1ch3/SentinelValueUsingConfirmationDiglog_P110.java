package v1ch3;

import javax.swing.*;
import javax.swing.text.StringContent;

/**
 * Created by Eric on 12/7/2015.
 */
public class SentinelValueUsingConfirmationDiglog_P110 {
    public static void main(String[] args) {
        int sum = 0;
        int option;
        do {
            String dataString = JOptionPane.showInputDialog("Enter an int value: ");
            int data = Integer.parseInt(dataString);
            sum += data;
            option = JOptionPane.showConfirmDialog(null, "Continue?");

        } while (option == JOptionPane.YES_OPTION);
        JOptionPane.showMessageDialog(null, "This sum is " + sum);
    }
}
