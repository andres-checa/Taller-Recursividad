package Recursividad;

import java.util.Scanner;

public class Ejercicio4 {

    public static int sumaDigitos(int n) {
        if (n == 0) {                                      // caso base
            return 0;
        }
        return n % 10 + sumaDigitos(n / 10);               // llamada recursiva
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int n = sc.nextInt();

        System.out.println("Suma de los dígitos: " + sumaDigitos(n));

        sc.close();
    }
}