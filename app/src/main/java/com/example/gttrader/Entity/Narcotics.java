package com.example.gttrader.Entity;

public class Narcotics extends Goods {
    public Narcotics(String name, int minTechLevelProduce, int minTechLevelUse,
                     int techLevelProduceMost, double basePrice, int priceIncreasePerLevel, int var,
                     PriceIncreaseEvent priceIncreaseEvent,
                     Resource lowPriceCondition,
                     Resource highPriceCondition,
                     double MTL, double MTH) {
        super("Narcotics", 5, 0, 5, 1100, -125, 175, PriceIncreaseEvent.POLICERAID,Resource.WEIRDMUSHROOMS,null,2000,1800 );
    }

}
