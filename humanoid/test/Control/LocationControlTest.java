/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Austin Poch
 */
public class LocationControlTest {
    
    public LocationControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of ironShopCalculations method, of class LocationControl.
     */
    @Test
    public void testIronShopCalculations() {
        System.out.println("ironShopCalculations");
        int iron = 36;
        int lbsPerGun = 3;
        int lbsPerSword = 6;
        LocationControl instance = new LocationControl();
        int expResult = 4;
        int result = instance.ironShopCalculations(iron, lbsPerGun, lbsPerSword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of gunShopCalculations method, of class LocationControl.
     */
    @Test
    public void testGunShopCalculations() {
        System.out.println("gunShopCalculations");
        int mags = 3;
        int rounds = 15;
        int grains = 120;
        LocationControl instance = new LocationControl();
        int expResult = 5400;
        int result = instance.gunShopCalculations(mags, rounds, grains);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of forestCalculations method, of class LocationControl.
     */
    @Test
    public void testForestCalculations() {
        System.out.println("forestCalculations");
        int loggers = 3;
        int hoursPerTree = 5;
        int totalHours = 20;
        LocationControl instance = new LocationControl();
        int expResult = 300;
        int result = instance.forestCalculations(loggers, hoursPerTree, totalHours);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail
    }
    
}
