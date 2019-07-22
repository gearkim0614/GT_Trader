package com.example.gttrader.Entity;
//import java.util.Random;

/**
 * class for machines good
 */
public class Machines extends Goods {
    /**
     * Method which creates the machines good
     */
    public Machines() {
        super("Machine", 4,3,5,500,-30,5,PriceIncreaseEvent.STRIKE,null,null,600,2000);
    }

    /**
     * equals method for machines
     * @param other the other good to compare
     * @return boolean representing if the two goods are equal
     */
    public boolean equals(Goods other) {
        if (other == this) {
            return true;
        }
        return other instanceof Machines;

    }

    /**
     * Method which gets hashcode of good
     * @return hashcode
     */
    public int hashCode() {
        return 5;
    }
}
