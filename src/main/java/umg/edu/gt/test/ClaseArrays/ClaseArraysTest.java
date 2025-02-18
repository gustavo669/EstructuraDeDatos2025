package umg.edu.gt.test.ClaseArrays;

import org.junit.Test;
import umg.edu.gt.desarrollo.estructuradedatos2025.clases.ClaseArrays;

import static org.junit.Assert.assertEquals;

public class ClaseArraysTest {

    @Test
    public void testRiquezaMaximaEjemplo1() {
        int[][] cuentas = {{1,2,3}, {3,2,1}};
        assertEquals(6, ClaseArrays.riquezaMaxima(cuentas));
    }

    @Test
    public void testRiquezaMaximaEjemplo2() {
        int[][] cuentas = {{1,5}, {7,3}, {3,5}};
        assertEquals(10, ClaseArrays.riquezaMaxima(cuentas));
    }

    @Test
    public void testRiquezaMaximaEjemplo3() {
        int[][] cuentas = {{2,8,7}, {7,1,3}, {1,9,5}};
        assertEquals(17, ClaseArrays.riquezaMaxima(cuentas));
    }

    @Test
    public void testRiquezaMaximaFalloForzado() {
        int[][] cuentas = {{2,8,7}, {7,1,3}, {1,9,5}};
        assertEquals(15, ClaseArrays.riquezaMaxima(cuentas)); // Fallará intencionalmente
    }
}
