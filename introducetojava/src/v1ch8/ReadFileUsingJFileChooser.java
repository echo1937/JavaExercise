package v1ch8;

import javax.swing.*;
import java.io.File;
import java.util.Scanner;

/**
 * Created by Eric on 12/13/15.
 */
public class ReadFileUsingJFileChooser {
    public static void main(String[] args) throws Exception {
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                System.out.println(input.nextLine());
            }
            input.close();
        }
        else System.out.println("no file select");
    }
}
