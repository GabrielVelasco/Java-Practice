package GUIFirstPrac;

import javax.swing.*;

public class Main {
    public static void basicInputDialogStaticOption(){
        Object[] possibleValues = new Object[3];
        possibleValues[0] = "first";
        possibleValues[1] = "second";
        possibleValues[2] = "third";

        Object tmp = JOptionPane.showInputDialog(null,"Label",
                "window title",JOptionPane.INFORMATION_MESSAGE,
                null,possibleValues,possibleValues[2]); // return the selected option
        System.out.println(tmp);
    }

    public static void inputDialogSingleTextEntry(){
        String num1, num2;

        num1 = JOptionPane.showInputDialog("Type num1:");
        num2 = JOptionPane.showInputDialog("Type num2: ");
        int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
        String ans = "sum = " + sum;

        JOptionPane.showMessageDialog(null, ans);

    }

    public static void swingFirstWindow(){
        // form to search for a player

        WindowCreator myWindow = new WindowCreator();
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setSize(500, 300);
        myWindow.setVisible(true);
    }

    public static void main(String[] args) {
        swingFirstWindow();
    }
}