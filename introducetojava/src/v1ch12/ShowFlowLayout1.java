package v1ch12;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Eric on 12/17/2015.
 */
public class ShowFlowLayout1 {
    public static void main(String[] args) {
        FlowLayout flowLayout = new FlowLayout();
        //创建flow布局管理器,设置布局管理器属性
        flowLayout.setAlignment(FlowLayout.LEFT);
        flowLayout.setHgap(10);
        flowLayout.setVgap(20);

        JFrame frame = new JFrame();
        //创建JFrame框架,设置其布局管理器
        frame.setLayout(flowLayout);
        //向JFrame框架内添加组件
        frame.add(new JLabel("First Name"));
        frame.add(new JTextField(8));
        frame.add(new JLabel("MI"));
        frame.add(new JTextField(2));
        frame.add(new JLabel("Last Name"));
        frame.add(new JTextField(8));

        //设置frame属性并使其可见
        frame.setTitle("ShowFlowLayout");
        frame.setSize(1000, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
