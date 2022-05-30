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
public class InternalComputersTest {
    
    public InternalComputersTest() {
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
     * Test of setInternalcomp method, of class InternalComputers.
     */
    @Test
    public void testuniquenessSetInternalcomp() throws Exception {
        System.out.println("setInternalcomp");
        boolean state = true;
        int sessionDuration = 1;
        String ipAddress = "128.0.0.6";
        int memberid = 3002;
        InternalComputers instance = new InternalComputers();
        boolean expResult = false;
        boolean result = instance.setInternalcomp(state, sessionDuration, ipAddress, memberid);
        assertEquals(expResult, result);
    }
     @Test
    public void testnullSetInternalcomp() throws Exception {
        System.out.println("setInternalcomp");
        boolean state = true;
        int sessionDuration = 1;
        String ipAddress = null;
        int memberid = 3002;
        InternalComputers instance = new InternalComputers();
        boolean expResult = false;
        boolean result = instance.setInternalcomp(state, sessionDuration, ipAddress, memberid);
        assertEquals(expResult, result);
    }

    /**
     * Test of getComputersAvailabilty method, of class InternalComputers.
     */
    @Test
    public void testGetComputersAvailabilty() throws Exception {
        System.out.println("getComputersAvailabilty");
        InternalComputers instance = new InternalComputers();
        boolean expResult = true;
        boolean result = instance.getComputersAvailabilty();
        assertEquals(expResult, result);
    }

    /**
     * Test of InternalComputers method, of class InternalComputers.
     */
    @Test
    public void testInternalComputers() throws Exception {
        System.out.println("InternalComputers");
        InternalComputers instance = new InternalComputers();
        instance.InternalComputers();

    }

    /**
     * Test of setsession method, of class InternalComputers.
     */
    @Test
    public void testSetsession() throws Exception {
        System.out.println("setsession");
        int memberid = 3003;
        int sessionDuration = 1;
        String IPadress = "128.c";
        InternalComputers instance = new InternalComputers();
        boolean expResult = true;
        boolean result = instance.setsession(memberid, sessionDuration, IPadress);
        assertEquals(expResult, result);
    }

    /**
     * Test of freeComputer method, of class InternalComputers.
     */
    @Test
    public void testFreeComputer() throws Exception{
        System.out.println("freeComputer");
        String IPadress = "128.0.0.6";
        InternalComputers instance = new InternalComputers();
        boolean expResult = true;
        boolean result = instance.freeComputer(IPadress);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
