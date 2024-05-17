package Ejercicios;

import java.util.Scanner;

public class Ej03 {

    public static void main(String[] args) {
        byte edad;
        float AC, aumE;
        String nom = Nombre();
        edad = Edad();
        String TA = Analisis();
        AC = analisisCosto(TA);
        aumE = aumentoE(edad, AC);
        imprimir(nom, edad, AC, aumE);
    }

    public static String Nombre() {
        Scanner teclado = new Scanner(System.in);
        String nom;
        System.out.print("Ingrese nombre: ");
        nom = teclado.next();
        return nom;
    }

    static byte Edad() {
        Scanner teclado = new Scanner(System.in);
        byte edad;
        System.out.print("Ingrese edad: ");
        edad = Byte.parseByte(teclado.next());
        return edad;
    }

    public static String Analisis() {
        Scanner teclado = new Scanner(System.in);
        String TA;
        System.out.print("Elija tipo de analisis (1/2/3): ");
        TA = teclado.next();
        return TA;
    }

    static float analisisCosto(String TA) {
        float AC = 0;
        switch (TA) {
            case "1" ->
                AC = 25;
            case "2" ->
                AC = 36;
            case "3" ->
                AC = 50;
            default -> {
                System.out.print("No válido");
            }
        }
        return AC;
    }

    static float aumentoE(int edad, float AC) {
        float aumE = 0;
        if (edad >= 14 & edad <= 22) {
            aumE = (float) (AC + AC * 0.10);
        }
        return aumE;
    }

    static void imprimir(String nom, int edad, float AC, float aumE) {
        System.out.println("\u001B[31m--------------------------------Reporte--------------------------------");
        System.out.println("Nombre del paciente: " + nom);
        System.out.println("Nombre del paciente: " + edad);
        System.out.println("Precio de analisis: S/." + AC);
        System.out.println("\u001B[34mTotal con costo adicional (pacientes de entre 14 y 22 años): S/." + aumE);
        System.out.println("\u001B[31m-----------------------------------------------------------------------");
    }
}
