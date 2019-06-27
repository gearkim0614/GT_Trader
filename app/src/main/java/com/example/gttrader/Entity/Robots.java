package com.example.gttrader.Entity;

public class Robots extends Goods {
    public Robots(String name, int minTechLevelProduce, int minTechLevelUse,
                  int techLevelProduceMost, double basePrice, int priceIncreasePerLevel, int var,
                  PriceIncreaseEvent priceIncreaseEvent,
                  Resource lowPriceCondition,
                  Resource highPriceCondition,
                  double MTL, double MTH) {
        super("Robots", 6,4,7,800,-150,150,null,null,null,3500,2500);
    }
}
