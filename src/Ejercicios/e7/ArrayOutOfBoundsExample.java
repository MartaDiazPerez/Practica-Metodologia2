package Ejercicios.e7;

public class ArrayOutOfBoundsExample {

    public static void main(String[] args) {
        int[] anArray = new int[3]; // índices válidos: 0, 1, 2

        try {
            System.out.println(anArray[3]); // Esto lanza la excepción
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: índice fuera del rango del arreglo.");
        }
    }
}
