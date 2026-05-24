package Day1.JLabel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Practice");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,450);
        frame.setLayout(new BorderLayout());

        JLabel label = new JLabel("Hello World");
        frame.add(label, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
