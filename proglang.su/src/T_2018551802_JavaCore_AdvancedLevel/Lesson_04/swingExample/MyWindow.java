package T_2018551802_JavaCore_AdvancedLevel.Lesson_04.swingExample;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame{
    public MyWindow() {
        setBounds(2000, 200, 500,400);
        setTitle("Swim Example");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton jb1 = new JButton("North");
        jb1.setPreferredSize(new Dimension(10,100));
        add(jb1, BorderLayout.NORTH);
        JButton jb2 = new JButton("South");
        add(jb2, BorderLayout.SOUTH);
        JTextArea jta = new JTextArea();
        add(jta, BorderLayout.CENTER);
        setVisible(true);
    }
}