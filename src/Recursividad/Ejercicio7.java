package Recursividad;

import java.util.Scanner;

public class Ejercicio7 {

    public static int mcd(int m, int n) {
        if (n == 0) {                          // caso base
            return m;
        }
        return mcd(n, m % n);                  // llamada recursiva
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número (M): ");
        int m = sc.nextInt();

        System.out.print("Ingrese el segundo número (N): ");
        int n = sc.nextInt();

        if (m < 0 || n < 0) {
            System.out.println("Los números no pueden ser negativos.");
        } else {
            System.out.println("El M.C.D. de " + m + " y " + n + " es " + mcd(m, n));
        }

        sc.close();
    }
}