package v1ch12;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Eric on 12/17/2015.
 */
public class ContentPane {
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        // 每个JFrame都包含一个内容窗格
        // JDK 1.4 的用法,取得其 Content Pane
        Container contentPane = frame.getContentPane();

        // 定義 Layout Manager 為 FlowLayout
        contentPane.setLayout(new FlowLayout());
        // 將物件加至 Content Pane 中
        contentPane.add(new JButton("OK"));


        frame.setTitle("ShowFlowLayout");
        frame.setSize(1000, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
