package com.example.gttrader.Entity;

import com.example.gttrader.ViewModel.ConfigurationViewModel;

/**
 * static universe which holds the player object
 */
public class Universe {

    private ConfigurationViewModel configurationViewModel = new ConfigurationViewModel();

    private Player player = configurationViewModel.getPlayer();




    private static Universe universe = new Universe();

    private Universe() {

    }

    /**
     * getter for the universe
     * @return the universe the player is in
     */
    public static Universe getUniverse() {
        return universe;
    }

    /**
     * setter to set the player in the universe
     * @param player the player to add to the universe
     */
    public void setPlayer(Player player) {
        this.player = player;
    }

    /**
     * getter for the player in the universe
     * @return the player in the universe
     */
    public Player getPlayer() {
        return player;
    }

}
