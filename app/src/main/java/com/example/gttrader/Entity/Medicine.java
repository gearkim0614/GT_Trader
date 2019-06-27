package com.example.gttrader.Entity;

public class Medicine extends Goods {
    public Medicine(String name, int minTechLevelProduce, int minTechLevelUse,
                    int techLevelProduceMost, double basePrice, int priceIncreasePerLevel, int var,
                    PriceIncreaseEvent priceIncreaseEvent,
                    Resource lowPriceCondition,
                    Resource highPriceCondition,
                    double MTL, double MTH) {
        super("Medicine", 4,1,6,400,-20,5,PriceIncreaseEvent.FLUSEASON,Resource.LOTSOFHERBS,null,400,1000);
    }
}
