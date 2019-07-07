package com.example.gttrader.Entity;
import java.util.Random;

public class Goods {
    protected String name;
    //protected double price;
    //protected int quantity;
    protected int minTechLevelProduce;
    protected int minTechLevelUse;
    protected int techLevelProduceMost;
    protected double basePrice;
    protected int priceIncreasePerLevel;
    protected int var;
    protected PriceIncreaseEvent priceIncreaseEvent;
    protected Resource lowPriceCondition;
    protected Resource highPriceCondition;
    protected double MTL;
    protected double MTH;

    public Goods(String name, int minTechLevelProduce, int minTechLevelUse,
                 int techLevelProduceMost, double basePrice, int priceIncreasePerLevel, int var,
                 PriceIncreaseEvent priceIncreaseEvent,
                 Resource lowPriceCondition,
                 Resource highPriceCondition,
                 double MTL, double MTH) {
        this.name = name;
        //this.price = price;
        //this.quantity = quantity;
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
        }

    public Goods(String name, double price, int quantity) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinTechLevelProduce() {
        return minTechLevelProduce;
    }

    public void setMinTechLevelProduce(int minTechLevelProduce) {
        this.minTechLevelProduce = minTechLevelProduce;
    }

    public int getMinTechLevelUse() {
        return minTechLevelUse;
    }

    public void setMinTechLevelUse(int minTechLevelUse) {
        this.minTechLevelUse = minTechLevelUse;
    }

    public int getTechLevelProduceMost() {
        return techLevelProduceMost;
    }

    public void setTechLevelProduceMost(int techLevelProduceMost) {
        this.techLevelProduceMost = techLevelProduceMost;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public int getPriceIncreasePerLevel() {
        return priceIncreasePerLevel;
    }

    public void setPriceIncreasePerLevel(int priceIncreasePerLevel) {
        this.priceIncreasePerLevel = priceIncreasePerLevel;
    }

    public int getVar() {
        return var;
    }

    public void setVar(int var) {
        this.var = var;
    }

    public PriceIncreaseEvent getPriceIncreaseEvent() {
        return priceIncreaseEvent;
    }

    public void setPriceIncreaseEvent(PriceIncreaseEvent priceIncreaseEvent) {
        this.priceIncreaseEvent = priceIncreaseEvent;
    }

    public Resource getLowPriceCondition() {
        return lowPriceCondition;
    }

    public void setLowPriceCondition(Resource lowPriceCondition) {
        this.lowPriceCondition = lowPriceCondition;
    }

    public Resource getHighPriceCondition() {
        return highPriceCondition;
    }

    public void setHighPriceCondition(Resource highPriceCondition) {
        this.highPriceCondition = highPriceCondition;
    }

    public double getMTL() {
        return MTL;
    }

    public void setMTL(double MTL) {
        this.MTL = MTL;
    }

    public double getMTH() {
        return MTH;
    }

    public void setMTH(double MTH) {
        this.MTH = MTH;
    }

    public double variance() {
        Random rand = new Random();
        int n = rand.nextInt(var);
        double var_price = basePrice * (1 + (((double) n) * 0.01));
        return var_price;
    }

    public double market_price() {
        return variance() + basePrice + (priceIncreasePerLevel * (techLevelProduceMost - minTechLevelProduce));
    }

}
