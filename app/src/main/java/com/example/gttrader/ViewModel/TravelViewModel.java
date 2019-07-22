package com.example.gttrader.ViewModel;

import com.example.gttrader.Entity.Building;
import com.example.gttrader.Entity.Event;
import com.example.gttrader.Entity.Universe;
import com.example.gttrader.Entity.Player;

import java.util.Random;

/**
 * connects the UI for player travel with the player in the model class
 */
public class TravelViewModel {

    private Universe universe = Universe.getUniverse();
    private Player  player= universe.getPlayer();

    /**
     * random number generator
     * @return a random integer
     */
    public int random() {
        Random ran = new Random();
        int randomNumber = ran.nextInt(10) + 1;
        return randomNumber;
    }

    /**
     * calculates a random event based on a random event generator
     * @return a String of a random event
     */
    public String randomEventGetter() {
        int num = random();
        if (num == 1) {
            return Event.MERCENARY.name();
//        } else if (num == 2) {
//            return Event.POLITIC.name();
//        } else if (num == 4) {
//            return Event.SHIP.name();
//        } else if (num == 6) {
//            return Event.POLICE.name();
//        } else if (num == 7) {
//            return Event.PRIVATEEVENT.name();
//        } else if (num == 8) {
//            return Event.MOVIESCENE.name();
        } else if (num == 9) {
            return Event.ROBBERY.name();
        } else if ((num == 3) || (num == 2) || (num == 4) || (num == 6) || (num == 7) || (num == 8)) {
            return Event.TREASUREBOX.name();
        } else if (num == 5) {
            return Event.PIRATE.name();
        } else {
            return Event.RAIN.name();
        }
    }

    /**
     * decide whether the random event is happening or not
     * @return a boolean value representing if the event will happen
     */
    public boolean isHappening() {
        int rand = random();
        return ((rand == 5) || (rand == 1) || (rand == 2) || (rand == 3) || (rand == 4));
    }

    /**
     * calculates the distance between two locations
     * @param current the player's current location
     * @param next the location the player wants to travel to
     * @return the distance betwen the player's current location and where
     *          they want to travel to
     */
    public double calculateDistance(Building current, Building next) {
        return Math.sqrt(Math.pow(next.getLatitude() - current.getLatitude(), 2) + Math.pow(next.getLongitude() - current.getLongitude(), 2));
    }

    /**
     * checks if the scooter has enough battery life to travel somewhere
     * @param current the player's current location
     * @param next the location the player wants to travel to
     * @return boolean representing if the player can travel to the new location or not
     */
    public boolean canTravel(Building current, Building next) {
        return (player.getScooter().getBatteryLife() >= batteryNeeded(current,next));
    }

    /**
     * calculates the needed battery for travel
     * @param current the player's current location
     * @param next the location the player wants to travel to
     * @return double of how much battery the scooter needs to travel from the
     *          current to the next location
     */
    public double batteryNeeded(Building current, Building next) {
        return calculateDistance(current,next) * 1000;
    }

    /**
     * returns scooter battery life
     * @return double representing how much scooter battery is left
     */
    public double getBatterRemains() {
        return player.getScooter().getBatteryLife();
    }
}
