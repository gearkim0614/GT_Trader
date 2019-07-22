package com.example.gttrader.Entity;
//import java.util.Random;

/**
 * class for narcotics good
 */
public class Narcotics extends Goods {
    /**
     * Method which creates the narcotics good
     */
    public Narcotics() {
        super("Narcotics", 5, 0, 5, 1100, -125, 175, PriceIncreaseEvent.POLICERAID,Resource.WEIRDMUSHROOMS,null,2000,1800 );
    }

    /**
     * equals method for narcotics goods
     * @param other the other good to compare
     * @return boolean representing if the two goods are equal
     */
    public boolean equals(Goods other) {
        if (other == this) {
            return true;
        }
        return other instanceof Narcotics;

    }

    /**
     * Method which gets hashcode of good
     * @return hashcode
     */
    public int hashCode() {
        return 7;
    }

}
