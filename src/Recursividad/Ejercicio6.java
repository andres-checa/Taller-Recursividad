package Recursividad;

import java.util.Scanner;

public class Ejercicio6 {

    public static long potencia(int base, int exponente) {
        if (exponente == 0) {                                  // caso base
            return 1;
        }
        return base * potencia(base, exponente - 1);           // llamada recursiva
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la base: ");
        int base = sc.nextInt();

        System.out.print("Ingrese el exponente (entero positivo): ");
        int exponente = sc.nextInt();

        if (exponente < 0) {
            System.out.println("El exponente no puede ser negativo.");
        } else {
            System.out.println(base + " elevado a " + exponente + " = " + potencia(base, exponente));
        }

        sc.close();
    }
}