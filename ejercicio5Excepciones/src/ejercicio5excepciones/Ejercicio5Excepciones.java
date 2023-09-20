package ejercicio5excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5Excepciones {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numAleatorio = (int) (1 + Math.random() * 499);
        System.out.println(numAleatorio);

        int numIngresado;
        int contador = 0;
        try {
            do {
                System.out.println("Ingresa un número para adivinar: ");
                numIngresado = scan.nextInt();
                if (numIngresado < numAleatorio) {
                    System.out.println("El número que tienes que adivinar es mayor");
                    contador++;
                } else if (numIngresado > numAleatorio) {
                    System.out.println("El número que tienes que adivinar es menor");
                    contador++;
                }
            } while (numIngresado != numAleatorio);

        } catch (InputMismatchException e) {
            contador++;
            System.out.println("Error: no ingresaste un número entero " + e.getMessage());
        }

        System.out.println("Cantidad de intentos: " + contador);

    }

}
