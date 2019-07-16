package com.example.gttrader.ViewModel;
import com.example.gttrader.Entity.Building;
import com.example.gttrader.Entity.DifficultyLevel;
import com.example.gttrader.Entity.Ore;
import com.example.gttrader.Entity.Player;


import com.example.gttrader.Entity.Universe;

import java.util.Random;

public class ConfigurationViewModel {
    private Universe universe = Universe.getUniverse();
    private Player player;
            //= new Player("player", 4, 4, 4, 4);

    public static boolean addUpToSixteen(int pilot, int engineer, int fighter, int trader) {
        return (pilot + engineer + fighter + trader == 16);
    }

    public Player initializer(int pilot, int engineer, int fighter, int trader, String name) {//changed return type
        player = new Player(name, pilot, engineer, fighter, trader);
        System.out.println(player);

        player.setBuilding(Building.FreshmanDorms);
        universe.setPlayer(player);
        System.out.println(Building.BOBBYDODD + "\n" + Building.COC + "\n" + Building.CRC + "\n" + Building.CULC + "\n" + Building.FreshmanDorms + "\n" + Building.GreekHouses
                + "\n" + Building.NorthAveDinning + "\n" + Building.StudentCenter + "\n" + Building.TechSquare + "\n" + Building.TechTower);
        return player;

    }

//    public static void makeRegions() {
//
//        System.out.println(Building.BOBBYDODD + "\n" + Building.COC + "\n" + Building.CRC + "\n" + Building.CULC + "\n" + Building.FreshmanDorms + "\n" + Building.GreekHouses
//        + "\n" + Building.NorthAveDinning + "\n" + Building.StudentCenter + "\n" + Building.TechSquare + "\n" + Building.TechTower);
//
//    }

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

    public Player getPlayer() {
        return player;
    }

//    public static Player getPlayer() {
//        return player;
//    }


}
