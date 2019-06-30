package com.example.gttrader.Entity;
import java.util.Random;

public class Robots extends Goods {
    public Robots() {
        super("Robots", 6,4,7,800,-150,150,null,null,null,3500,2500);
    }

    public boolean equals(Goods other) {
        if (other == this) {
            return true;
        } else if (!(other instanceof Robots)) {
            return false;
        } return true;

    }

    public int hashCode() {
        return 9;
    }
}
