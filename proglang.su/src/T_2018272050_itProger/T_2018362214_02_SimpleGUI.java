package T_2018272050_itProger;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class T_2018362214_02_SimpleGUI extends JFrame {
    private JButton button = new JButton("Press");
    private JTextField input = new JTextField("", 5);
    private JLabel label = new JLabel("Введите текст: ");
    private JRadioButton radio1 = new JRadioButton("Radio #1");
    private JRadioButton radio2 = new JRadioButton("Radio #2");
    private JCheckBox check = new JCheckBox("Проверка", false);

    public T_2018362214_02_SimpleGUI(){
        super("Пример окна");
        this.setBounds(100, 50, 250, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(label);
        container.add(input);

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        container.add(radio1);
        radio1.setSelected(true);
        container.add(radio2);
        container.add(check);
        button.addActionListener(new ButtonEventListener ());
        container.add(button);
    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = "Кнопка была нажата \n" + "Вы ввели: " + input.getText() + "\n" + (radio1.isSelected() ? "Radio #1" : "Radio #2") + " выбранно! \n" + "Проверка " + ((check.isSelected()) ? "выполнена" : "не выполнена");
//            String message = "";
//            message += "Кнопка была нажата \n";
//            message += "Вы ввели: " + input.getText() + "\n";
//            message += (radio1.isSelected() ? "Radio #1" : "Radio #2") + " выбранно! \n";
//            message += "Проверка " + ((check.isSelected()) ? "выполнена" : "не выполнена");
            JOptionPane.showMessageDialog(null, message, "Вывод", JOptionPane.PLAIN_MESSAGE);
        }
    }
}