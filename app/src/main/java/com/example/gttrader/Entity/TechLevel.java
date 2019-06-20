package com.example.gttrader.Entity;

public enum TechLevel {
    PREAGRICULTURE ("Pre-Agriculture"),
    MEDIEVAL("Medieval"),
    RENAISSANCE("Renaissance"),
    EARLYINDUSTRIAL("Early Industrial"),
    INDUSTRIAL("Industrial"),
    POSTINDISTRIAL("Post-Industrial"),
    HITECH("Hi-Tech");

    private String name;

    TechLevel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
