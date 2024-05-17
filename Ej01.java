package Ejercicios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ej01 {

    public static void main(String[] args) {
        float CM3, total, imp, totalM;
        CM3 = ConsumoM3();
        total = Monto(CM3);
        imp = Impuesto(total);
        totalM = Pagar(total, imp);
        imprimir(total, imp, totalM);
    }

    static float ConsumoM3() {
        Scanner teclado = new Scanner(System.in);
        float CM3;
        System.out.print("Ingrese consumo en metros cúbicos: ");
        CM3 = Float.parseFloat(teclado.next());
        return CM3;
    }

    static float Monto(float CM3) {
        float total;
        if (CM3 < 100) {
            total = (float) (CM3 * 0.15);
        } else if (CM3 >= 100 & CM3 <= 499) {
            total = (float) (CM3 * 0.20);
        } else if (CM3 >= 500 & CM3 <= 1000) {
            total = (float) (CM3 * 0.35);
        } else {
            total = (float) (CM3 * 0.80);
        }
        return total;
    }

    static float Impuesto(float total) {
        float imp = 0;
        if (total > 600) {
            imp = (float) (total * 0.025);
        }
        return imp;
    }

    static float Pagar(float total, float imp) {
        return total + imp;
    }

    static void imprimir(float total, float imp, float totalM) {
        DecimalFormat formato1 = new DecimalFormat("#.00");
        System.out.println("\u001B[31m-------------------Reporte----------------");
        System.out.println("\u001B[34mMonto a pagar: " + formato1.format(total));
        System.out.println("\u001B[34mEl impuesto es: " + formato1.format(imp));
        System.out.println("\u001B[34mTotal: " + formato1.format(totalM));
        System.out.println("\u001B[31m------------------------------------------");
    }
}
