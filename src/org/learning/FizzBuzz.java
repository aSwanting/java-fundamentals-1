package org.learning;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import java.awt.*;

public class FizzBuzz extends JPanel {
    public static void main(String[] args) {

        JFrame f = new JFrame("Fizz and Buzz!");
        f.setLayout(new GridLayout(0, 10));

        for (int i = 1; i < 101; i++) {

            String code = "";
            Color colorCode = new Color(173, 217, 143, 128);

            if (i % 15 == 0) {
                code = "fizzbuzz";
                colorCode = new Color(204, 118, 232, 128);

            } else if (i % 5 == 0) {
                code = "buzz";
                colorCode = new Color(62, 168, 76, 128);

            } else if (i % 3 == 0) {
                code = "fizz";
                colorCode = new Color(204, 98, 23, 128);
            }

            JLabel l = new JLabel("<html><div style='text-align:center'><p>" + code + "</p><p>" + i + "</p></div></html>");
            l.setOpaque(true);
            l.setBackground(colorCode);
            l.setHorizontalAlignment(JLabel.CENTER);
            l.setBorder(BorderFactory.createCompoundBorder(
                    new EtchedBorder(),
                    new EmptyBorder(20, 20, 20, 20)
            ));
            f.add(l);
        }

        f.pack();
        f.setVisible(true);
    }
}
