package com.example.gttrader.Entity;

public class TechTower extends Region {
    public TechTower(String name, double latitude, double longitude, Resource resource, TechLevel techLevel) {
        super("TechTower", 33.7724, -84.3947, Resource.ARTISTIC, TechLevel.MEDIEVAL);
    }
}
