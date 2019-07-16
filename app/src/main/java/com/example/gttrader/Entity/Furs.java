package com.example.gttrader.Entity;
import java.util.Random;

public class Furs extends Goods {
    /**
     * Method which creates the furs good
     */
    public Furs() {
        super("Furs", 0, 0, 0, 1000, 10, 12, PriceIncreaseEvent.NIGHTORCOLD, Resource.RICHFAUNA,
                Resource.LIFELESS, 230, 2000);
    }

    public boolean equals(Goods other) {
        if (other == this) {
            return true;
        } else if (!(other instanceof Furs)) {
            return false;
        } return true;

    }

    /**
     * Method which gets hashcode of good
     * @return hashcode
     */
    public int hashCode() {
        return 3;
    }
}
