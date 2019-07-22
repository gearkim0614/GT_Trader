package com.example.gttrader.Entity;

/**
 * enum for the tech levels in each region
 */
public enum TechLevel {
    PREAGRICULTURE (0),
    MEDIEVAL(1),
    RENAISSANCE(2),
    EARLYINDUSTRIAL(3),
    INDUSTRIAL(4),
    POSTINDISTRIAL(5),
    HITECH(6);

    private int level;

    TechLevel(int level) {

        this.level = level;
    }

    /**
     * getter for the numerical value association with each tech level
     * @return int representing the tech level
     */
    public int getLevel() {
        return level;
    }
}
