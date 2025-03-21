package Ejercicios.e1;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Ejemplo3 {
    public static void main(String[] args) {
        try {
            readFile("test.in"); // Delegamos el manejo de archivos a otro metodo
        } catch (FileNotFoundException e) {
            System.out.println("Error: No se encontró el archivo.");
        }
    }

    // Este metodo lanza la excepción y deja que main() decida qué hacer
    public static void readFile(String fileName) throws FileNotFoundException {
        Scanner in = new Scanner(new File(fileName));

        while (in.hasNextLine()) {
            System.out.println(in.nextLine());
        }

        in.close();
    }
}