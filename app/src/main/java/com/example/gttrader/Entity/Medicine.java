package com.example.gttrader.Entity;
import java.util.Random;

public class Medicine extends Goods {
    public Medicine() {
        super("Medicine", 4,1,6,400,-20,5,PriceIncreaseEvent.FLUSEASON,Resource.LOTSOFHERBS,null,400,1000);
    }

    public boolean equals(Goods other) {
        if (other == this) {
            return true;
        } else if (!(other instanceof Medicine)) {
            return false;
        } return true;

    }


    public int hashCode() {
        return 6;
    }
}
