package com.example.gttrader.Entity;
//import java.util.Random;

/**
 * class for the games good
 */
public class Games extends Goods {
    /**
     * Method which creates the games good
     */
    public Games() {
        super("Games", 3,1, 6, 200, -10, 5, PriceIncreaseEvent.SUMMERVACATION, Resource.ARTISTIC,
                null, 160, 300);
    }

    /**
     * equals method for games
     * @param other the other good to compare to
     * @return boolean representing if the two goods are equal
     */
    public boolean equals(Goods other) {
        if (other == this) {
            return true;
        }
        return other instanceof Games;
    }

    /**
     * Method which gets hashcode of good
     * @return hashcode
     */
    public int hashCode() {
        return 4;
    }
}
