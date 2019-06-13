package com.example.gttrader.Entity;

public class Player {
    private String name;
    private int pilot_points;
    private int engineer_points;
    private int fighter_pointers;
    private int trader_pointers;
    private int credits;

    public Player(String name, int pilot_points, int engineer_points, int fighter_pointers, int trader_pointers, int credits) {
        this.name = name;
        this.pilot_points = pilot_points;
        this.engineer_points = engineer_points;
        this.fighter_pointers = fighter_pointers;
        this.trader_pointers = trader_pointers;
        this.credits = 1000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPilot_points() {
        return pilot_points;
    }

    public void setPilot_points(int pilot_points) {
        this.pilot_points = pilot_points;
    }

    public int getEngineer_points() {
        return engineer_points;
    }

    public void setEngineer_points(int engineer_points) {
        this.engineer_points = engineer_points;
    }

    public int getFighter_pointers() {
        return fighter_pointers;
    }

    public void setFighter_pointers(int fighter_pointers) {
        this.fighter_pointers = fighter_pointers;
    }

    public int getTrader_pointers() {
        return trader_pointers;
    }

    public void setTrader_pointers(int trader_pointers) {
        this.trader_pointers = trader_pointers;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
