package Day1.JButton;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Added Button");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,450);
        frame.setLayout(new BorderLayout());

        JButton button = new JButton("Click Me!");
        frame.add(button, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
