package Ejercicios.e1;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Ejempo1 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("test.in"));
            while (in.hasNextLine()) {
                System.out.println(in.nextLine());
            }
            in.close(); // Cerrar el scanner después de usarlo
        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado.");
        }
    }
}