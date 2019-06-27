package com.example.gttrader.Entity;

public class Ore extends Goods {
    public Ore(String name, int minTechLevelProduce, int minTechLevelUse,
               int techLevelProduceMost, double basePrice, int priceIncreasePerLevel, int var,
               PriceIncreaseEvent priceIncreaseEvent,
               Resource lowPriceCondition,
               Resource highPriceCondition,
               double MTL, double MTH) {
        super("Ore",2,2,3,500,20,10,null,Resource.MINERALRICH,Resource.MINERALPOOR,350,800);
    }
}
