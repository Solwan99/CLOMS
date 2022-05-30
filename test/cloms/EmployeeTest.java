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
public class EmployeeTest {
    
    public EmployeeTest() {
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
     * Test of setEmployeeData method, of class Employee.
     */
    @Test
    public void testSetEmployeeData1() {
        System.out.println("setEmployeeData");
        String JobTitle = null;
        String EmpFName = "Somaya";
        String EmpLName = "Ali";
        int id = 2006;
        int phone_Num = 112277;
        int salary = 3000;
        int work_hours = 8;
        boolean expResult = false;
        boolean result = Employee.setEmployeeData(JobTitle, EmpFName, EmpLName, id, phone_Num, salary, work_hours);
        assertEquals(expResult, result);
    }
    

    @Test
    public void testSetEmployeeData2() {
        System.out.println("setEmployeeData");
        String JobTitle = "Staff";
        String EmpFName = null;
        String EmpLName = "Dawn";
        int id = 2007;
        int phone_Num = 345678;
        int salary = 3000;
        int work_hours = 8;
        boolean expResult = false;
        boolean result = Employee.setEmployeeData(JobTitle, EmpFName, EmpLName, id, phone_Num, salary, work_hours);
        assertEquals(expResult, result);
    }
   @Test
    public void testSetEmployeeData3() {
        System.out.println("setEmployeeData");
        String JobTitle = "Librarian";
        String EmpFName = "Lisa";
        String EmpLName = "Choi";
        int id = 2008;
        int phone_Num = 113377;
        int salary = 5000;
        int work_hours = 6;
        boolean expResult = false;
        boolean result = Employee.setEmployeeData(JobTitle, EmpFName, EmpLName, id, phone_Num, salary, work_hours);
        assertEquals(expResult, result);
    }
 @Test
    public void testSetEmployeeData4() {
        System.out.println("setEmployeeData");
        String JobTitle = "Librarian";
        String EmpFName = "Lisa";
        String EmpLName = "Choi";
        int id = 2009;
        int phone_Num = 112288;
        int salary = 450;
       int work_hours = 8;
        boolean expResult = false;
        boolean result = Employee.setEmployeeData(JobTitle, EmpFName, EmpLName, id, phone_Num, salary, work_hours);
        assertEquals(expResult, result);
    }
}
