/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Data.User;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jacobfolkehildebrandt
 */
public class ControllerImplTest {
    
    public ControllerImplTest() {
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
     * Test of opretBruger method, of class ControllerImpl.
     */
    @Test
    public void testOpretBruger() {
        System.out.println("opretBruger");
        int ID = 0;
        String name = "";
        String birthdate = "";
        String phonenumber = "";
        String email = "";
        boolean elite = false;
        boolean active = false;
        boolean coach = false;
        String memberSince = "";
        String discipline = "";
        ControllerImpl instance = null;
        instance.opretBruger(ID, name, birthdate, phonenumber, email, elite, active, coach, memberSince, discipline);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sletBruger method, of class ControllerImpl.
     */
    @Test
    public void testSletBruger() {
        System.out.println("sletBruger");
        int ID = 0;
        ControllerImpl instance = null;
        instance.sletBruger(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readMemberList method, of class ControllerImpl.
     */
    @Test
    public void testReadMemberList() {
        System.out.println("readMemberList");
        ControllerImpl instance = null;
        ArrayList<User> expResult = null;
        ArrayList<User> result = instance.readMemberList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
