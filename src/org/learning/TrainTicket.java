package org.learning;

import java.util.Scanner;

public class TrainTicket {
    public static void main(String[] args) {

        final double COST_MULTIPLIER = 0.21;
        double discountMultiplier;
        int distance, age;

        Scanner scan = new Scanner(System.in);

        System.out.println("How far do you travel?");
        distance = scan.nextInt();

        System.out.println("What is your age?");
        age = scan.nextInt();

        scan.close();

        discountMultiplier = age < 18 ? 0.8 : age > 65 ? 0.6 : 1;
        double price = (distance * COST_MULTIPLIER) * discountMultiplier;

        System.out.println("You must pay " + price + " gold");

    }
}
