package org.learning;

public class FavouriteFoods {
    public static void main(String[] args) {
        String[] foods = {"Pizza", "Burger", "Sushi", "Pasta", "Salad", "Tacos", "Ice Cream"};
        int foodNumber = foods.length;
        String favFood = foods[0];
        String leastFavFood = foods[foods.length - 1];

        System.out.println("You have " + foodNumber + " food items in your list. Your favourite food is " + favFood + " and your least favourite is " + leastFavFood);

    }
}
