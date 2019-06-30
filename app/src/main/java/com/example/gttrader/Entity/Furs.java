package com.example.gttrader.Entity;
import java.util.Random;

public class Furs extends Goods {
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


    public int hashCode() {
        return 3;
    }
}
