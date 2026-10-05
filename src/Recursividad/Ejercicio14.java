package Recursividad;

import java.util.Scanner;

public class Ejercicio14 {

    public static int ackermann(int m, int n) {
        if (m == 0) {                                          // caso base
            return n + 1;
        }
        if (n == 0) {
            return ackermann(m - 1, 1);                        // llamada recursiva
        }
        return ackermann(m - 1, ackermann(m, n - 1));          // llamada recursiva doble
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de m: ");
        int m = sc.nextInt();

        System.out.print("Ingrese el valor de n: ");
        int n = sc.nextInt();

        if (m < 0 || n < 0) {
            System.out.println("Los valores no pueden ser negativos.");
        } else {
            System.out.println("Ackermann(" + m + ", " + n + ") = " + ackermann(m, n));
        }

        sc.close();
    }
}