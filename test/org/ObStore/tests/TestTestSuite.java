/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ObStore.tests;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author gautam
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({})
public class TestTestSuite extends TestCase {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    @Override
    public void setUp() throws Exception {
    }
    
    public void test_canary(){
        assertTrue("Canary Test", true);
    }
    
    @After
    @Override
    public void tearDown() throws Exception {
    }
    
}
