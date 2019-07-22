package com.example.gttrader.Entity;
import com.example.gttrader.Entity.Building;
import com.example.gttrader.Entity.Universe;
import com.example.gttrader.Entity.Player;

import java.util.Random;

/**
 * goods superclass
 */
public class Goods {
    protected String name;
    private final int minTechLevelProduce;
    private final int minTechLevelUse;
    private final int techLevelProduceMost;
    private final double basePrice;
    private final int priceIncreasePerLevel;
    private final int var;
    private final PriceIncreaseEvent priceIncreaseEvent;
    private final Resource lowPriceCondition;
    private final Resource highPriceCondition;
    private final double MTL;
    private final double MTH;
    private final double variance;
    private final double inflation = 0.1;
    private Building location;
    private final Universe universe = Universe.getUniverse();
    private final Player player = universe.getPlayer();

    /**
     * Goods method to create a goods object with passed in values for name, min tech levels to
     * produce and use, base price, price increases, and price conditions.
     * @param name name of good
     * @param minTechLevelProduce min tech level that you can produce the good at
     * @param minTechLevelUse min tech level that you can use the good at
     * @param techLevelProduceMost tech level which produces the most of this good
     * @param basePrice the base price of the good
     * @param priceIncreasePerLevel the price increase that occurs per level for this good
     * @param var variance for price increase calculations
     * @param priceIncreaseEvent radical price increase events which occur in a region
     * @param lowPriceCondition lowest price condition for the good
     * @param highPriceCondition highest price condition for the good
     * @param MTL min price offered in space trade with random trader
     * @param MTH max price offered in space trade with random trader
     */
    public Goods(String name, int minTechLevelProduce, int minTechLevelUse,
                 int techLevelProduceMost, double basePrice, int priceIncreasePerLevel, int var,
                 PriceIncreaseEvent priceIncreaseEvent,
                 Resource lowPriceCondition,
                 Resource highPriceCondition,
                 double MTL, double MTH) {
        this.name = name;
        this.minTechLevelProduce = minTechLevelProduce;
        this.minTechLevelUse = minTechLevelUse;
        this.techLevelProduceMost = techLevelProduceMost;
        this.basePrice = basePrice;
        this.priceIncreasePerLevel = priceIncreasePerLevel;
        this.var = var;
        this.lowPriceCondition = lowPriceCondition;
        this.highPriceCondition = highPriceCondition;
        this.priceIncreaseEvent = priceIncreaseEvent;
        this.MTL = MTL;
        this.MTH = MTH;
        variance = variance();
        }

    //public Goods(String name, double price, int quantity) {
    //}

