package com.example.gttrader.Entity;

import com.example.gttrader.ViewModel.ConfigurationViewModel;

public class Universe {

    private ConfigurationViewModel configurationViewModel = new ConfigurationViewModel();

    private Player player = configurationViewModel.getPlayer();




    private static Universe universe = new Universe();

    private Universe() {

    }

    public static Universe getUniverse() {
        return universe;
    }


    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public static class getUniverse extends Universe {
    }
}
