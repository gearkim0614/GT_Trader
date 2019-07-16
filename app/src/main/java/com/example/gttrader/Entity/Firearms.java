package com.example.gttrader.Entity;
import java.util.Random;

public class Firearms extends Goods {
    /**
     * Method which creates the firearms good
     */
    public Firearms() {
        super("Firearms", 3, 1, 5,
                1200, -75, 100, PriceIncreaseEvent.HUNTINGSEASON,
                Resource.MINERALRICH, Resource.WARLIKE, 600, 2000);
    }

    public boolean equals(Goods other) {
        if (other == this) {
            return true;
        } else if (!(other instanceof Firearms)) {
            return false;
        } return true;

    }

    /**
     * Method which gets hashcode of good
     * @return hashcode
     */
    public int hashCode() {
        return 1;
    }

}
