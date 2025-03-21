package Ejercicios.e1;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Ejemplo2_AbrirArchivo {
    public static void main(String[] args) {
        Scanner in = null;
        File file = new File("test.in");

        try {
            in = new Scanner(file);
            System.out.println("Leyendo desde: " + file.getName());
        } catch (FileNotFoundException e1) {
            System.out.println("Advertencia: No se encontró " + file.getName() + ". Intentando abrir 'backup.in'...");

            // Intentar abrir un archivo de respaldo
            file = new File("backup.in");
            try {
                in = new Scanner(file);
                System.out.println("Leyendo desde: " + file.getName());
            } catch (FileNotFoundException e2) {
                System.out.println("Error: No se encontró ni 'test.in' ni 'backup.in'.");
                return; // Salir del programa si no hay archivos disponibles
            }
        }

        // Si hemos conseguido abrir un archivo, leerlo
        while (in.hasNextLine()) {
            System.out.println(in.nextLine());
        }

        in.close();
    }
}
