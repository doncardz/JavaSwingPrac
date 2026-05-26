package Day3.JCheckBox;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CheckBox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,450);
        frame.setLayout(new FlowLayout());

        JCheckBox checkBoxMale = new JCheckBox("Male");
        JCheckBox checkBoxFemale = new JCheckBox("Female");

        frame.add(checkBoxMale);
        frame.add(checkBoxFemale);

        frame.setVisible(true);
    }
}
