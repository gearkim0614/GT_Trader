package com.example.gttrader.Entity;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Scooter {
    private Map<Integer, Integer> scooter_hold;
    private final int MAXCAPACITY;
    private int current_capacity;
    private static double batteryLife;


    public Scooter() {

        this.scooter_hold = new HashMap<Integer, Integer>();
        this.MAXCAPACITY = 5;
        this.current_capacity = 0;
        for (int i = 1; i < 11; i++) {
            scooter_hold.put(i, 0);
        }
        this.batteryLife = 100;
    }

    public Scooter(Map<Integer, Integer> scooter_hold, int current_capacity, double batteryLife) {
        this.scooter_hold = scooter_hold;
        this.current_capacity= current_capacity;
        this.batteryLife = batteryLife;
        this.MAXCAPACITY = 5;
    }

    /**
     * attempts to add a good to the scooter's cargo hold
     * @param good takes in a good to add to cargo hold
     * @return boolean- true if good was successfully added. Or false
     * if good could not be added
     */
    public boolean addToHold(Goods good) {
        //check if the good is already in the hold
        //if True, update the value by 1
        if (current_capacity < MAXCAPACITY) {
            if (scooter_hold.containsKey(good.hashCode())) {
                scooter_hold.put(good.hashCode(),scooter_hold.get(good.hashCode()) + 1);
            } else {
                scooter_hold.put(good.hashCode(), 1);
            }
            current_capacity++;
            return true;
        }
        return false;

    }

    /**
     * attempts to add a good to the scooter's cargo hold
     * @param itemToRemove item you want to remove from hold
     * @return boolean true if successfully removed false if not successfully removed
     */
    public boolean removeFromHold2(Goods itemToRemove) {
        if (scooter_hold.containsKey(itemToRemove.hashCode())) {
            if (scooter_hold.get(itemToRemove.hashCode()) > 0) {
                scooter_hold.put(itemToRemove.hashCode(), scooter_hold.get(itemToRemove.hashCode()) - 1);
                current_capacity--;
                return true;
            }
        }
        return false;
    }

    public Map<Integer, Integer> getScooter_hold() {
        return scooter_hold;
    }

    public double getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }

    public ArrayList<String> holdToList() {
        ArrayList<String> cargoList = new ArrayList<>();
        for (int key : scooter_hold.keySet()) {
            String name;
            if (key == 1) {
                name = "Firearms";
            } else if (key == 2) {
                name = "Food";
            } else if (key == 3) {
                name = "Furs";
            }
            else if (key == 4) {
                name = "Games";
            } else if (key == 5) {
                name = "Machines";
            } else if (key == 6) {
                name = "Medicine";
            } else if (key == 7) {
                name = "Narcotics";
            } else if (key == 8) {
                name = "Ore";
            } else if (key == 9) {
                name = "Robots";
            } else  {
                name = "Water";
            }
            for (int i = 0 ; i < scooter_hold.get(key) ; i++) {
                cargoList.add(name);
            }
        }
        return cargoList;
    }

}
