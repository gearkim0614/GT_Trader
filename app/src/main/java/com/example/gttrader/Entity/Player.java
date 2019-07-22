package com.example.gttrader.Entity;

/**
 * class representing the player in the game
 */
public class Player {
    private String name;
    private int pilot_points;
    private int engineer_points;
    private int fighter_points;
    private int trader_points;
    private double credits;
    private Building building;
    private Scooter scooter;
    private Building nextBuilding;


    /**
     * player constructor
     * @param name player name
     * @param pilot_points player's pilot skill points
     * @param engineer_points player's enginner skill points
     * @param fighter_points player's fighter skill points
     * @param trader_points player's trader skill points
     */
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

    /**
     * getter for player name
     * @return String representing the player name
     */
    public String getName() {
        return name;
    }

    /**
     * setter for player name
     * @param name updated player name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter for player's pilot points
     * @return int representing player's pilot points
     */
    public int getPilot_points() {
        return pilot_points;
    }

    /**
     * setter for pilot points
     * @param pilot_points updated pilot points
     */
    public void setPilot_points(int pilot_points) {
        this.pilot_points = pilot_points;
    }

    /**
     * getter for player's engineer points
     * @return int representing player's engineer points
     */
    public int getEngineer_points() {
        return engineer_points;
    }

    /**
     * setter for player's engineer points
     * @param engineer_points updated engineer points
     */
    public void setEngineer_points(int engineer_points) {
        this.engineer_points = engineer_points;
    }

    /**
     * getter for fighter points
     * @return int representing player's fighter points
     */
    public int getFighter_points() {
        return fighter_points;
    }

    /**
     * setter for fighter points
     * @param fighter_pointers updated fighter points
     */
    public void setFighter_points(int fighter_pointers) {
        this.fighter_points = fighter_pointers;
    }

    /**
     * getter for trader points
     * @return int representing player's trader points
     */
    public int getTrader_points() {
        return trader_points;
    }

    /**
     * setter for trader points
     * @param trader_pointers int representing player's trader points
     */
    public void setTrader_points(int trader_pointers) {
        this.trader_points = trader_pointers;
    }

    /**
     * getter for credits
     * @return double representing player's credits
     */
    public double getCredits() {
        return credits;
    }

    /**
     * setter for player credits
     * @param credits updated player credits
     */
    public void setCredits(double credits) {
        this.credits = credits;
    }

    //public Region getRegion() { return region; }

    //public void setRegion(Region region) { this.region = region; }

    /**
     * setter for player scooter
     * @param scooter the updated scooter
     */
    public void setScooter(Scooter scooter) { this.scooter = scooter; }

    /**
     * getter for player scooter
     * @return the player's scooter
     */
    public Scooter getScooter() { return scooter; }

    /**
     * method for a player to buy a good
     * @param good the good to buy
     * @return boolean representing if the buy was successful
     */
    public boolean buyGood(Goods good) {
        double price = good.market_price();
        if (credits >= price) {
            boolean bought = scooter.addToHold(good);
            if (bought) {
                credits = Math.round((credits - price) * 100.00)/100.00;//The price generated randomly? doesn't match front and back end

            }
            return bought;
        }
        return false;
    }

    /**
     * method to sell a player good
     * @param good the good to sell
     */
    public void sellGood(Goods good) {
        if (scooter.getScooter_hold().containsKey(good.hashCode())) {
            double price = good.market_price();
            boolean sold = scooter.removeFromHold2(good);
            if (sold) {
                credits = Math.round((credits + price) * 100.00)/100.00;
            }
        }
    }

    /**
     * getter for the player's location
     * @return the player's building location
     */
    public Building getBuilding() {
        return building;
    }

    /**
     * setter for a player's location
     * @param building player's updated location
     */
    public void setBuilding(Building building) {
        this.building = building;
    }

    /**
     * setter for a player's next location
     * @param building player's next location
     */
    public void setNextLocation(Building building) {
        this.nextBuilding = building;

    }

    /**
     * getter for a player's building
     * @return player's next building
     */
    public Building getNextBuilding() {
        return nextBuilding;
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