
/*
EJERCICIO 7: Leer 2 números; si son iguales que los multiplique, si el
primero es mayor que el segundo que los reste y si no que los
sume. Mostrar el resultado

POR: Fiorela Clariza Quispe Quispe
*/

import java.util.*;

public class Ejercicio7 {

    public static void main(String[] args) {
        double num1, num2, resultado; // Variables
        Scanner scan = new Scanner(System.in);
        // Entradas
        System.out.print("Bienvenido(a), ingrese el primer número: ");
        num1 = scan.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        num2 = scan.nextDouble();
        // Aplicando condicionales
        if (num1 == num2) {
            resultado = (double) Math.round(num1 * num2 * 100) / 100;
            System.out.println("El resultado de la operación asignada (multiplicación) es: " + resultado);
        } else {
            if (num1 > num2) {
                resultado = (double) Math.round((num1 - num2) * 100) / 100;
                System.out.println("El resultado de la operación asignada (resta) es: " + resultado);
            } else {
                resultado = (double) Math.round((num1 + num2) * 100) / 100;
                System.out.println("El resultado de la operación asignada (suma) es: " + resultado);
            }
        }
        scan.close();
    }
}