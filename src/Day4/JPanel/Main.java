package Day4.JPanel;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,450);

        JPanel panel = new JPanel();

        panel.setBackground(Color.BLUE);

        JButton button = new JButton("Click me");

        panel.add(button);

        frame.add(panel);

        frame.setVisible(true);
    }
}
