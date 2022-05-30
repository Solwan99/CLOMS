/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cloms;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author solwa
 */
public class VisitorsTest {
    
    public VisitorsTest() {
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
     * Test of setVisitorData method, of class Visitors.
     */
    @Test
    public void testSetVisitorData1() throws Exception {
        System.out.println("setVisitorData");
        String name = "Adam karam";
        int ID = 3000;
        int phoneNumber = 012345;
        String address = "22 UNIVERSITY HELWAN";
        String userName = "adam";
        String password = "3000";
        int empID = 2000;
        Visitors instance = new Visitors();
        boolean expResult = true;
        boolean result = instance.setVisitorData(name, ID, phoneNumber, address, userName, password, empID);
        assertEquals(expResult, result);
  
    }
    @Test
    public void testSetVisitorData2() throws Exception {
        System.out.println("setVisitorData");
        String name = "Sam claflin";
        int ID = 3000;
        int phoneNumber = 011222333;
        String address = "UNIVERSITY HELWAN";
        String userName = "sam";
        String password = "3000";
        int empID = 2001;
        Visitors instance = new Visitors();
        boolean expResult = false;
        boolean result = instance.setVisitorData(name, ID, phoneNumber, address, userName, password, empID);
        assertEquals(expResult, result);
  
    }
    @Test
    public void testSetVisitorData3() throws Exception {
        System.out.println("setVisitorData");
        String name = "Arial walter";
        int ID = 3001;
        int phoneNumber = 022333445;
        String address = "Helwan University street";
        String userName = "arial";
        String password = "3001";
        int empID = 2005;
        Visitors instance = new Visitors();
        boolean expResult = false;
        boolean result = instance.setVisitorData(name, ID, phoneNumber, address, userName, password, empID);
        assertEquals(expResult, result);
  
    }
    @Test
    public void testSetVisitorData4() throws Exception {
        System.out.println("setVisitorData");
        String name = "Omar";
        int ID = 3001 ;
        int phoneNumber = 0;
        String address = "7 Maadi 9st.";
        String userName = null;
        String password = "3001";
        int empID = 2002;
        Visitors instance = new Visitors();
        boolean expResult = false;
        boolean result = instance.setVisitorData(name, ID, phoneNumber, address, userName, password, empID);
        assertEquals(expResult, result);
  
    }
  

    /**
     * Test of printVisitorData method, of class Visitors.
     */
    @Test
    public void testPrintVisitorData() throws Exception {
        System.out.println("printVisitorData");
        Visitors instance = new Visitors();
        instance.printVisitorData();

    }

    /**
     * Test of login method, of class Visitors.
     */
    @Test
    public void testLogin() throws Exception {
        System.out.println("login");
        String userName = "omar";
        String password = "3001";
        Visitors instance = new Visitors();
        instance.login(userName, password);
    }

 

}
