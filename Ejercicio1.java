
/*
EJERCICIO 1: Determinar si un alumno aprueba o no un curso, sabiendo
que aprobará si su promedio calculado en base a tres
calificaciones es mayor o igual a 13; reprueba en caso
contrario. Notas decimales

POR: Fiorela Clariza Quispe Quispe
*/

import java.util.*;

public class Ejercicio1 {

    public static void main(String[] args) {
        double nota1, nota2, nota3, promedio; // Variables
        Scanner scan = new Scanner(System.in);
        // Entradas
        System.out.print("Bienvenido(a), a continuación ingrese su primera calificación: ");
        nota1 = scan.nextDouble();
        System.out.print("Ingrese su segunda calificación: ");
        nota2 = scan.nextDouble();
        System.out.print("Ingrese su tercera calificación: ");
        nota3 = scan.nextDouble();
        // Calculo y redondeo del promedio
        promedio = (double) Math.floor(((nota1 + nota2 + nota3) / 3) * 100) / 100;
        // Aplicando condicional al promedio obtenido
        if (promedio >= 13) {
            System.out.println("Usted ha aprobado el curso.");
        } else {
            System.out.println("Usted ha desaprobado el curso.");
        }
        System.out.println("Su calificación final fue: " + promedio);
        scan.close();
    }
}
