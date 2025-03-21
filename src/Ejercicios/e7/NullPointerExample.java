package Ejercicios.e7;

public class NullPointerExample {
    public static void main(String[] args) {
        String[] strs = new String[3]; // Todos los elementos son null

        try {
            System.out.println(strs[0].length()); // Lanza NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Error: se intentó usar una referencia nula.");
        }
    }
}
