package com.example.gttrader.Entity;

public class Furs extends Goods {
    public Furs(String name, int minTechLevelProduce, int minTechLevelUse,
                int techLevelProduceMost, double basePrice, int priceIncreasePerLevel, int var,
                PriceIncreaseEvent priceIncreaseEvent,
                Resource lowPriceCondition,
                Resource highPriceCondition,
                double MTL, double MTH) {
        super("Furs", 0, 0, 0, 1000, 10, 12, PriceIncreaseEvent.NIGHTORCOLD, Resource.RICHFAUNA,
                Resource.LIFELESS, 230, 2000);
    }
}
