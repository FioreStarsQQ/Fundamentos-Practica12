
/*
EJERCICIO 6: Programa que diga si un estudiante está aprobado o no y que
me muestre su nota final (con medio punto a favor del
alumno), basándose en las condiciones:
• En el caso que el laboratorio esté aprobado entonces la nota
final se calcula con la fórmula NF = 0.75*NT+0.25*NL, en
cualquier otro caso se coloca la mínima nota. Sin min()
• NOTA: nota mínima aprobatoria en cualquier caso es 13

POR: Fiorela Clariza Quispe Quispe
*/

import java.util.*;

public class Ejercicio6 {

    public static void main(String[] args) {
        double notaTeoria, notaLab;
        int notaFinal; // Variables
        Scanner scan = new Scanner(System.in);
        // Entradas
        System.out.print("Bienvenido(a), ingrese su nota de teoría: ");
        notaTeoria = scan.nextDouble();
        System.out.print("Ingrese su nota de laboratorio: ");
        notaLab = scan.nextDouble();
        // Aplicando condicionales
        if (notaLab >= 13) {
            // Calculando la nota final
            notaFinal = (int) Math.round(notaTeoria * 0.75 + notaLab * 0.25);
            System.out.println("Usted esta aprobrado(a) en Laboratorio por lo tanto su nota final es " + notaFinal);
        } else {
            if (notaTeoria < notaLab) {
                notaFinal = (int) Math.round(notaTeoria);
                System.out.println("Usted no esta aprobrado(a) y su nota final es " + notaFinal);
            } else {
                notaFinal = (int) Math.round(notaLab);
                System.out.println("Usted no esta aprobrado(a) y su nota final es " + notaFinal);
            }
        }
        scan.close();
    }
}
