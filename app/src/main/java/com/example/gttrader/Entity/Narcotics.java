package com.example.gttrader.Entity;
import java.util.Random;

public class Narcotics extends Goods {
    /**
     * Method which creates the narcotics good
     */
    public Narcotics() {
        super("Narcotics", 5, 0, 5, 1100, -125, 175, PriceIncreaseEvent.POLICERAID,Resource.WEIRDMUSHROOMS,null,2000,1800 );
    }

    public boolean equals(Goods other) {
        if (other == this) {
            return true;
        } else if (!(other instanceof Narcotics)) {
            return false;
        } return true;

    }

    /**
     * Method which gets hashcode of good
     * @return hashcode
     */
    public int hashCode() {
        return 7;
    }

}
