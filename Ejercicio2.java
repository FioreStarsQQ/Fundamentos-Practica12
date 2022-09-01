
/*
EJERCICIO 2: Un programa que lea dos números enteros y los imprima en
forma ascendente. Sin usar métodos de la clase Math.

POR: Fiorela Clariza Quispe Quispe
*/

import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner scan = new Scanner(System.in);
        // Entradas
        System.out.print(" Bienvenido(a), a continuación ingrese un número: ");
        num1 = scan.nextInt();
        System.out.print("Ingrese otro número: ");
        num2 = scan.nextInt();
        System.out.print("Ingrese otro número: ");
        num3 = scan.nextInt();
        // Aplicando condicional

        // if (num1 > num2) {
        // if (num1 > num3) {
        // if (num2 > num3) {
        // System.out.println(num3 + " < " + num2 + " < " + num1);
        // } else {
        // System.out.println(num2 + " < " + num3 + " < " + num1);
        // }
        // } else { // num3 > num1
        // if (num2 > num1) {
        // System.out.println(num1 + " < " + num2 + " < " + num3);
        // } else {
        // System.out.println(num2 + " < " + num1 + " < " + num3);
        // }
        // }
        // } else {
        // if (num2 > num3) {
        // if (num3 > num1) {
        // System.out.println(num1 + " < " + num3 + " < " + num2);
        // } else {
        // System.out.println(num3 + " < " + num1 + " < " + num2);
        // }
        // } else { // num3 > num2
        // if (num2 > num1) {
        // System.out.println(num1 + " < " + num2 + " < " + num3);
        // } else {
        // System.out.println(num2 + " < " + num1 + " < " + num3);
        // }
        // }
        // }

        if (num1 >= num2 && num2 >= num3) {
            System.out.println("Este es el ordenamiento: " + num3 + ", " + num2 + " y " +
                    num1);
        } else {
            if (num2 >= num1 && num1 >= num3) {
                System.out.println("Este es el ordenamiento: " + num3 + ", " + num1 + " y " +
                        num2);
            } else {
                if (num1 >= num3 && num3 >= num2) {
                    System.out.println("Este es el ordenamiento: " + num2 + ", " + num3 + " y " +
                            num1);
                } else {
                    if (num3 >= num1 && num1 >= num2) {
                        System.out.println("Este es el ordenamiento: " + num2 + ", " + num1 + " y " +
                                num3);
                    } else {
                        if (num3 >= num2 && num2 >= num1) {
                            System.out.println("Este es el ordenamiento: " + num1 + ", " + num2 + " y " +
                                    num3);
                        } else {
                            System.out.println("Este es el ordenamiento: " + num1 + ", " + num3 + " y " +
                                    num2);
                        }
                    }
                }
            }
        }
        scan.close();
    }
}
