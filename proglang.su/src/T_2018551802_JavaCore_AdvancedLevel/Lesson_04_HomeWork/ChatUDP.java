package T_2018551802_JavaCore_AdvancedLevel.Lesson_04_HomeWork;

import javax.swing.*;
import java.awt.*;

public class ChatUDP extends JFrame{
    private class thdfReceiver extends Thread {
        @Override
        public void start() {
            super.start();
//            System.out.println("Hello from thread");
        }
    }

    private void antistatic() {
        frameDraw(new ChatUDP());
        new thdfReceiver().start();
    }
    public static void main(String[] args) {
        new ChatUDP().antistatic();
    }

    private JTextArea jta;
    private JTextField jtf;
    private JScrollPane jsp;
    private JButton btnSend;

    private final String FRM_Title = "Наш Чат";
    private final int FRM_LOC_X = 1800;
    private final int FRM_LOC_Y = 100;
    private final int FRM_WIDH = 400;
    private final int FRM_HEIGHT = 400;

    public void frameDraw(JFrame frame) {
        jtf = new JTextField();
        jta = new JTextArea(FRM_HEIGHT/19, 50);
        jsp = new JScrollPane(jta);

        jsp.setLocation(0, 0);
        jta.setLineWrap(true);

        btnSend = new JButton("Send1");
        btnSend.setText("Send");
        btnSend.setToolTipText("Message");
        btnSend.addActionListener(e -> {
            jta.append("button works");
        });

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle(FRM_Title);
        frame.setLocation(FRM_LOC_X, FRM_LOC_Y);
        frame.setSize(FRM_WIDH, FRM_HEIGHT);
        frame.setResizable(false);
        frame.getContentPane().add(BorderLayout.NORTH, jsp);
        frame.getContentPane().add(BorderLayout.CENTER, jtf);
        frame.getContentPane().add(BorderLayout.EAST, btnSend);
        frame.setVisible(true);
    }
}