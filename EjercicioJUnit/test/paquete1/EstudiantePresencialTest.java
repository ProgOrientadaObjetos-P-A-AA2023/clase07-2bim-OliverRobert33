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
public class EstudiantePresencialTest {
    
    public EstudiantePresencialTest() {
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
     * Test of establecerNumeroCreditos method, of class EstudiantePresencial.
     */
    @Test
    public void testEstablecerNumeroCreditos() {
        System.out.println("establecerNumeroCreditos");
        int numero = 0;
        EstudiantePresencial instance = new EstudiantePresencial();
        instance.establecerNumeroCreditos(numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of establecerCostoCredito method, of class EstudiantePresencial.
     */
    @Test
    public void testEstablecerCostoCredito() {
        System.out.println("establecerCostoCredito");
        double valor = 0.0;
        EstudiantePresencial instance = new EstudiantePresencial();
        instance.establecerCostoCredito(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularMatriculaPresencial method, of class EstudiantePresencial.
     */
    @Test
    public void testCalcularMatriculaPresencial() {
        System.out.println("calcularMatriculaPresencial");
        EstudiantePresencial instance = new EstudiantePresencial();
        instance.calcularMatriculaPresencial();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerNumeroCreditos method, of class EstudiantePresencial.
     */
    @Test
    public void testObtenerNumeroCreditos() {
        System.out.println("obtenerNumeroCreditos");
        EstudiantePresencial instance = new EstudiantePresencial();
        int expResult = 0;
        int result = instance.obtenerNumeroCreditos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerCostoCredito method, of class EstudiantePresencial.
     */
    @Test
    public void testObtenerCostoCredito() {
        System.out.println("obtenerCostoCredito");
        EstudiantePresencial instance = new EstudiantePresencial();
        double expResult = 0.0;
        double result = instance.obtenerCostoCredito();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerMatriculaPresencial method, of class EstudiantePresencial.
     */
    @Test
    public void testObtenerMatriculaPresencial() {
        System.out.println("obtenerMatriculaPresencial");
        EstudiantePresencial instance = new EstudiantePresencial();
        double expResult = 0.0;
        double result = instance.obtenerMatriculaPresencial();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
