package ejercicio3excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3Excepciones {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Ingresa num1: ");
            String num1 = scan.nextLine();
            System.out.println("Ingresa num2: ");
            String num2 = scan.nextLine();

            int num1Converted = Integer.parseInt(num1);
            int num2Converted = Integer.parseInt(num2);

            int divisionResultado = num1Converted / num2Converted;

            System.out.println("Resultado de la división: " + divisionResultado);
            int num3 = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error InputMismatchException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException" + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException" + e.getMessage());
        }

    }

}
