package com.example.gttrader;

import com.example.gttrader.Entity.Building;
import com.example.gttrader.Entity.Food;
import com.example.gttrader.Entity.Medicine;
import com.example.gttrader.Entity.Player;
import com.example.gttrader.Entity.Universe;
import com.example.gttrader.Entity.Water;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class KibeomJUnit {

    @Test
    public void water_eq_water_test() {
        Water water1 = new Water();
        Water water2 = new Water();
        assertTrue(water1.equals(water2));
    }

    @Test
    public void water_eq_food_test() {
        Water water1 = new Water();
        Food food2 = new Food();
        assertFalse(water1.equals(food2));
    }

    @Test
    public void food_eq_food_test() {
        Food food1 = new Food();
        Food food2 = new Food();
        assertTrue(food1.equals(food2));
    }

    @Test
    public void food_eq_medicine_test() {
        Food food = new Food();
        Medicine medicine = new Medicine();
        assertFalse(food.equals(medicine));
    }

    @Test
    public void removeToHold_food_test() {
        Player player = new Player("kibeom", 4, 4, 4, 4);
        Universe universe = Universe.getUniverse();
        universe.setPlayer(player);
        Food food1 = new Food();
        player.buyGood(food1);
        assertTrue(player.getScooter().removeFromHold2(food1));
    }

    @Test
    public void removeToHold_empty_test() {
        Player player = new Player("kibeom", 4, 4, 4, 4);
        Universe universe = Universe.getUniverse();
        universe.setPlayer(player);
        Food food1 = new Food();
        //player.buyGood(food1);
        assertFalse(player.getScooter().removeFromHold2(food1));
    }


}
