package com.example.gttrader;

import com.example.gttrader.Entity.Firearms;
import com.example.gttrader.Entity.Narcotics;
import com.example.gttrader.Entity.Water;
import com.example.gttrader.Entity.Player;
import com.example.gttrader.Entity.Scooter;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class JasonTests {
    Narcotics narcotics1 = new Narcotics ();
    Narcotics narcotics2 = new Narcotics ();
    Firearms firearm1 = new Firearms();

    Player player1 = new Player("Jason",4,4,4,4);
    Scooter scooter1 = player1.getScooter();

    Player player2 = new Player("Peggy",4,4,4,4);
    Scooter scooter2 = player2.getScooter();

    HashMap<Integer, Integer> scooter_hold = new HashMap<Integer, Integer>();

    @Test
    public void narcotics_test1() {
        assertTrue(narcotics1.equals(narcotics2));
    }

    @Test
    public void narcotics_test2() {
        assertFalse(narcotics1.equals(firearm1));
    }

    @Test
    public void battery_test1() {
        scooter1.setBatteryLife ( 75.5 );
        scooter2.setBatteryLife ( 75.5 );
        assertEquals (scooter1.getBatteryLife (),scooter2.getBatteryLife (),0.01);
    }

    @Test
    public void battery_test2() {
        scooter1.setBatteryLife ( 0.0 );
        assertNotEquals (scooter1.getBatteryLife (),scooter1.getBatteryLife () - 1.0,0.1);
    }

    @Test
    public void scooter_test1() {
        for (int i = 1; i < 11; i++) {
            scooter_hold.put(i, 0);
        }
        scooter_hold.put(10, 1);
        scooter_hold.put(1, 2);
        scooter_hold.put(7, 1);
        scooter1.addToHold ( new Water() );
        scooter1.addToHold ( new Firearms () );
        scooter1.addToHold ( new Firearms () );
        scooter1.addToHold ( new Firearms () );
        scooter1.removeFromHold2 ( new Firearms () );
        scooter1.addToHold ( new Narcotics () );
        assertEquals ( scooter1.getScooter_hold (), scooter_hold );
    }

    @Test
    public void scooter_test2() {
        for (int i = 1; i < 11; i++) {
            scooter_hold.put(i, 0);
        }
        scooter_hold.put(10, 100);
        scooter_hold.put(1, 2);
        scooter_hold.put(7, 1);
        scooter1.removeFromHold2 ( new Firearms () );
        scooter1.addToHold ( new Narcotics () );
        assertNotEquals ( scooter1.getScooter_hold (), scooter_hold );
    }
}