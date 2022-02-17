/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package grados;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author aitgal
 */
public class ConversorGradosTest {
    
    public ConversorGradosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setCelsius method, of class ConversorGrados.
     */
    @Ignore
    @Test
    public void testSetCelsius() {
        System.out.println("setCelsius");
        double celsius = 0.0;
        ConversorGrados instance = new ConversorGrados();
        instance.setCelsius(celsius);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFahrenheit method, of class ConversorGrados.
     */
    @Ignore
    @Test
    public void testSetFahrenheit() {
        System.out.println("setFahrenheit");
        double fahrenheit = 0.0;
        ConversorGrados instance = new ConversorGrados();
        instance.setFahrenheit(fahrenheit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCelsius method, of class ConversorGrados.
     */
    @Ignore
    @Test
    public void testGetCelsius() {
        System.out.println("getCelsius");
        ConversorGrados instance = new ConversorGrados();
        double expResult = 0.0;
        double result = instance.getCelsius();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFahrenheit method, of class ConversorGrados.
     */
    @Ignore
    @Test
    public void testGetFahrenheit() {
        System.out.println("getFahrenheit");
        ConversorGrados instance = new ConversorGrados();
        double expResult = 0.0;
        double result = instance.getFahrenheit();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of heittocelsius method, of class ConversorGrados f=-5.
     */
    @Test
    public void testHeittocelsius5() {
        System.out.println("heittocelsius");
        double f = -5;
        ConversorGrados instance = new ConversorGrados();
        double expResult = -20.5556;
        double result = instance.heittocelsius(f);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of heittocelsius method, of class ConversorGrados f=-0.
     */
    @Test
    public void testHeittocelsius0() {
        System.out.println("heittocelsius");
        double f = 0;
        ConversorGrados instance = new ConversorGrados();
        double expResult = -17.7778;
        double result = instance.heittocelsius(f);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
        /**
     * Test of heittocelsius method, of class ConversorGrados f=-0.
     */
    @Test
    public void testHeittocelsius15() {
        System.out.println("heittocelsius");
        double f = 15;
        ConversorGrados instance = new ConversorGrados();
        double expResult = -9.44444;
        double result = instance.heittocelsius(f);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
        /**
     * Test of heittocelsius method, of class ConversorGrados f=-0.
     */
    @Test
    public void testHeittocelsius32() {
        System.out.println("heittocelsius");
        double f = 32;
        ConversorGrados instance = new ConversorGrados();
        double expResult = 0.0;
        double result = instance.heittocelsius(f);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    /**
     * Test of celsiustofahrenheit method, of class ConversorGrados.
     */
    @Test
    public void testCelsiustofahrenheit5() {
        System.out.println("celsiustofahrenheit");
        double c = -5;
        ConversorGrados instance = new ConversorGrados();
        double expResult = 23;
        double result = instance.celsiustofahrenheit(c);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
        
    /**
     * Test of celsiustofahrenheit method, of class ConversorGrados.
     */
    @Test
    public void testCelsiustofahrenheit0() {
        System.out.println("celsiustofahrenheit");
        double c = 0.0;
        ConversorGrados instance = new ConversorGrados();
        double expResult = 32;
        double result = instance.celsiustofahrenheit(c);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
        
    /**
     * Test of celsiustofahrenheit method, of class ConversorGrados.
     */
    @Test
    public void testCelsiustofahrenheit15() {
        System.out.println("celsiustofahrenheit");
        double c = 15;
        ConversorGrados instance = new ConversorGrados();
        double expResult = 59;
        double result = instance.celsiustofahrenheit(c);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
        
    /**
     * Test of celsiustofahrenheit method, of class ConversorGrados.
     */
    @Test
    public void testCelsiustofahrenheit32() {
        System.out.println("celsiustofahrenheit");
        double c = 32;
        ConversorGrados instance = new ConversorGrados();
        double expResult = 89.6;
        double result = instance.celsiustofahrenheit(c);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
