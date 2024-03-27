package org.learning;

import java.util.Scanner;

public class TrainTicket {
    public static void main(String[] args) {

        final double COST_MULTIPLIER = 0.21;
        double discountMultiplier;
        int distance;
        int age;

        Scanner scan = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("How far do you travel?");
                distance = scan.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("A number is required");
                scan.next();
            }
        }

        while (true) {
            try {
                System.out.println("What is your age?");
                age = scan.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("A number is required");
                scan.next();
            }
        }

        scan.close();

        discountMultiplier = age < 18 ? 0.8 : age > 65 ? 0.6 : 1;
        double price = (distance * COST_MULTIPLIER) * discountMultiplier;

        System.out.println("You must pay " + price + " gold");

    }
}
