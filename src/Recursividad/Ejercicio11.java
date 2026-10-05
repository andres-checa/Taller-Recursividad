package Recursividad;

import java.util.Scanner;

public class Ejercicio11 {

    public static int sumar(int[] arreglo, int indice) {
        if (indice == arreglo.length) {                                // caso base
            return 0;
        }
        return arreglo[indice] + sumar(arreglo, indice + 1);           // llamada recursiva
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos valores desea ingresar? ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("La cantidad debe ser mayor que cero.");
        } else {
            int[] arreglo = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Ingrese el valor " + (i + 1) + ": ");
                arreglo[i] = sc.nextInt();
            }

            System.out.println("La suma de los elementos es: " + sumar(arreglo, 0));
        }

        sc.close();
    }
}