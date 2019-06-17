package com.example.gttrader.ViewModel;
import com.example.gttrader.Entity.Player;

public class ConfigurationViewModel {
    public static boolean addUpToSixteen(int pilot, int engineer, int fighter, int trader) {
        return (pilot + engineer + fighter + trader == 16);
    }

    public static void initNewPlayer(int pilot, int engineer, int fighter, int trader, String name) {
        Player player = new Player(name, pilot, engineer, fighter, trader);
        System.out.println(player);
    }
}
