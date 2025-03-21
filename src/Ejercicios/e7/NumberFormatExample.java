package Ejercicios.e7;

public class NumberFormatExample {
    public static void main(String[] args) {
        String str = "abc"; // una cadena no numérica

        try {
            int num = Integer.parseInt(str);  // Intenta convertir "abc" a int → lanza excepción
            System.out.println("Número convertido: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Error: la cadena no es un número válido."); // Captura y maneja el error
        }
    }
}