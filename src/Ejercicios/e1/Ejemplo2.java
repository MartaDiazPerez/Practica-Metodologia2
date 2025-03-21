package Ejercicios.e1;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Ejemplo2 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("test.in"));

            while (in.hasNextLine()) {
                System.out.println(in.nextLine());
            }

            in.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Error: No se pudo encontrar el archivo 'test.in'.");
            System.out.println("Verifique que el archivo esté en la ubicación correcta.");
        }
    }
}
