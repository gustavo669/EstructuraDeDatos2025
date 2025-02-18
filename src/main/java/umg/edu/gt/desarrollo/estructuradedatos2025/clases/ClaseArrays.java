package umg.edu.gt.desarrollo.estructuradedatos2025.clases;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClaseArrays {
    public static int riquezaMaxima(int[][] cuentas) {
        int maxRiqueza = 0;
        for (int[] cliente : cuentas) {
            int riquezaCliente = 0;
            for (int banco : cliente) {
                riquezaCliente += banco;
            }
            maxRiqueza = Math.max(maxRiqueza, riquezaCliente);
        }
        return maxRiqueza;
    }

    public static int[][] ordenarDiagonales(int[][] mat) {
        int m = mat.length, n = mat[0].length;

        for (int i = 0; i < m; i++) {
            ordenarDiagonal(mat, i, 0, m, n);
        }

        for (int j = 1; j < n; j++) {
            ordenarDiagonal(mat, 0, j, m, n);
        }

        return mat;
    }

    private static void ordenarDiagonal(int[][] mat, int row, int col, int m, int n) {
        List<Integer> diagonal = new ArrayList<>();
        int r = row, c = col;

        while (r < m && c < n) {
            diagonal.add(mat[r][c]);
            r++;
            c++;
        }

        Collections.sort(diagonal);

        r = row;
        c = col;
        int index = 0;
        while (r < m && c < n) {
            mat[r][c] = diagonal.get(index++);
            r++;
            c++;
        }
    }

    public static int sumaMatriz(int[][] mat) {
        int suma = 0;
        for (int[] fila : mat) {
            for (int num : fila) {
                suma += num;
            }
        }
        return suma;
    }
}

