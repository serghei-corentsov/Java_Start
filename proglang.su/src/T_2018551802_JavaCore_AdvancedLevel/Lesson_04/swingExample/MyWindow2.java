package T_2018551802_JavaCore_AdvancedLevel.Lesson_04.swingExample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow2 extends JFrame{
    private JTextField jtf;

    public MyWindow2() {
        setBounds(2000, 200, 500,400);
        setTitle("Swim Example");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(1,5));
        bottomPanel.setPreferredSize(new Dimension(10, 36));
        for (int i = 1; i <= 4; i++) {
            JButton jb = new JButton("Action #" + i);
            bottomPanel.add(jb);
        }
        jtf = new JTextField();
        jtf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(jtf.getText());
//                jtf.setText("");
                clearMainField();
            }
        });
        bottomPanel.add(jtf);
        JPanel centralPanel = new JPanel(new BorderLayout());
        JTextArea jta = new JTextArea();
        JScrollPane jsp = new JScrollPane(jta);
        centralPanel.add(jsp, BorderLayout.CENTER);

        JButton jbNorth = new JButton("Print North");
        centralPanel.add(jbNorth, BorderLayout.NORTH);
        jbNorth.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.append("North!!!\n");
            }
        });


        add(bottomPanel, BorderLayout.SOUTH);
        add(centralPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void clearMainField() {
        jtf.setText("");
    }
}