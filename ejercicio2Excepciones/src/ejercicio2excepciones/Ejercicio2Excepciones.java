package ejercicio2excepciones;

public class Ejercicio2Excepciones {

    public static void main(String[] args) {

        int[] array = new int[5];

        try {
            for (int i = 0; i < 30; i++) {
                array[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }

}
