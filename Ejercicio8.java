
/*
EJERCICIO 8: Leer cuatro números e imprimir el número mayor de los
cuatro. Sin usar Math.max()
POR: Fiorela Clariza Quispe Quispe
*/

import java.util.*;

public class Ejercicio8 {

    public static void main(String[] args) {
        double num1, num2, num3, num4; // Variables
        Scanner scan = new Scanner(System.in);
        // Entradas
        System.out.print("Bienvenido(a), ingrese el primer número: ");
        num1 = scan.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        num2 = scan.nextDouble();
        System.out.print("Ingrese el tercer número: ");
        num3 = scan.nextDouble();
        System.out.print("Ingrese el cuarto número: ");
        num4 = scan.nextDouble();
        // Aplicando condicionales
        if (num1 > num2 && num1 > num3 && num1 > num4) {
            System.out.println("El más grande de los ingresados es: " + num1);
        } else {
            if (num2 > num1 && num2 > num3 && num2 > num4) {
                System.out.println("El más grande de los ingresados es: " + num2);
            } else {
                if (num3 > num1 && num3 > num2 && num3 > num4) {
                    System.out.println("El más grande de los ingresados es: " + num3);
                } else {
                    System.out.println("El más grande de los ingresados es: " + num4);
                }
            }
        }
        scan.close();
    }
}