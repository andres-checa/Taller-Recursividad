package Recursividad;

import java.util.Scanner;

public class Ejercicio8 {

    public static String copiar(String origen) {
        if (origen.length() == 0) {                                // caso base
            return "";
        }
        return origen.charAt(0) + copiar(origen.substring(1));     // llamada recursiva
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String origen = sc.nextLine();

        String destino = copiar(origen);

        System.out.println("Cadena original: " + origen);
        System.out.println("Cadena copiada:   " + destino);

        sc.close();
    }
}