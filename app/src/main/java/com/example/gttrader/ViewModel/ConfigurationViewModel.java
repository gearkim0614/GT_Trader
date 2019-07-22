package com.example.gttrader.ViewModel;
import com.example.gttrader.Entity.Building;
import com.example.gttrader.Entity.Player;


import com.example.gttrader.Entity.Universe;

import java.util.Random;

/**
 * This class connects the Configuration activity to the Player class in the model
 * It sets up all of the player information
 */
public class ConfigurationViewModel {
    private final Universe universe = Universe.getUniverse();
    private Player player;
            //= new Player("player", 4, 4, 4, 4);

    /**
     * checks if the player's skill points are valid and add up to 16
     * @param pilot player's pilot skill points
     * @param engineer player's engineer skill points
     * @param fighter player's fighter skill points
     * @param trader player's trader skill points
     * @return boolean representing if the points add up to 16
     */
    public static boolean addUpToSixteen(int pilot, int engineer, int fighter, int trader) {
        return (pilot + engineer + fighter + trader) == 16;
    }

    /**
     * sets up a new player in the game
     * @param pilot player's pilot skill points
     * @param engineer player's engineer skill points
     * @param fighter player's fighter skill points
     * @param trader player's trader skill points
     * @param name player's name
     * @return a new Player object with the appropriate attributes
     */
    public Player initializer(int pilot, int engineer, int fighter, int trader, String name) {
        player = new Player(name, pilot, engineer, fighter, trader);

        player.setBuilding(Building.FreshmanDorms);
        universe.setPlayer(player);
        return player;

    }

    /**
     * checks for a random event of the player being robbed
     * @return double representing the player's updated credits
     */
    public double robbed () {
        Random ran = new Random();
        int money_lost = ran.nextInt(50) + 100;//the robber will rob from 50 to 150 credits
        if (universe.getPlayer().getCredits() >= money_lost) {//the money is enough to lose
            universe.getPlayer().setCredits(universe.getPlayer().getCredits() - money_lost);
        } else {
            universe.getPlayer().setCredits(0);
        }
        return universe.getPlayer().getCredits();
    }

//    public String rain () {
//        //will lose pilot_point, fight_point,
//    }

    /**
     * getter for the player
     * @return the player in the game
     */
    public Player getPlayer() {
        return player;
    }

//    public static Player getPlayer() {
//        return player;
//    }


}
