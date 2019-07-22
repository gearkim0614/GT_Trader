package com.example.gttrader.Entity;
//import java.util.Random;

/**
 * class representing the food good
 */
public class Food extends Goods {
    /**
     * Method which creates the food good
     */
    public Food() {
        super("Food", 1, 0, 1, 100, 5, 5, PriceIncreaseEvent.NORTHAVECLOSE, Resource.RICHSOIL,
                Resource.POORSOIL, 90, 300);
    }

    /**
     * equals method for food
     * @param other the other good to be compared to
     * @return boolean representing if the two objects are equal
     */
    public boolean equals(Goods other) {
        if (other == this) {
            return true;
        }
        return other instanceof Food;

    }

    /**
     * Method which gets hashcode of good
     * @return hashcode of food
     */
    public int hashCode() {
        return 2;
    }
}
