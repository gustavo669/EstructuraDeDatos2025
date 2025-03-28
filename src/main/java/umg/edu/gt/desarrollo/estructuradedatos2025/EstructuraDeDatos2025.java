/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package umg.edu.gt.desarrollo.estructuradedatos2025;

import java.util.Arrays;
import umg.edu.gt.desarrollo.estructuradedatos2025.clases.ClaseArrays;
import umg.edu.gt.desarrollo.estructuradedatos2025.clases.ClaseVectores;
import umg.edu.gt.desarrollo.estructuradedatos2025.clases.Persona;
import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicioVectores;

public class EstructuraDeDatos2025 {

    public static void main(String[] args) {
        testLombok();
        testTribonacci();
        testFindTotal();
        testClaseArrays();
        testClaseVectores();
    }

    public static void testTribonacci() {
        EjercicioVectores ejercicio1 = new EjercicioVectores();
        int[] signature = {0, 0, 1};
        int n = 9;
        System.out.println("Tribonacci: " + Arrays.toString(ejercicio1.tribonacci(signature, n)));
    }

    public static void testFindTotal() {
        EjercicioVectores ejercicio1 = new EjercicioVectores();
        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {17, 19, 21};
        int[] numbers3 = {5, 5, 5};

        System.out.println("Puntuación: " + ejercicio1.findTotal(numbers1));
        System.out.println("Puntuación: " + ejercicio1.findTotal(numbers2));
        System.out.println("Puntuación: " + ejercicio1.findTotal(numbers3));
    }

    public static void testClaseArrays() {
        int[][] cuentas = {
                {1, 2, 3},
                {3, 2, 1},
                {4, 5, 6}
        };

        System.out.println("Riqueza máxima: " + ClaseArrays.riquezaMaxima(cuentas));

        int[][] matriz = {
                {3, 3, 1, 1},
                {2, 2, 1, 2},
                {1, 1, 1, 2}
        };

        System.out.println("Matriz ordenada por diagonales: " + Arrays.deepToString(ClaseArrays.ordenarDiagonales(matriz)));
        System.out.println("Suma de la matriz: " + ClaseArrays.sumaMatriz(matriz));
    }

    public static void testClaseVectores() {
        ClaseVectores claseVectores = new ClaseVectores();
        claseVectores.ejemploListas();
        claseVectores.ejemploBuscarNumero();
        claseVectores.comparacionArraysLinkedListHash();
    }

    public static void testLombok() {
        Persona persona1 = new Persona("Gustavo Godoy", 24);
        System.out.println(persona1);

        persona1.setEdad(30);
        System.out.println("Edad actualizada: " + persona1.getEdad());
    }

}
