package com.example.gttrader.Entity;
//import java.util.Random;

/**
 * class for the ore good
 */
public class Ore extends Goods {
    /**
     * Method which creates the ore good
     */
    public Ore() {
        super("Ore",2,2,3,500,20,10,null,Resource.MINERALRICH,Resource.MINERALPOOR,350,800);
    }

    /**
     * equals good for ore goods
     * @param other the other good to compare to
     * @return boolean representing if the two goods are equal
     */
    public boolean equals(Goods other) {
        if (other == this) {
            return true;
        }
        return other instanceof Ore;

    }

    /**
     * Method which gets hashcode of good
     * @return hashcode
     */
    public int hashCode() {
        return 8;
    }
}
