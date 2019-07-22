package com.example.gttrader.Entity;

/**
 * enum representing the special events in the regions
 */
public enum Event {

    MERCENARY("Mercenaries", 1, 0.10),
    POLITIC("Politics", 2, 0.10),
    TREASUREBOX("TreasureBox",3,0.10),
    SHIP("Outfitting ship with weapon",4,0.10),
    PIRATE("Pirate", 5, 0.10),
    POLICE("Police", 6, 0.10),
    TRADERENCOUNTER("Trader Encounter", 7, 0.10),
    MOVIESCENE("Movie Scene or clip",8, 0.10),
    ROBBERY("Robbery", 9, 0.10),
    RAIN("Rain", 10,0.10);

    private final String name;
    private final int eventNumber;
    private final double eventChance;

    Event(String name, int eventNumber, double eventChance) {
        this.name = name;
        this.eventNumber = eventNumber;
        this.eventChance = eventChance;

    }

}