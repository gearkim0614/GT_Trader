package com.example.gttrader.Entity;
import java.util.Random;

public class Ore extends Goods {
    /**
     * Method which creates the ore good
     */
    public Ore() {
        super("Ore",2,2,3,500,20,10,null,Resource.MINERALRICH,Resource.MINERALPOOR,350,800);
    }

    public boolean equals(Goods other) {
        if (other == this) {
            return true;
        } else if (!(other instanceof Ore)) {
            return false;
        } return true;

    }

    /**
     * Method which gets hashcode of good
     * @return hashcode
     */
    public int hashCode() {
        return 8;
    }
}
