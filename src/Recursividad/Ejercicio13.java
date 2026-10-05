package Recursividad;

import java.util.Scanner;

public class Ejercicio13 {

    public static int fibonacci(int n) {
        if (n == 0) {                                      // caso base
            return 0;
        }
        if (n == 1) {                                      // caso base
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);        // llamada recursiva
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el límite de la serie: ");
        int limite = sc.nextInt();

        if (limite < 0) {
            System.out.println("El límite no puede ser negativo.");
        } else {
            System.out.print("Serie de Fibonacci: ");
            for (int i = 0; i <= limite; i++) {
                System.out.print(fibonacci(i) + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}