/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author samir pellegrini
 */
public class calcolodataTest {

    public calcolodataTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of calcolodata method, of class calcolodata.
     */
    @Test
    public void testCalcolodata() {
        System.out.println("calcolodata");
        calcolodata instance = new calcolodata(new Date(10,6,2020));
        Date expResult = new Date(12,6,2020);
        Date result = instance.calcolodata();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of giorno method, of class calcolodata.
     */
    @Test
    public void testGiorno() {
        System.out.println("giorno");
        calcolodata instance = new calcolodata(new Date(10, 6, 2020));
        String expResult = "lunedi";
        String result = instance.giorno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

}
