package Recursividad;

import java.util.Scanner;

public class Ejercicio10 {

    public static int multiplicar(int a, int b) {
        if (b == 0) {                                  // caso base
            return 0;
        }
        return a + multiplicar(a, b - 1);              // llamada recursiva
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();

        if (a < 0 || b < 0) {
            System.out.println("Los números no pueden ser negativos.");
        } else {
            System.out.println(a + " x " + b + " = " + multiplicar(a, b));
        }

        sc.close();
    }
}