package com.example.gttrader.Entity;

public class Firearms extends Goods {
    public Firearms(String name, int minTechLevelProduce, int minTechLevelUse,
                    int techLevelProduceMost, double basePrice, int priceIncreasePerLevel, int var,
                    PriceIncreaseEvent priceIncreaseEvent,
                    Resource lowPriceCondition,
                    Resource highPriceCondition,
                    double MTL, double MTHH) {
        super("Firearms", 3, 1, 5,
                1200, -75, 100, PriceIncreaseEvent.HUNTINGSEASON,
                Resource.MINERALRICH, Resource.WARLIKE, 600, 2000);
    }

}
