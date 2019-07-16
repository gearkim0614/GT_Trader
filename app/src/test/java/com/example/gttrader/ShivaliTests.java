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


public class ShivaliTests {
    @Test
    public void firearms_eq_test1() {
        Firearms firearm1 = new Firearms();
        Firearms firearm2 = new Firearms();
        assertTrue(firearm1.equals(firearm2));
    }

    @Test
    public void firearms_eq_test2() {
        Firearms firearm1 = new Firearms();
        Games game1 = new Games();
        assertFalse(firearm1.equals(game1));
    }

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


    @Test
    public void addToHold_test2() {
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


    @Test
    public void addToHold_test3() {
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


