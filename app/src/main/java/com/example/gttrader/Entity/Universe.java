package com.example.gttrader.Entity;

public class Universe {
    private Player player;

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
}
