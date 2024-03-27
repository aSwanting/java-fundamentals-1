package org.learning;

public class FavouriteFoods {
    public static void main(String[] args) {
        String[] foods = {"Pizza", "Burger", "Sushi", "Pasta", "Salad", "Tacos", "Ice Cream"};
        int foodNumber = foods.length;
        String topFavFood = foods[0];
        String midFavFood = foods[foodNumber / 2];
        String leastFavFood = foods[foods.length - 1];
        System.out.print(
                "You have " + foodNumber + " food items in your list. Your top food is "
                        + topFavFood + ", your middle is " + midFavFood
                        + " and your least favourite is " + leastFavFood + "."
        );
    }
}
