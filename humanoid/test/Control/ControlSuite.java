/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Austin Poch
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Control.ItemControlTest.class, Control.LocationControlTest.class, Control.AttackControlTest.class, Control.GameControlTest.class, Control.OpponentControlTest.class})
public class ControlSuite {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}