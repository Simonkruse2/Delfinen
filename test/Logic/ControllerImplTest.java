/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Data.DataHandling;
import Data.User;
import java.time.LocalDate;
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

    @Test
    public void testPriceCalculator() {
        boolean active = true;
        int age = 28;
        double priceExpected = 1600;

        double priceResult = instance.priceCalculator(age, active);
        assertEquals(priceExpected, priceResult, 0.0);

    }

    @Test
    public void testCalculateAge() {
        LocalDate birthdate = LocalDate.parse("1990-10-10");
        LocalDate currentDate = LocalDate.now();
        int ageExpected = 28;
        int ageResult = instance.calculateAge(birthdate, currentDate);
        assertEquals(ageExpected, ageResult);
    }

    @Test
    public void testSletBruger() {
        System.out.println("sletBruger");
        int ID = 100;
        String name = "Jacob";
        String birthdate = "1990-10-10";
        String phonenumber = "21461869";
        String email = "jacobfolke@hotmail.com";
        boolean elite = false;
        boolean active = false;
        boolean coach = false;
        String memberSince = "2018-11-16";
        String discipline = null;
        Double time = 0.0;

        ArrayList<User> before = instance.readMemberList();
        System.out.println(before.size());
        instance.sletBruger(ID);
        ArrayList<User> after = instance.readMemberList();
        System.out.println(after.size());
        assertEquals(before.size(), after.size());
        
        instance.opretBruger(ID, name, birthdate, phonenumber, email, elite, active, coach, memberSince, discipline, time);
        // TODO review the generated test code and remove the default call to fail.
    }
}
