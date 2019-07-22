package com.example.gttrader.Entity;
//import java.util.Random;

/**
 * class for the water good
 */
public class Water extends Goods {
    /**
     * Method which creates the water good
     */
    public Water() {
        super("Water",0,0,2,50,3,3,PriceIncreaseEvent.DROUGHT,Resource.LOTSOFWATER,Resource.DESERT,30,100 );
    }

    /**
     * equals method for water
     * @param other the other good to compare to water
     * @return boolean representing if the two goods are equal
     */
    public boolean equals(Goods other) {
        if (other == this) {
            return true;
        }
        return other instanceof Water;

    }


    /**
     * Method which gets hashcode of good
     * @return hashcode
     */
    public int hashCode() {
        return 10;
    }


}
