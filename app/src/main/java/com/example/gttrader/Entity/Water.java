package com.example.gttrader.Entity;
import java.util.Random;

public class Water extends Goods {
    public Water() {
        super("Water",0,0,2,50,3,3,PriceIncreaseEvent.DROUGHT,Resource.LOTSOFWATER,Resource.DESERT,30,100 );
    }

    public boolean equals(Goods other) {
        if (other == this) {
            return true;
        } else if (!(other instanceof Water)) {
            return false;
        } return true;

    }


    public int hashCode() {
        return 10;
    }


}
