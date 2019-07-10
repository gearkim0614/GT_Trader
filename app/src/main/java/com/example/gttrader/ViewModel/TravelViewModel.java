package com.example.gttrader.ViewModel;

import com.example.gttrader.Entity.Building;
import com.example.gttrader.Entity.Universe;
import com.example.gttrader.Entity.Player;


public class TravelViewModel {

    private Universe universe = Universe.getUniverse();
    private Player  player= universe.getPlayer();


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
