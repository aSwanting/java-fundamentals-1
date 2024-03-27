package org.learning;

import java.util.Arrays;
import java.util.Scanner;

public class GuestList {
    public static void main(String[] args) {
        String[] guestList = {
                "Dua Lipa",
                "Paris Hilton",
                "Manuel Agnelli",
                "J-Ax",
                "Francesco Totti",
                "Ilary Blasi",
                "Bebe Vio",
                "Luis",
                "Pardis Zarei",
                "Martina Maccherone",
                "Rachel Zeilic"
        };

        Scanner scan = new Scanner(System.in);
        System.out.println("Name Please");
        String userName = scan.nextLine();

        if (Arrays.asList(guestList).contains(userName)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Get back!");
        }


    }
}
