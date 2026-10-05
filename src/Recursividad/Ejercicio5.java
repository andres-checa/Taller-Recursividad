package Recursividad;

import java.util.Scanner;

public class Ejercicio5 {

    public static int sumatoria(int n) {
        if (n == 0) {                                  // caso base
            return 0;
        }
        return n + sumatoria(n - 1);                   // llamada recursiva
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("El número no puede ser negativo.");
        } else {
            System.out.println("Sumatoria de 1 hasta " + n + " = " + sumatoria(n));
        }

        sc.close();
    }
}