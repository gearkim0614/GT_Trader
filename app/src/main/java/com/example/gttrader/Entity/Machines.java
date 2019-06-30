package com.example.gttrader.Entity;
import java.util.Random;

public class Machines extends Goods {
    public Machines() {
        super("Machine", 4,3,5,500,-30,5,PriceIncreaseEvent.STRIKE,null,null,600,2000);
    }

    public boolean equals(Goods other) {
        if (other == this) {
            return true;
        } else if (!(other instanceof Machines)) {
            return false;
        } return true;

    }

    public int hashCode() {
        return 5;
    }
}
