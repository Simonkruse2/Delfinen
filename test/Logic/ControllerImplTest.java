/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Data.DataHandling;
import Data.User;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author jacobfolkehildebrandt
 */
public class ControllerImplTest {
    DataHandling d = new DataHandling();
    ControllerImpl instance = new ControllerImpl(d);
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
    @Ignore
    @Test
    public void testOpretBruger() {
        System.out.println("opretBruger");
        int ID = 0;
        String name = "Jacob";
        String birthdate = "100194";
        String phonenumber = "21461869";
        String email = "jacobfolke@hotmail.com";
        boolean elite = false;
        boolean active = false;
        boolean coach = false;
        String memberSince = "2018-11-16";
        String discipline = null;
        
        instance.opretBruger(ID, name, birthdate, phonenumber, email, elite, active, coach, memberSince, discipline);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of sletBruger method, of class ControllerImpl.
     */
    @Test
    public void testSletBruger() {
        System.out.println("sletBruger");
        int ID = 100;
        
        ArrayList<User> before = instance.readMemberList();
        System.out.println(before.size());
        instance.sletBruger(ID);
        ArrayList<User> after = instance.readMemberList();
        System.out.println(after.size());
        assertEquals(before.size()-1, after.size());
        // TODO review the generated test code and remove the default call to fail.
        
        ID = 100;
        String name = "Jacob";
        String birthdate = "100194";
        String phonenumber = "21461869";
        String email = "jacobfolke@hotmail.com";
        boolean elite = false;
        boolean active = false;
        boolean coach = false;
        String memberSince = "2018-11-16";
        String discipline = null;
        
        instance.opretBruger(ID, name, birthdate, phonenumber, email, elite, active, coach, memberSince, discipline);
    }

    /**
     * Test of readMemberList method, of class ControllerImpl.
     */
    @Ignore
    @Test
    public void testReadMemberList() {
        System.out.println("readMemberList");
        
        ArrayList<User> expResult = null;
        ArrayList<User> result = instance.readMemberList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
