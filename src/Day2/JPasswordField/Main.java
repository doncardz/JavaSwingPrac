package Day2.JPasswordField;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Log In");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,450);
        frame.setLayout(new FlowLayout());

        JLabel userLabel = new JLabel("Enter your user: ");
        JTextField textField = new JTextField(15);

        JLabel passLabel = new JLabel("Enter your pass: ");
        JPasswordField pass = new JPasswordField(15);

        JButton btn = new JButton("Log in");

        frame.add(userLabel);
        frame.add(textField);

        frame.add(passLabel);
        frame.add(pass);

        frame.add(btn);

        frame.setVisible(true);
    }
}
