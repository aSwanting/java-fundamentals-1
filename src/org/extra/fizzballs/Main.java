package org.extra.fizzballs;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

// A Java program that creates a GUI with moving circles, each representing a number, and displays their "FizzBuzz" code.

public class Main extends JComponent {
    static int frameW = 1400; // Width of the frame
    static int frameH = 1000; // Height of the frame
    static int circleCount = 100; // Number of circles to be generated
    static Circle[] circles = new Circle[circleCount]; // Array to store Circle objects

    // Method to initialize the circles with random properties
    public void initCircles() {
        for (int i = 0; i < circleCount; i++) {
            int circleNum = i + 1;
            double r = 60; // Radius of the circle
            // Random coordinates within the frame boundaries
            double x = Math.random() * (frameW - r);
            double y = Math.random() * (frameH - r);
            // Random velocities
            double vx = Math.random() * 8;
            double vy = Math.random() * 8;
            circles[i] = new Circle(r, x, y, vx, vy); // Create a Circle object
            circles[i].fizzBuzz(circleNum); // Calculate and store FizzBuzz code
            circles[i].printProperties(circleNum); // Print circle properties
        }
    }

    // Method to move the circles within the frame
    public void moveCircles() {
        for (Circle circle : circles) {
            // Reverse direction if circle reaches frame boundaries
            if (circle.x < 0 || circle.x > getWidth() - circle.r) circle.vx *= -1;
            if (circle.y < 0 || circle.y > getHeight() - circle.r) circle.vy *= -1;
            circle.x += circle.vx; // Update circle's x coordinate
            circle.y += circle.vy; // Update circle's y coordinate
        }
    }

    // Method to paint the circles and display their numbers and FizzBuzz codes
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int circleNum = 1;

        for (Circle circle : circles) {
            Shape newCircle = new Ellipse2D.Double(circle.x, circle.y, circle.r, circle.r); // Create circle shape
            g2d.draw(newCircle); // Draw the circle
            FontMetrics metrics = g2d.getFontMetrics();
            // Display circle number and FizzBuzz code
            g2d.drawString(Integer.toString(circleNum), (float) ((circle.x + circle.r / 2) - metrics.stringWidth(Integer.toString(circleNum)) / 2), (float) (circle.y + circle.r / 2) - 4);
            g2d.drawString(circle.code, (float) ((circle.x + circle.r / 2) - metrics.stringWidth(circle.code) / 2), (float) (circle.y + circle.r / 2) + 8);
            circleNum++;
        }
    }

    // Main method to create the frame and start the animation
    public static void main(String[] args) throws InterruptedException {

        JFrame frame = new JFrame(); // Create JFrame object
        Main panel = new Main(); // Create Main panel object
        panel.initCircles(); // Initialize circles
        panel.setPreferredSize(new Dimension(frameW, frameH)); // Set preferred size of the panel
        frame.add(panel); // Add panel to the frame
        frame.pack(); // Pack the frame
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Set default close operation
        frame.setLocationRelativeTo(null); // Center the frame on screen
        frame.setVisible(true); // Make the frame visible

        while (true) {
            panel.moveCircles(); // Move the circles
            panel.repaint(); // Repaint the panel
            Thread.sleep(16); // Pause for animation
        }

    }
}
