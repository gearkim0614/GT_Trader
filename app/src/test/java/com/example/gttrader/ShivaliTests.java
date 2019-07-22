package com.example.gttrader;
import org.junit.Test;
import com.example.gttrader.Entity.Food;
import com.example.gttrader.Entity.Firearms;
import com.example.gttrader.Entity.Games;
import com.example.gttrader.Entity.Player;
import com.example.gttrader.Entity.Universe;


import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * J Units for Shivali M9
 * testing the firearms equals and scooter addToHold methods
 */
public class ShivaliTests {
    /**
     * tests the firearms equal method
     * on two goods that are equal
     */
    @Test
    public void firearms_eq_test1() {
        Firearms firearm1 = new Firearms();
        Firearms firearm2 = new Firearms();
        assertTrue(firearm1.equals(firearm2));
    }

    /**
     * tests the firearms equal method
     * on two goods that are not equal
     */
    @Test
    public void firearms_eq_test2() {
        Firearms firearm1 = new Firearms();
        Games game1 = new Games();
        assertFalse(firearm1.equals(game1));
    }

    /**
     * tests the add to hold method in the scooter class
     * tests for adding a good not already in the hold
     */
    @Test
    public void addToHold_test1() {
        Player player = new Player("shivali", 4, 4, 4, 4);
        Universe universe = Universe.getUniverse();
        universe.setPlayer(player);
        Food food1 = new Food();
        player.buyGood(food1);
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,0);
        map.put(2,1);
        map.put(3,0);
        map.put(4,0);
        map.put(5,0);
        map.put(6,0);
        map.put(7,0);
        map.put(8,0);
        map.put(9,0);
        map.put(10,0);

        assertEquals(player.getScooter().getScooter_hold(), map);
    }

    /**
     * tests the add to hold method in the scooter class
     * tests for adding a good already in the hold
     */
    @Test
    public void addToHold_test2() {
        Player player = new Player("shivali", 4, 4, 4, 4);
        Universe universe = Universe.getUniverse();
        universe.setPlayer(player);
        Food food1 = new Food();
        player.buyGood(food1);
        player.buyGood(food1);
        player.buyGood(food1);
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,0);
        map.put(2,3);
        map.put(3,0);
        map.put(4,0);
        map.put(5,0);
        map.put(6,0);
        map.put(7,0);
        map.put(8,0);
        map.put(9,0);
        map.put(10,0);

        assertEquals(player.getScooter().getScooter_hold(), map);
    }


}


