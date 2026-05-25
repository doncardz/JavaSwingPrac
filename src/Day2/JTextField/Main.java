package Day2.JTextField;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Web App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,450);
        frame.setLayout(new BorderLayout());

        JTextField textField = new JTextField();
        frame.add(textField, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
