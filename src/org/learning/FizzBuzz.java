package org.learning;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import java.awt.*;

public class FizzBuzz extends JPanel {
    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setLayout(new GridLayout(0, 10));

        for (int i = 1; i < 101; i++) {

            String code = i % 15 == 0 ? "fizzbuzz"
                    : i % 5 == 0 ? "buzz"
                    : i % 3 == 0 ? "fizz"
                    : "";

            JLabel l = new JLabel("<html><div style='text-align:center'><p>" + code + "</p><p>" + i + "</p></div></html>");
            l.setOpaque(true);
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
