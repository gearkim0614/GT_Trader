package com.example.gttrader.Entity;

public enum Event {

    MERCENARY("Mercenaries", 1, 0.10),
    POLITIC("Politics", 2, 0.10),
    TRADE("TradeEncounter",3,0.10),
    SHIP("Outfitting ship with weapon",4,0.10),
    PIRATE("Pirate", 5, 0.10),
    POLICE("Police", 6, 0.10),
    PRIVATEEVENT("Private Event", 7, 0.10),
    MOVIESCENE("Movie Scene or clip",8, 0.10),
    ROBBERY("Robbery", 9, 0.10),
    RAIN("Rain", 10,0.10);

    private String name;
    private int eventNumber;
    private double eventChance;

    Event(String name, int eventNumber, double eventChance) {
        this.name = name;
        this.eventNumber = eventNumber;
        this.eventChance = eventChance;

    }

}