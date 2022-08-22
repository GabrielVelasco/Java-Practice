package GUIFirstPrac;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class checkBoxEventListener implements ItemListener {
    private JComboBox comboBox;
    private JCheckBox checkBox1, checkBox2;

    public checkBoxEventListener(JComboBox comboBox, JCheckBox checkBox1, JCheckBox checkBox2){
        this.comboBox = comboBox;
        this.checkBox1 = checkBox1;
        this.checkBox2 = checkBox2;
    }
    @Override
    public void itemStateChanged(ItemEvent e){
        // pressionou algum checkbox
        // mostra times de acordo com o checkbox marcado

        comboBox.removeAllItems();

        if(checkBox1.isSelected()){
            comboBox.addItem("Time de Serie A");
            comboBox.addItem("Time de Serie A");
        }

        if(checkBox2.isSelected()){
            comboBox.addItem("Time de Serie B");
            comboBox.addItem("Time de Serie B");
        }

        if(comboBox.getItemCount() == 0)
            comboBox.addItem("Select");
    }
}
