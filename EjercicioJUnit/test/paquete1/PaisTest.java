/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package paquete1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SALA I
 */
public class PaisTest {
    private Docente instance;
    
    public PaisTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Docente();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of establecerNombrer method, of class Pais.
     */
    @Test
    public void testEstablecerNombrer() {
        System.out.println("establecerNombrer");
        String n = "";
        Pais instance = new Pais();
        instance.establecerNombrer(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerNombre method, of class Pais.
     */
    @Test
    public void testObtenerNombre() {
        System.out.println("obtenerNombre");
        Pais instance = new Pais();
        String expResult = "";
        String result = instance.obtenerNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
