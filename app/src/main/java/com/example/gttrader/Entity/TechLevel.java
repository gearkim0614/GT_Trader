package com.example.gttrader.Entity;

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

    public int getLevel() {
        return level;
    }
}
