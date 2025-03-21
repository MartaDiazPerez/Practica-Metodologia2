package Ejercicios.e7;

public class IllegalArgumentExample {
    public static void main(String[] args) {
        try {
            System.out.println("Área: " + calcularAreaCirculo(-5));  // Lanza IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Metodo que calcula el área de un círculo, pero lanza IllegalArgumentException si el radio es negativo
    public static double calcularAreaCirculo(double radio) {
        if (radio < 0) {
            throw new IllegalArgumentException("El radio no puede ser negativo.");
        }
        return Math.PI * Math.pow(radio, 2);
    }
}
