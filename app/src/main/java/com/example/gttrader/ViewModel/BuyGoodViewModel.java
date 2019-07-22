package com.example.gttrader.ViewModel;

import com.example.gttrader.Entity.Universe;
import com.example.gttrader.Entity.Goods;
import com.example.gttrader.Entity.Player;

/**
 * this class connects the UI views to the Player class in the Model
 * it allows players to buy/sell goods in the marketplace
 */
public class BuyGoodViewModel {
    private final Universe universe = Universe.getUniverse();
    Player player = universe.getPlayer();

    /**
     * method for a player to buy a good from the marketplace
     * @param good the good that the player wants to buy
     */
    public void buyGood(Goods good) {
        player.buyGood(good);
    }

    /**
     * method for a player to sell a good from their cargo hold
     * @param good the good that player wants to sell
     */
    public void sellGood(Goods good) {
        player.sellGood(good);
    }


}
