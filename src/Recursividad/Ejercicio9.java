package Recursividad;

import java.util.Scanner;

public class Ejercicio9 {

    public static int cociente(int dividendo, int divisor) {
        if (dividendo < divisor) {                                 // caso base
            return 0;
        }
        return 1 + cociente(dividendo - divisor, divisor);         // llamada recursiva
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el dividendo: ");
        int dividendo = sc.nextInt();

        System.out.print("Ingrese el divisor: ");
        int divisor = sc.nextInt();

        if (dividendo < 0 || divisor <= 0) {
            System.out.println("El dividendo debe ser positivo y el divisor mayor que cero.");
        } else {
            System.out.println("Cociente de " + dividendo + " / " + divisor + " = " + cociente(dividendo, divisor));
        }

        sc.close();
    }
}