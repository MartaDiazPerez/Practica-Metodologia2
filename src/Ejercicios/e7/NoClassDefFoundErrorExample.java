package Ejercicios.e7;

public class NoClassDefFoundErrorExample {
    public static void main(String[] args) {
        try {
            // Intentamos crear una instancia de MyClass, lo que lanzará NoClassDefFoundError si no se encuentra
            MyClass myClass = new MyClass();
            myClass.saludar();
        } catch (Error e) {  // Usamos Error para capturar NoClassDefFoundError
            // Capturamos y mostramos el mensaje de error
            System.out.println("Error: No se pudo encontrar la clase: " + e.getMessage());
        }
    }
}
