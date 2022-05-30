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
public class BooksAndResourcesTest {
    
    public BooksAndResourcesTest() {
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
     * Test of setBookInfo method, of class BooksAndResources.
     */
    @Test
    public void testSetBookInfo() throws Exception {
        System.out.println("setBookInfo");
        int BR_NUMBER = 1020;
        String BR_Name = "talesoftwocities";
        String AuthorName = "william ";
        int price = 50;
    
        int Availability = 1;
        int updatedBy = 2000;
        BooksAndResources instance = new BooksAndResources();
        boolean result;
        boolean expResult=true;
        result=instance.setBookInfo(BR_NUMBER, BR_Name, AuthorName, price,  Availability, updatedBy);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
 @Test
    public void testuniquenessSetBookInfo() throws Exception {
        System.out.println("setBookInfo");
        int BR_NUMBER = 1020;
        String BR_Name = "behind her eyes";
        String AuthorName = "william ";
        int price = 150;
    
        int Availability = 1;
        int updatedBy = 2002;
        BooksAndResources instance = new BooksAndResources();
        boolean result;
        boolean expResult=false;
        result=instance.setBookInfo(BR_NUMBER, BR_Name, AuthorName, price,  Availability, updatedBy);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    /**
     * Test of lending method, of class BooksAndResources.
     */
    @Test
    public void testLending() throws Exception {
        System.out.println("lending");
        int BookNumber = 0;
        int EmployeeID = 0;
        int memberID = 0;
        BooksAndResources instance = new BooksAndResources();
        instance.lending(BookNumber, EmployeeID, memberID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBooksAvailability method, of class BooksAndResources.
     */
    @Test
    public void testGetBooksAvailability() throws Exception {
        System.out.println("getBooksAvailability");
        int bookID = 0;
        BooksAndResources instance = new BooksAndResources();
        int expResult = 0;
        int result = instance.getBooksAvailability(bookID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchEBook method, of class BooksAndResources.
     */
    @Test
    public void testSearchEBook() throws Exception {
        System.out.println("searchEBook");
        String name = "";
        String author = "";
        BooksAndResources instance = new BooksAndResources();
        instance.searchEBook(name, author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendRecommendation method, of class BooksAndResources.
     */
    @Test
    public void testSendRecommendation() throws Exception {
        System.out.println("sendRecommendation");
        BooksAndResources instance = new BooksAndResources();
        instance.sendRecommendation();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
