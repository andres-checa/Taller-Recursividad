package Recursividad;

import java.util.Scanner;

public class Ejercicio12 {

    public static int sumar(int[][] matriz, int fila, int columna) {
        if (fila == matriz.length) {                                   // caso base
            return 0;
        }
        if (columna == matriz[fila].length) {                          // terminó la fila
            return sumar(matriz, fila + 1, 0);
        }
        return matriz[fila][columna] + sumar(matriz, fila, columna + 1);   // llamada recursiva
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de filas (m): ");
        int m = sc.nextInt();

        System.out.print("Ingrese el número de columnas (n): ");
        int n = sc.nextInt();

        if (m <= 0 || n <= 0) {
            System.out.println("Las filas y columnas deben ser mayores que cero.");
        } else {
            int[][] matriz = new int[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("Ingrese el valor [" + i + "][" + j + "]: ");
                    matriz[i][j] = sc.nextInt();
                }
            }

            System.out.println("La suma de los elementos de la matriz es: " + sumar(matriz, 0, 0));
        }

        sc.close();
    }
}