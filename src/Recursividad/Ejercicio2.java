package Recursividad;

import java.util.Scanner;

public class Ejercicio2 {

    public static long invertir(int n, long resultado) {
        if (n == 0) {                                              // caso base
            return resultado;
        }
        return invertir(n / 10, resultado * 10 + n % 10);          // llamada recursiva
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int n = sc.nextInt();

        System.out.println("Número invertido: " + invertir(n, 0));
        sc.close();
    }
}