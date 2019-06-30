package com.example.gttrader.Entity;
import java.util.Random;

public class Games extends Goods {
    public Games() {
        super("Games", 3,1, 6, 200, -10, 5, PriceIncreaseEvent.SUMMERVACATION, Resource.ARTISTIC,
                null, 160, 300);
    }

    public boolean equals(Goods other) {
        if (other == this) {
            return true;
        } else if (!(other instanceof Games)) {
            return false;
        } return true;

    }


    public int hashCode() {
        return 4;
    }
}
