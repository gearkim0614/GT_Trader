package com.example.gttrader.Entity;

public class Player {
    private String name;
    private int pilot_points;
    private int engineer_points;
    private int fighter_points;
    private int trader_points;
    private double credits;
    private Building building;
    private Scooter scooter;

    public Player(String name, int pilot_points, int engineer_points, int fighter_points, int trader_points) {
        this.name = name;
        this.pilot_points = pilot_points;
        this.engineer_points = engineer_points;
        this.fighter_points = fighter_points;
        this.trader_points = trader_points;
        this.credits = 1000;
        this.building = Building.FreshmanDorms;
        this.scooter = new Scooter();
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

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    //public Region getRegion() { return region; }

    //public void setRegion(Region region) { this.region = region; }

    public void setScooter(Scooter scooter) { this.scooter = scooter; }

    public Scooter getScooter() { return scooter; }

    public boolean buyGood(Goods good) {
        double price = good.market_price();
        if (credits >= price) {
            boolean bought = scooter.addToHold(good);
            if (bought) {
                credits = credits - price;//The price generated randomly? doesn't match front and back end
            }
            return bought;
        }
        return false;
    }

    public void sellGood(Goods good) {
        if (scooter.getScooter_hold().containsKey(good.hashCode())) {
            double price = good.market_price();
            boolean sold = scooter.removeFromHold2(good);
            if (sold) {
                credits = credits + price /*- 10.0*/; // why is this -10?? -gear
            }
        }
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", pilot_points=" + pilot_points +
                ", engineer_points=" + engineer_points +
                ", fighter_points=" + fighter_points +
                ", trader_points=" + trader_points +
                ", credits=" + credits +
                ", building=" + building +
                ", scooter=" + scooter +
                '}';
    }

    //    @Override
//    public String toString() {
//        return String.format("Player: %s, Credits: %f, Pilot Points: %d, Engineer Points: %d, Fighter Points: %d, Trader Points: %d",
//                name, credits, pilot_points, engineer_points,fighter_points, trader_points);
//    }
}