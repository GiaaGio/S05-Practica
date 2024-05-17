package Ejercicios;

import java.util.Scanner;

public class Ej02 {

    public static void main(String[] args) {
        float PB, PR, PS, dscB, dscR, dscS, total, totalD;
        short CB, CR, CS;
        CB = CantidadBrochas();
        CR = CantidadRodillos();
        CS = CantidadSellador();
        String CC = ContadoCredito();
        PB = precioB(CB);
        PR = precioR(CR);
        PS = precioS(CS);
        dscB = DescuentoB(PB);
        dscR = DescuentoR(PR);
        dscS = DescuentoS(PS);
        total = totalP(dscB, dscR, dscS);
        totalD = descuentoG(total, CC);
        imprimir(PB, PR, PS, dscB, dscR, dscS, total, totalD);
    }

    static short CantidadBrochas() {
        Scanner teclado = new Scanner(System.in);
        short CB;
        System.out.print("Ingrese cantidad de Brochas de cerda: ");
        CB = Short.parseShort(teclado.next());
        return CB;
    }

    static short CantidadRodillos() {
        Scanner teclado = new Scanner(System.in);
        short CR;
        System.out.print("Ingrese cantidad de Rodillos: ");
        CR = Short.parseShort(teclado.next());
        return CR;
    }

    static short CantidadSellador() {
        Scanner teclado = new Scanner(System.in);
        short CS;
        System.out.print("Ingrese cantidad de Sellador: ");
        CS = Short.parseShort(teclado.next());
        return CS;
    }

    public static String ContadoCredito() {
        Scanner teclado = new Scanner(System.in);
        String CC;
        System.out.print("Pagará al contado o crédito (contado/credito): ");
        CC = teclado.next();
        return CC;
    }

    static float precioB(float CB) {
        return (float) (CB * 20);
    }

    static float precioR(float CR) {
        return (float) (CR * 45);
    }

    static float precioS(float CS) {
        return (float) (CS * 10);
    }

    static float DescuentoB(float PB) {
        return (float) (PB - PB * 0.20);
    }

    static float DescuentoR(float PR) {
        return (float) (PR - PR * 0.15);
    }

    static float DescuentoS(float PS) {
        return (float) (PS - PS * 0.05);
    }

    static float totalP(float dscB, float dscR, float dscS) {
        return dscB + dscR + dscS;
    }

    static float descuentoG(float total, String CC) {
        float totalD = 0;
        if (CC.equals("contado")) {
            totalD = (float) (total - total * 0.07);
        }
        return totalD;
    }

    static void imprimir(float PB, float PR, float PS, float dscB, float dscR, float dscS, float total, float totalD) {
        System.out.println("\u001B[31m-------------------Reporte----------------");
        System.out.println("Total de brochas: S/." + PB);
        System.out.println("Total con Descuento de brochas: S/." + dscB);
        System.out.println("Total de rodillos: S/." + PR);
        System.out.println("Total con Descuento de brochas: S/." + dscR);
        System.out.println("Total de sellador: S/." + PS);
        System.out.println("Total con Descuento de brochas: S/." + dscS);
        System.out.println("\u001B[34mTotal a pagar: S/." + total);
        System.out.println("\u001B[34mTotal por pagar al contado dsc 7%: S/." + totalD);
        System.out.println("\u001B[31m------------------------------------------");
    }
}
