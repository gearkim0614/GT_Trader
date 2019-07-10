package com.example.gttrader.ViewModel;
import com.example.gttrader.Entity.Building;
import com.example.gttrader.Entity.DifficultyLevel;
import com.example.gttrader.Entity.Ore;
import com.example.gttrader.Entity.Player;


import com.example.gttrader.Entity.Universe;

public class ConfigurationViewModel {
    private Universe universe = Universe.getUniverse();
    private Player player;

    public static boolean addUpToSixteen(int pilot, int engineer, int fighter, int trader) {
        return (pilot + engineer + fighter + trader == 16);
    }

    public void initializer(int pilot, int engineer, int fighter, int trader, String name) {
        player = new Player(name, pilot, engineer, fighter, trader);
        System.out.println(player);

        player.setBuilding(Building.FreshmanDorms);
        universe.setPlayer(player);
        System.out.println(Building.BOBBYDODD + "\n" + Building.COC + "\n" + Building.CRC + "\n" + Building.CULC + "\n" + Building.FreshmanDorms + "\n" + Building.GreekHouses
                + "\n" + Building.NorthAveDinning + "\n" + Building.StudentCenter + "\n" + Building.TechSquare + "\n" + Building.TechTower);

    }

    public static void makeRegions() {

        System.out.println(Building.BOBBYDODD + "\n" + Building.COC + "\n" + Building.CRC + "\n" + Building.CULC + "\n" + Building.FreshmanDorms + "\n" + Building.GreekHouses
        + "\n" + Building.NorthAveDinning + "\n" + Building.StudentCenter + "\n" + Building.TechSquare + "\n" + Building.TechTower);

    }


//    public static Player getPlayer() {
//        return player;
//    }


}
