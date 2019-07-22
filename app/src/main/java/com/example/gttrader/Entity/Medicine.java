package com.example.gttrader.Entity;
//import java.util.Random;

/**
 * class for medicine goods
 */
public class Medicine extends Goods {
    /**
     * Method which creates the medicine good
     */
    public Medicine() {
        super("Medicine", 4,1,6,400,-20,5,PriceIncreaseEvent.FLUSEASON,Resource.LOTSOFHERBS,null,400,1000);
    }

    /**
     * equals method for medicine goods
     * @param other the other good to compare to
     * @return boolean representing if the two goods are equal
     */
    public boolean equals(Goods other) {
        if (other == this) {
            return true;
        }
        return other instanceof Medicine;

    }

    /**
     * Method which gets hashcode of good
     * @return hashcode
     */
    public int hashCode() {
        return 6;
    }
}
