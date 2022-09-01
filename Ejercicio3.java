
/*
EJERCICIO 3: Dados 2 enteros, deseo conocer todos los posibles
operadores relacionales y de igualdad válidos

POR: Fiorela Clariza Quispe Quispe
*/

import java.util.*;

public class Ejercicio3 {

    public static void main(String[] args) {
        int num1, num2; // Variables
        Scanner scan = new Scanner(System.in);
        // Entradas
        System.out.print("Bienvenido(a), a continuación ingrese un número: ");
        num1 = scan.nextInt();
        System.out.print("Ingrese otro número: ");
        num2 = scan.nextInt();
        // Salidas
        System.out.println("Operadores relacionales:");
        // Aplicando condicional
        if (num1 == num2) {
            System.out.println(num1 + " == " + num2);
            System.out.println(num1 + " >= " + num2);
            System.out.println(num2 + " <= " + num1);
        } else {
            if (num1 > num2) {
                System.out.println(num1 + " > " + num2);
                System.out.println(num1 + " != " + num2);
            } else {
                System.out.println(num2 + " < " + num1);
                System.out.println(num2 + " != " + num1);
            }
        }
        scan.close();
    }
}
