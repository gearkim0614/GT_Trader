package com.example.gttrader.Entity;
import java.util.Random;

public class Food extends Goods {
    /**
     * Method which creates the food good
     */
    public Food() {
        super("Food", 1, 0, 1, 100, 5, 5, PriceIncreaseEvent.NORTHAVECLOSE, Resource.RICHSOIL,
                Resource.POORSOIL, 90, 300);
    }

    public boolean equals(Goods other) {
        if (other == this) {
            return true;
        } else if (!(other instanceof Food)) {
            return false;
        } return true;

    }

    /**
     * Method which gets hashcode of good
     * @return hashcode
     */
    public int hashCode() {
        return 2;
    }
}
