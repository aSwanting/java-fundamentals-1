package org.extra.fizzballs;

// A class representing a circle with its properties and FizzBuzz code

public class Circle {
    double r, x, y, vx, vy; // Properties of the circle
    String code = ""; // FizzBuzz code associated with the circle

    // Constructor to initialize circle properties
    public Circle(double r, double x, double y, double vx, double vy) {
        this.r = r; // Radius
        this.x = x; // x-coordinate of the center
        this.y = y; // y-coordinate of the center
        this.vx = vx; // x-velocity
        this.vy = vy; // y-velocity
    }

    // Method to print circle properties
    public void printProperties(int circleNum) {
        System.out.println("Circle: " + circleNum + " " + code);
        System.out.println("r: " + this.r); // Radius
        System.out.println("x: " + this.x); // x-coordinate of the center
        System.out.println("y: " + this.y); // y-coordinate of the center
        System.out.println("vx: " + this.vx); // x-velocity
        System.out.println("vy: " + this.vy); // y-velocity
        System.out.println(" ");
    }

    // Method to calculate and assign FizzBuzz code to the circle
    public void fizzBuzz(int circleNum) {
        if (circleNum % 15 == 0) {
            code = "fizzbuzz"; // If circleNum is divisible by both 3 and 5
        } else if (circleNum % 5 == 0) {
            code = "buzz"; // If circleNum is divisible by 5 only
        } else if (circleNum % 3 == 0) {
            code = "fizz"; // If circleNum is divisible by 3 only
        }
    }
}
