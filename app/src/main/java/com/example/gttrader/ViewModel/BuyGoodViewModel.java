package com.example.gttrader.ViewModel;

import com.example.gttrader.Entity.Firearms;
import com.example.gttrader.Entity.Food;
import com.example.gttrader.Entity.Furs;
import com.example.gttrader.Entity.Games;
import com.example.gttrader.Entity.Machines;
import com.example.gttrader.Entity.Medicine;
import com.example.gttrader.Entity.Narcotics;
import com.example.gttrader.Entity.Ore;
import com.example.gttrader.Entity.Robots;
import com.example.gttrader.Entity.Universe;
import com.example.gttrader.Entity.Water;
import com.example.gttrader.Entity.Goods;
import com.example.gttrader.Entity.Player;


public class BuyGoodViewModel {
    private Universe universe = Universe.getUniverse();

    public void buyGood(Goods good) {
        Player player = universe.getPlayer();
        player.buyGood(good);
        System.out.println(player.getScooter().getScooter_hold());
    }

    public void sellGood(Goods good) {
        Player player = universe.getPlayer();
        player.sellGood(good);
    }


}
