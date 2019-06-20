package com.example.gttrader.Entity;

public abstract class Region {
    private String name;
    private final double latitude;
    private final double longitude;
    private Resource resource;
    private TechLevel techLevel;

    public Region(String name, double latitude, double longitude, Resource resource, TechLevel techLevel) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.resource = resource;
        this.techLevel = techLevel;
    }

    public Region(String name, double latitude, double longitude, TechLevel techLevel) {
        this(name, latitude, longitude, Resource.NOSPECIALRESOURCES, techLevel);
    }

    public String getName() {
        return name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public Resource getResource() {
        return resource;
    }

    public TechLevel getTechLevel() {
        return techLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public void setTechLevel(TechLevel techLevel) {
        this.techLevel = techLevel;
    }
}


