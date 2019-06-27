package com.example.gttrader.Entity;

public class Player {
    private String name;
    private int pilot_points;
    private int engineer_points;
    private int fighter_points;
    private int trader_points;
    private int credits;
    private Region region;

    public Player(String name, int pilot_points, int engineer_points, int fighter_points, int trader_points) {
        this.name = name;
        this.pilot_points = pilot_points;
        this.engineer_points = engineer_points;
        this.fighter_points = fighter_points;
        this.trader_points = trader_points;
        this.credits = 1000;
        this.region = new FreshmanDorms();
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

    public int getFighter_points() {
        return fighter_points;
    }

    public void setFighter_points(int fighter_pointers) {
        this.fighter_points = fighter_pointers;
    }

    public int getTrader_points() {
        return trader_points;
    }

    public void setTrader_points(int trader_pointers) {
        this.trader_points = trader_pointers;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Region getRegion() { return region; }

    public void setRegion(Region region) { this.region = region; }

    @Override
    public String toString() {
        return String.format("Player: %s, Credits: %d, Pilot Points: %d, Engineer Points: %d, Fighter Points: %d, Trader Points: %d",
                name, credits, pilot_points, engineer_points,fighter_points, trader_points);
    }
}