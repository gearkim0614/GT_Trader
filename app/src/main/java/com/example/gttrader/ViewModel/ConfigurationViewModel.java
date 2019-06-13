package com.example.gttrader.ViewModel;

public class ConfigurationViewModel {
    public static boolean addUpToSixteen(int pilot, int engineer, int fighter, int trader) {
        return (pilot + engineer + fighter + trader == 16);
    }
}
