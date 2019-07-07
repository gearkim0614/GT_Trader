package com.example.gttrader.Entity;

public enum Building {

    BOBBYDODD("BobbyDodd", 33.7724, -84.3928, Resource.RICHSOIL, TechLevel.RENAISSANCE),
    COC("CollegeOfComputing", 33.7774, -84.3973, Resource.LIFELESS, TechLevel.HITECH),
    CRC("CRC", 33.775627, -84.403491, Resource.LOTSOFWATER, TechLevel.INDUSTRIAL),
    CULC("CULC", 33.7749, -84.3964, Resource.MINERALPOOR, TechLevel.POSTINDISTRIAL),
    FreshmanDorms("FreshmanDorms", 33.775627, -84.403491, Resource.WEIRDMUSHROOMS, TechLevel.MEDIEVAL),
    GreekHouses("GreekHouses", 33.776669, -84.392986, Resource.WARLIKE, TechLevel.INDUSTRIAL),
    NorthAveDinning("North Ave Dining", 33.771011, -84.391409, Resource.LOTSOFHERBS, TechLevel.RENAISSANCE),
    StudentCenter("StudentCenter", 33.773887, -84.398766, Resource.NOSPECIALRESOURCES, TechLevel.EARLYINDUSTRIAL),
    TechSquare("TechSquare", 33.7759, -84.3890, Resource.MINERALRICH, TechLevel.HITECH),
    TechTower("TechTower", 33.7724, -84.3947, Resource.ARTISTIC, TechLevel.MEDIEVAL),
    ;

    private String name;
    private double latitude;
    private double longitude;
    private Resource resource;
    private TechLevel techLevel;

    Building(String name, double latitude, double longitude, Resource resource, TechLevel techLevel) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.resource = resource;
        this.techLevel = techLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public TechLevel getTechLevel() {
        return techLevel;
    }

    public void setTechLevel(TechLevel techLevel) {
        this.techLevel = techLevel;
    }
}
