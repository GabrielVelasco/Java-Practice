package GUIFirstPrac;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class myButtonListener implements ActionListener {
    private JButton searchBut, butClose;
    private WindowCreator thisFrame;

    public myButtonListener(JButton button1, JButton buttonClose, WindowCreator frame){
        this.searchBut = button1;
        this.butClose = buttonClose;
        this.thisFrame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        // button clicked

        if(e.getSource() == this.searchBut){
            System.out.println("SEATCH PRESSED!");
            for(Component c: thisFrame.getComponents()){
                if(c instanceof JTextField) {
                    System.out.println("asdasd");
                    System.out.println(((JTextField)c).getText());
                }
            }

        }else if(e.getSource() == this.butClose){
            System.out.println("CLOSE BUTTON PRESSED!");
            this.thisFrame.setVisible(false);
        }
    }
}
