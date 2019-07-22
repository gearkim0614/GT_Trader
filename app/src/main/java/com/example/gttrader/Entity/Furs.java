package com.example.gttrader.Entity;
//import java.util.Random;

/**
 * class for the furs good
 */
public class Furs extends Goods {
    /**
     * Method which creates the furs good
     */
    public Furs() {
        super("Furs", 0, 0, 0, 1000, 10, 12, PriceIncreaseEvent.NIGHTORCOLD, Resource.RICHFAUNA,
                Resource.LIFELESS, 230, 2000);
    }

    /**
     * equals method for furs
     * @param other the other good to compare
     * @return boolean representing if the two furs are equal
     */
    public boolean equals(Goods other) {
        if (other == this) {
            return true;
        }
        return other instanceof Furs;

    }

    /**
     * Method which gets hashcode of good
     * @return hashcode
     */
    public int hashCode() {
        return 3;
    }
}
