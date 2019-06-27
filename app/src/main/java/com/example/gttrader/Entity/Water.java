package com.example.gttrader.Entity;

public class Water extends Goods {
    public Water(String name, int minTechLevelProduce, int minTechLevelUse,
                 int techLevelProduceMost, double basePrice, int priceIncreasePerLevel, int var,
                 PriceIncreaseEvent priceIncreaseEvent,
                 Resource lowPriceCondition,
                 Resource highPriceCondition,
                 double MTL, double MTH) {
        super("Water",0,0,2,50,3,3,PriceIncreaseEvent.DROUGHT,Resource.LOTSOFWATER,Resource.DESERT,30,100 );
    }


}
