package T_2018551802_JavaCore_AdvancedLevel.Lesson_04_HomeWork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Chat extends JFrame{
    public static void main(String[] args) {
        new Chat();
    }

    private JPanel bottomPanel, centralPanel;
    private JButton jb;
    private JTextField jtf;
    private JTextArea jta;
    private JScrollPane jsp;

    public Chat() {
        setBounds(1800, 200, 600, 700);
        setTitle("Чат");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(1,5));
        bottomPanel.setPreferredSize(new Dimension(10, 50));

        jtf = new JTextField();
        jb = new JButton("Send");
        jtf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(jtf.getText());
                jtf.setText("");
            }
        });
        bottomPanel.add(jtf);

        bottomPanel.add(jb);
        centralPanel = new JPanel(new BorderLayout());
        jta = new JTextArea();
        jsp = new JScrollPane(jta);
        centralPanel.add(jsp, BorderLayout.CENTER);


        add(bottomPanel, BorderLayout.SOUTH);
        add(centralPanel, BorderLayout.CENTER);
        setVisible(true);
    }
}