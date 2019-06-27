package com.example.gttrader.Entity;

public class Food extends Goods {
    public Food(String name, int minTechLevelProduce, int minTechLevelUse,
                int techLevelProduceMost, double basePrice, int priceIncreasePerLevel, int var,
                PriceIncreaseEvent priceIncreaseEvent,
                Resource lowPriceCondition,
                Resource highPriceCondition,
                double MTL, double MTH) {
        super("Food", 1, 0, 1, 100, 5, 5, PriceIncreaseEvent.NORTHAVECLOSE, Resource.RICHSOIL,
                Resource.POORSOIL, 90, 300);
    }
}