    /**
     * Getter method which gets the name of an object
     * @return name of good
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method which sets the name of a good
     * @param name name of good
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method which gets min tech level to produce the object
     * @return tech level
     */
    public int getMinTechLevelProduce() {
        return minTechLevelProduce;
    }

//    /**
//     * Setter method which sets min tech level to produce the object
//     * @param minTechLevelProduce min tech level to produce the good
//     */
//    public void setMinTechLevelProduce(int minTechLevelProduce) {
//        this.minTechLevelProduce = minTechLevelProduce;
//    }

//    /**
//     * Getter method which gets the min tech level needed to use a good
//     * @return tech level
//     */
//    public int getMinTechLevelUse() {
//        return minTechLevelUse;
//    }
//
//    /**
//     * Setter method which sets min tech level to use the good
//     * @param minTechLevelUse min tech level to use the good
//     */
//    public void setMinTechLevelUse(int minTechLevelUse) {
//        this.minTechLevelUse = minTechLevelUse;
//    }
//
//    /**
//     * Getter method which gets the tech level which produces the most of this good
//     * @return tech level
//     */
//    public int getTechLevelProduceMost() {
//        return techLevelProduceMost;
//    }
//
//    /**
//     * Setter method which sets the tech level which produces the most of this good
//     * @param techLevelProduceMost tech level which produces the most of the good
//     */
//    public void setTechLevelProduceMost(int techLevelProduceMost) {
//        this.techLevelProduceMost = techLevelProduceMost;
//    }
//
//    /**
//     * Getter method which gets the base price of the good
//     * @return base price
//     */
//    public double getBasePrice() {
//        return basePrice;
//    }
//
//    /**
//     * Getter method which gets the base price of the good
//     * @param basePrice base price of good
//     */
//    public void setBasePrice(double basePrice) {
//        this.basePrice = basePrice;
//    }
//
//    /**
//     * Getter method which gets the price increase per level for this good
//     * @return price increase
//     */
//    public int getPriceIncreasePerLevel() {
//        return priceIncreasePerLevel;
//    }
//
//    /**
//     * Setter method which sets the price increase per level for this good
//     * @param priceIncreasePerLevel price increase per level of the good
//     */
//    public void setPriceIncreasePerLevel(int priceIncreasePerLevel) {
//        this.priceIncreasePerLevel = priceIncreasePerLevel;
//    }
//
//    /**
//     * Getter method which gets the variance used in calculating price change
//     * @return the variance
//     */
//    public int getVar() {
//        return var;
//    }
//
//    /**
//     * Setter method which sets the variance used in calculating price change
//     * @param var variance for calculations
//     */
//    public void setVar(int var) {
//        this.var = var;
//    }
//
//    /**
//     * Getter method which gets the price increase event that occurs on the object
//     * @return the price increase event
//     */
//    public PriceIncreaseEvent getPriceIncreaseEvent() {
//        return priceIncreaseEvent;
//    }
//
//    /**
//     * Setter method which sets the price increase event that occurs on the object
//     * @param priceIncreaseEvent the price increase event
//     */
//    public void setPriceIncreaseEvent(PriceIncreaseEvent priceIncreaseEvent) {
//        this.priceIncreaseEvent = priceIncreaseEvent;
//    }
//
//    /**
//     * Getter method which gets the low price condition when trading this good
//     * @return the low price condition
//     */
//    public Resource getLowPriceCondition() {
//        return lowPriceCondition;
//    }
//
//    /**
//     * Setter method which sets the low price condition when trading this good
//     * @param lowPriceCondition the low price condition
//     */
//    public void setLowPriceCondition(Resource lowPriceCondition) {
//        this.lowPriceCondition = lowPriceCondition;
//    }
//
//    /**
//     * Getter method which gets the high price condition when trading this good
//     * @return the high price condition
//     */
//    public Resource getHighPriceCondition() {
//        return highPriceCondition;
//    }
//
//    /**
//     * Setter method which sets the high price condition when trading this good
//     * @param highPriceCondition the high price condition
//     */
//    public void setHighPriceCondition(Resource highPriceCondition) {
//        this.highPriceCondition = highPriceCondition;
//    }
//
//    /**
//     * Getter method which gets min price offered in space trade with random trader
//     * @return min price
//     */
//    public double getMTL() {
//        return MTL;
//    }
//
//    /**
//     * Setter method which sets min price offered in space trade with random trader
//     * @param MTL min price offered with trader
//     */
//    public void setMTL(double MTL) {
//        this.MTL = MTL;
//    }
//
//    /**
//     * Getter method which gets the inflation in price for the good
//     * @return inflation amount
//     */
//    public double getInflation() { return inflation; }
//
//    /**
//     * Setter method which sets the inflation in price for the good
//     * @param inflation inflation amount
//     */
//    public void setInflation(double inflation) { this.inflation = inflation;}

    /**
     * Method for randomly computing the value of the variance used in price calculations
     * @return variance
     */
    private double variance() {
        Random rand = new Random();
        int n = rand.nextInt(var);
        return basePrice * (1 + (((double) n) * 0.01));
    }

    /**
     * Method which accounts for price changes depending on the location/building your player is at
     * @return change in price
     */
    private double locationPriceChange() {

        double change;

        change = player.getBuilding().getSalesTax();

        return change;
    }

    /**
     * Method which calculates the market price for the good
     * @return final price of good
     */
    public double market_price() {
        double input = variance + basePrice + (priceIncreasePerLevel *
                (techLevelProduceMost - minTechLevelProduce)) + locationPriceChange();
        return Math.round(input * 100.0) / 100.0;
        //return input;
    }

}
