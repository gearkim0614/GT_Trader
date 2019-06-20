package com.example.gttrader.Entity;

public class TechSquare extends Region {
    public TechSquare(String name, double latitude, double longitude, Resource resource, TechLevel techLevel) {
        super("TechSquare", 33.7759, -84.3890, Resource.MINERALRICH, TechLevel.HITECH);
    }
}
