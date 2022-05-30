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
 * @author rahma
 */
public class MembersTest {
    
    public MembersTest() {
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
     * Test of setMemberData method, of class Members.
     */
    @Test
    public void testSetMemberData() throws Exception {
        System.out.println("setMemberData");
        int memberNum = 3003;
       int MEMBERSHIP_NUM=200;
        String email = "aa@hotmail.com";
    
        String interests = "Art";
        double payment = 120.0;
        int E_ID=2001;
        Members instance = new Members();
        boolean expResult =true;
        boolean result = instance.setMemberData( memberNum, MEMBERSHIP_NUM,  email, interests,  payment, E_ID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
@Test
     public void test2SetMemberData() throws Exception {
        System.out.println("setMemberData");
        int memberNum = 3010;
       int MEMBERSHIP_NUM=220;
        String email = "aa@hotmail.com";
    
        String interests = "Romance";
        double payment = 120.0;
        int E_ID=2001;
        Members instance = new Members();
        boolean expResult =false;
        boolean result = instance.setMemberData( memberNum, MEMBERSHIP_NUM,  email, interests,  payment, E_ID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
     @Test
      public void test3SetMemberData() throws Exception {
        System.out.println("setMemberData");
        int memberNum = 3004;
       int MEMBERSHIP_NUM=200;
        String email = "aba@hotmail.com";
    
        String interests = "history";
        double payment = 120.0;
        int E_ID=2003;
        Members instance = new Members();
        boolean expResult =false;
        boolean result = instance.setMemberData( memberNum, MEMBERSHIP_NUM,  email, interests,  payment, E_ID);
        assertEquals(expResult, result);}
        // TODO review the generated test code and remove the default call to fail.
        
    /**
     * Test of printMembersData method, of class Members.
     */
    @Test
    public void testPrintMembersData() throws Exception {
        System.out.println("printMembersData");
        Members instance = new Members();
        instance.printMembersData();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of sendExpDate method, of class Members.
     */
    @Test
    public void testSendExpDate() {
        System.out.println("sendExpDate");
        Members instance = new Members();
        instance.sendExpDate();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComplains method, of class Members.
     */
    @Test
    public void testSetComplains() {
        System.out.println("setComplains");
        String complains = "";
        Members instance = new Members();
        instance.setComplains(complains);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reserve method, of class Members.
     */
    @Test
    public void testReserve() {
        System.out.println("reserve");
        Members instance = new Members();
        instance.reserve();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
