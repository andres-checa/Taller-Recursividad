package Recursividad;

import java.util.Scanner;

public class Ejercicio3 {

    public static double sumatoria(int n) {
        if (n == 1) {                                  // caso base
            return 1;
        }
        return 1.0 / n + sumatoria(n - 1);             // llamada recursiva
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero mayor o igual a 1: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("El número debe ser mayor o igual a 1.");
        } else {
            System.out.println("Sumatoria = " + sumatoria(n));
        }

        sc.close();
    }
}