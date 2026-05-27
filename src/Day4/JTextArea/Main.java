package Day4.JTextArea;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,450);
        frame.setLayout(new FlowLayout());

        JTextArea textArea = new JTextArea();

        frame.add(textArea);

        frame.setVisible(true);
    }
}
