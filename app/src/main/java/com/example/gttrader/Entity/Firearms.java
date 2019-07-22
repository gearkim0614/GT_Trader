package com.example.gttrader.Entity;
//import java.util.Random;

/**
 * class representing the firearms good
 */
public class Firearms extends Goods {
    /**
     * Method which creates the firearms good
     */
    public Firearms() {
        super("Firearms", 3, 1, 5,
                1200, -75, 100, PriceIncreaseEvent.HUNTINGSEASON,
                Resource.MINERALRICH, Resource.WARLIKE, 600, 2000);
    }

    /**
     * checks if two goods are firearms and equal
     * @param other the other good to be compared to
     * @return boolean representing if the two Goods are equal
     */
    public boolean equals(Goods other) {
        return this.hashCode() == other.hashCode();
    }

    /**
     * Method which gets hashcode of good
     * @return hashcode
     */
    public int hashCode() {
        return 1;
    }

}
