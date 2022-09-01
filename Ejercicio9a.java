
/*
EJERCICIO 9a, IF-ELSE: Calcular la utilidad que un trabajador recibe en el reparto
anual de utilidades, el cual se le asigna como un porcentaje
de su salario mensual que depende de su antigüedad en la
empresa de acuerdo con la sig. tabla: (2 ver. if-else if y switch-case)
Tiempo Utilidad
• Menos de 1 año 5 % del salario
• 1 año o más y menos de 2 años 7% del salario
• 2 años o más y menos de 5 años 10% del salario
• 5 años o más y menos de 10 años 15% del salario
• 10 años o más 20% del salario
POR: Fiorela Clariza Quispe Quispe
*/

import java.util.*;

public class Ejercicio9a {

    public static void main(String[] args) {
        double salario, años, meses, tiempo, utilidadAsignada; // Variables
        Scanner scan = new Scanner(System.in);
        // Entradas
        System.out.print("Bienvenido(a), ingrese el valor del salario actual que usted recibe: ");
        salario = scan.nextDouble();
        System.out.print("Ingrese los años que se encuentra laborando en la empresa: ");
        años = scan.nextDouble();
        System.out.print("Ingrese los meses que se encuentra laborando en la empresa: ");
        meses = scan.nextDouble();
        tiempo = (double) Math.round((años + meses/12)*10)/10;
        // Aplicando condicionales
        if (tiempo < 1) {
            utilidadAsignada = salario * 0.05;
            System.out.println("Debido al tiempo de servicio (" + tiempo
                    + " años) a usted se le asignó como utilidad el 5% de su salario, siendo el resultado "
                    + String.format("%.2f", utilidadAsignada) + " soles.");
        } else {
            if (tiempo < 2) {
                utilidadAsignada = salario * 0.07;
                System.out.println("Debido al tiempo de servicio (" + tiempo
                        + " años) a usted se le asignó como utilidad el 7% de su salario, siendo el resultado "
                        + String.format("%.2f", utilidadAsignada) + " soles.");
            } else {
                if (tiempo < 5) {
                    utilidadAsignada = salario * 0.1;
                    System.out.println("Debido al tiempo de servicio (" + tiempo
                            + " años) a usted se le asignó como utilidad el 10% de su salario, siendo el resultado "
                            + String.format("%.2f", utilidadAsignada) + " soles.");
                } else {
                    if (tiempo < 10) {
                        utilidadAsignada = salario * 0.15;
                        System.out.println("Debido al tiempo de servicio (" + tiempo
                                + " años) a usted se le asignó como utilidad el 15% de su salario, siendo el resultado "
                                + String.format("%.2f", utilidadAsignada) + " soles.");
                    } else {
                        utilidadAsignada = salario * 0.20;
                        System.out.println("Debido al tiempo de servicio (" + tiempo
                                + " años) a usted se le asignó como utilidad el 20% de su salario, siendo el resultado "
                                + String.format("%.2f", utilidadAsignada) + " soles.");
                    }
                }
            }
        }
        scan.close();
    }
}