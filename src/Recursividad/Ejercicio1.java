package Recursividad;

import java.math.BigInteger;
import java.util.Scanner;

public class Ejercicio01Factorial {

    public static BigInteger factorial(int n) {
        if (n == 0) {                                      // caso base
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(factorial(n - 1));   // llamada recursiva
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int n = sc.nextInt();

        System.out.println("Factorial de " + n + " = " + factorial(n));
    }
}