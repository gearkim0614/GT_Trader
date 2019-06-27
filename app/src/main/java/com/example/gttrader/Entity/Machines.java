package com.example.gttrader.Entity;

public class Machines extends Goods {
    public Machines(String name, int minTechLevelProduce, int minTechLevelUse,
                    int techLevelProduceMost, double basePrice, int priceIncreasePerLevel, int var,
                    PriceIncreaseEvent priceIncreaseEvent,
                    Resource lowPriceCondition,
                    Resource highPriceCondition,
                    double MTL, double MTH) {
        super("Machine", 4,3,5,500,-30,5,PriceIncreaseEvent.STRIKE,null,null,600,2000);
    }
}
