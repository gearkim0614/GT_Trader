package com.example.gttrader.Entity;


public enum Building {

    BOBBYDODD("BobbyDodd", 33.7724, -84.3928, Resource.RICHSOIL, TechLevel.RENAISSANCE, 0.11),
    COC("CollegeOfComputing", 33.7774, -84.3973, Resource.LIFELESS, TechLevel.HITECH, 0.06),
    CRC("CRC", 33.775627, -84.403491, Resource.LOTSOFWATER, TechLevel.INDUSTRIAL, 0.10),
    CULC("CULC", 33.7749, -84.3964, Resource.MINERALPOOR, TechLevel.POSTINDISTRIAL, 0.14),
    FreshmanDorms("FreshmanDorms", 33.773412, -84.391609, Resource.WEIRDMUSHROOMS, TechLevel.MEDIEVAL, 0.08),
    GreekHouses("GreekHouses", 33.776669, -84.392986, Resource.WARLIKE, TechLevel.INDUSTRIAL, 0.10),
    NorthAveDinning("North Ave Dining", 33.771011, -84.391409, Resource.LOTSOFHERBS, TechLevel.RENAISSANCE, 0.11),
    StudentCenter("StudentCenter", 33.773887, -84.398766, Resource.NOSPECIALRESOURCES, TechLevel.EARLYINDUSTRIAL, 0.15),
    TechSquare("TechSquare", 33.7759, -84.3890, Resource.MINERALRICH, TechLevel.HITECH, 0.06),
    TechTower("TechTower", 33.7724, -84.3947, Resource.ARTISTIC, TechLevel.MEDIEVAL,0.08),
    ;

    public static Player player;
    private String name;
    private double latitude;
    private double longitude;
    private Resource resource;
    private TechLevel techLevel;
    private double salesTax;

    Building(String name, double latitude, double longitude, Resource resource, TechLevel techLevel, double salesTax) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.resource = resource;
        this.techLevel = techLevel;
        this.salesTax = salesTax;
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

    public void setSalesTax(double salesTax) {
        this.salesTax = salesTax;
    }

    public double getSalesTax() {
        return salesTax;
    }




}
