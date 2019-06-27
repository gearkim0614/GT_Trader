package com.example.gttrader.Entity;

public class Games extends Goods {
    public Games(String name, int minTechLevelProduce, int minTechLevelUse,
                 int techLevelProduceMost, double basePrice, int priceIncreasePerLevel, int var,
                 PriceIncreaseEvent priceIncreaseEvent,
                 Resource lowPriceCondition,
                 Resource highPriceCondition,
                 double MTL, double MTH) {
        super("Games", 3,1, 6, 200, -10, 5, PriceIncreaseEvent.SUMMERVACATION, Resource.ARTISTIC,
                null, 160, 300);
    }
}
