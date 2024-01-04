/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo041 {

    public static void main(String[] args) {
        // 
        String cadenaFinal = "";
        int[][] arreglo1 = {{1, 2, 3}, {3, 2, 4}, {2, 6, 2}};
        int[][] arreglo2 = {{1, 2, 3}, {2, 2, 2}, {3, 1, 2}};
        int[][] arreglo3 = new int[3][3];

        for (int f = 0; f < arreglo1.length; f++) {
            for (int c = 0; c < arreglo1[f].length; c++) {
                arreglo3[f][c] = obtenerMultiplicacion(arreglo1[f][c],
                        arreglo2[f][c]);
            }
        }
        for (int f = 0; f < arreglo1.length; f++) {
            for (int c = 0; c < arreglo1[f].length; c++) {
                System.out.printf(" %s %d", cadenaFinal, 
                        arreglo3[f][c]);
                if (c == 2) {
                    System.out.print("\n");
                }
            }
        }

    }

    public static int obtenerMultiplicacion(int a, int b) {
        int multiplicacion;
        multiplicacion = a * b;
        return multiplicacion;
    }

}


