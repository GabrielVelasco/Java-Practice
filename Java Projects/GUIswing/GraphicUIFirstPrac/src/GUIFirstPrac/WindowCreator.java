package GUIFirstPrac;

import javax.swing.*;
import java.awt.*;

public class WindowCreator extends JFrame {
    private JLabel label1;
    private JTextField textField1;
    private JButton button1;
    private JButton buttonClose;
    private JCheckBox checkBox1, checkBox2;
    private JComboBox comboBox1;

    public WindowCreator(){
        super("Window Tittle");
        setLayout(new FlowLayout());

        // create components and add to frame/panel
        this.label1 = new JLabel("Player's name: ");
        this.add(label1);

        this.textField1 = new JTextField(25);
        this.add(textField1);

        // allocate component
        this.button1 = new JButton("SEARCH");
        this.buttonClose = new JButton("CLOSE");
        // instantiate / create listener
        myButtonListener evtListener = new myButtonListener(button1, buttonClose, this);
        this.buttonClose.addActionListener(evtListener); this.button1.addActionListener(evtListener);
        // add to frame
        this.add(button1);
        this.add(buttonClose);

        this.comboBox1 = new JComboBox();
        this.comboBox1.addItem("Select");
        this.add(comboBox1);    // add to frame

        this.checkBox1 = new JCheckBox("Serie A");
        this.checkBox2 = new JCheckBox("Serie B");
        checkBoxEventListener checkBoxListener = new checkBoxEventListener(this.comboBox1, this.checkBox1, this.checkBox2);
        this.checkBox1.addItemListener(checkBoxListener); this.checkBox2.addItemListener(checkBoxListener);
        this.add(checkBox1);
        this.add(checkBox2);
    }
}
