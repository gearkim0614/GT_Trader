package com.example.gttrader.Entity;

/**
 * enum class representing different resources in the regions
 */
public enum Resource {
    NOSPECIALRESOURCES("No Special Resources"),
    MINERALRICH("Mineral Rich"),
    MINERALPOOR("Mineral Poor"),
    DESERT("Desert"),
    LOTSOFWATER("Lots of Water"),
    RICHSOIL("Rich Soil"),
    POORSOIL("Poor Soil"),
    RICHFAUNA("Rich Fauna"),
    LIFELESS("Lifeless"),
    WEIRDMUSHROOMS("Weird Mushrooms"),
    LOTSOFHERBS("Lots of Herbs"),
    ARTISTIC("Artistic"),
    WARLIKE("Warlike");

    private String name;

    /**
     * resource method for assigning name of resource
     * @param name name of resource
     */
    Resource(String name) {
        this.name = name;
    }

    /**
     * Getter method for getting name of resource
     * @return name of resource
     */
    public String getName() {
        return name;
    }
}
