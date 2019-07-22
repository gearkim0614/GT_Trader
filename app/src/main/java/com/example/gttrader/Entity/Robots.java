package com.example.gttrader.Entity;
//import java.util.Random;

/**
 * class for the robot good
 */
public class Robots extends Goods {
    /**
     * Method which creates the robot good
     */
    public Robots() {
        super("Robots", 6,4,7,800,-150,150,null,null,null,3500,2500);
    }

    /**
     * equals method for robots
     * @param other the other good to compare to
     * @return boolean representing if the two goods are equal
     */
    public boolean equals(Goods other) {
        if (other == this) {
            return true;
        }
        return other instanceof Robots;

    }

    /**
     * Method which gets hashcode of good
     * @return hashcode
     */
    public int hashCode() {
        return 9;
    }
}
