package com.example.gttrader.ViewModel;

import com.example.gttrader.Entity.Building;
import com.example.gttrader.Entity.Event;
import com.example.gttrader.Entity.Universe;
import com.example.gttrader.Entity.Player;

import java.util.Random;


public class TravelViewModel {

    private Universe universe = Universe.getUniverse();
    private Player  player= universe.getPlayer();

    public int random() {
        Random ran = new Random();
        int randomNumber = ran.nextInt(10) + 1;
        return randomNumber;
    }

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
        } else if (num == 3 || num == 2 || num == 4 || num == 6 || num == 7 || num == 8) {
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
        if (random() == 5 || random() == 1 || random() == 2 || random() == 3 || random() == 4) {
            return true;
        }
        return false;
    }


    public double calculateDistance(Building current, Building next) {
        return Math.sqrt(Math.pow(next.getLatitude() - current.getLatitude(), 2) + Math.pow(next.getLongitude() - current.getLongitude(), 2));
    }

    public boolean canTravel(Building current, Building next) {
        if (player.getScooter().getBatteryLife() >= batteryNeeded(current,next)) {
            return true;
        }
        return false;
    }

    public double batteryNeeded(Building current, Building next) {
        return calculateDistance(current,next) * 1000;
    }

    public double getBatterRemains() {
        return player.getScooter().getBatteryLife();
    }
}
