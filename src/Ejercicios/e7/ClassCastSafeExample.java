package Ejercicios.e7;

public class ClassCastSafeExample {
    public static void main(String[] args) {
        Object o = new Object();  // o puede ser cualquier cosa

        try {
            Integer i = (Integer) o;  // Intentamos convertir o a Integer
            System.out.println("Convertido a Integer: " + i);
        } catch (ClassCastException e) {
            System.out.println("Error: No se puede convertir a Integer. " + e.getMessage());
        }
    }
}