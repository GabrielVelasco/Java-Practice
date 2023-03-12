package frame;

import javax.swing.*;

public class TesteTemp extends JFrame {
    private JPanel panel1;
    private JTextArea textArea1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JCheckBox checkBox1;
    private JButton button1;
    private JButton button2;

    public TesteTemp(){
        super("Asdasd");
        panel1 = new JPanel();
        add(panel1);

        textField1 = new JTextField(); add(textField1);
        textField2 = new JTextField(); add(textField2);
        textField3 = new JTextField(); add(textField3);

        checkBox1 = new JCheckBox(); add(checkBox1);
        button1 = new JButton(); add(button1);
        button2 = new JButton(); add(button2);

    }
}
