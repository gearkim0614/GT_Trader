package com.example.gttrader.Entity;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Random;

/**
 * class representing a player's transportation
 */
public class Scooter {
    private Map<Integer, Integer> scooter_hold;
    private final int MAXCAPACITY;
    private int current_capacity;
    private double batteryLife;

    /**
     * default constructor for a scooter
     */
    public Scooter() {

        this.scooter_hold = new HashMap<>();
        this.MAXCAPACITY = 5;
        this.current_capacity = 0;
        for (int i = 1; i < 11; i++) {
            scooter_hold.put(i, 0);
        }
        this.batteryLife = 100;
    }

    /**
     * scooter constructor
     * @param scooter_hold hashmap representing the goods in the scooter hold
     * @param current_capacity amount of goods in the scooter hold
     * @param batteryLife battery life of the scooter
     */
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
     * choose a random goods from cargo holds and minus the quantity by one
     * @return a string indicate the goods in the cargo holds being robbed
     */
    public String pirateTakeGoods() {
        //check if the cargo hold is empty, if empty, nothing happens
        if (current_capacity != 0) {
            String name;
            Random ranGenerator = new Random();
            int randomNumber = -1;
            while ((randomNumber == -1) || (scooter_hold.get(randomNumber) == 0)) {
                randomNumber = ranGenerator.nextInt(10) + 1;//1 to 10
            }
            scooter_hold.put(randomNumber, scooter_hold.get(randomNumber) - 1);
            if (randomNumber == 1) {
                name = "Firearms";
            } else if (randomNumber == 2) {
                name = "Food";
            } else if (randomNumber == 3) {
                name = "Furs";
            } else if (randomNumber == 4) {
                name = "Games";
            } else if (randomNumber == 5) {
                name = "Machines";
            } else if (randomNumber == 6) {
                name = "Medicine";
            } else if (randomNumber == 7) {
                name = "Narcotics";
            } else if (randomNumber == 8) {
                name = "Ore";
            } else if (randomNumber == 9) {
                name = "Robots";
            } else  {
                name = "Water";
            }
            //remove the certain goods by one
            return name + "is robbed by pirate";
        }
        return "The cargo is empty, so nothing got robbed by the pirate";
    }

    /**
     * checks for a random event of the player finding a treasure
     * @return String of a treasure that was found
     */
    public String findTreasureBox() {
        String name = "";
        if ((current_capacity + 1) != MAXCAPACITY) {
            Random ranGenerator = new Random();
            int randomNumber = ranGenerator.nextInt(10) + 1;
            scooter_hold.put(randomNumber, scooter_hold.get(randomNumber) + 1);
            if (randomNumber == 1) {
                name = "Firearms";
            } else if (randomNumber == 2) {
                name = "Food";
            } else if (randomNumber == 3) {
                name = "Furs";
            } else if (randomNumber == 4) {
                name = "Games";
            } else if (randomNumber == 5) {
                name = "Machines";
            } else if (randomNumber == 6) {
                name = "Medicine";
            } else if (randomNumber == 7) {
                name = "Narcotics";
            } else if (randomNumber == 8) {
                name = "Ore";
            } else if (randomNumber == 9) {
                name = "Robots";
            } else  {
                name = "Water";
            }
            return "Lucky you! you just discovered a treasure box filled with " + name;
        }
        return "Well, you discovered a " + name + ", but your cargo holds are full and you threw it away";
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

    /**
     * getter for the scooter hold
     * @return hashmap representing the scooter hold
     */
    public Map<Integer, Integer> getScooter_hold() {
        return scooter_hold;
    }

    /**
     * getter for battery life
     * @return double representing the scooter battery life
     */
    public double getBatteryLife() {
        return batteryLife;
    }

    /**
     * setter for battery life
     * @param batteryLife the scooter's updated battery life
     */
    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }

    /**
     * generates an ArrayList representation of the scooter hold
     * @return ArrayList representation of the scooter hold
     */
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
            } else if (key == 4) {
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
