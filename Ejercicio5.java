
/*
EJERCICIO 5: Programa que diga si un estudiante está aprobado o no, y su
nota respectiva, basándose en las condiciones:
◼ Está aprobado si sus notas de teoría y de laboratorio (enteros) son
aprobatorias
◼ El promedio que se calcula con los pesos de 75% Teoría y 25%
Laboratorio, en caso sea aprobado, si no la nota final es la mínima de sus
notas. Sin usar método min()

POR: Fiorela Clariza Quispe Quispe
*/

import java.util.*;

public class Ejercicio5 {

    public static void main(String[] args) {
        int notaTeoria, notaLab;
        double promedio; // Variables
        Scanner scan = new Scanner(System.in);
        // Entradas
        System.out.print("Bienvenido(a), ingrese su nota de teoría: ");
        notaTeoria = scan.nextInt();
        System.out.print("Ingrese su nota de laboratorio: ");
        notaLab = scan.nextInt();
        // Calculando el promedio
        promedio = (double) Math.round((notaTeoria * 0.75 + notaLab * 0.25) * 100) / 100;
        // Aplicando condicionales
        if (notaTeoria > 11 && notaLab > 11) {
            System.out.println("Usted esta aprobrado(a) y su promedio es " + promedio);
        } else {
            if (notaTeoria < notaLab) {
                System.out.println("Usted no esta aprobrado(a) y su nota final es " + notaTeoria);
            } else {
                System.out.println("Usted no esta aprobrado(a) y su nota final es " + notaLab);
            }
        }
        scan.close();
    }
}
