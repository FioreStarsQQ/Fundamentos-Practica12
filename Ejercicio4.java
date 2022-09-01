
/*
EJERCICIO 4: Un hombre desea consultar cuánto dinero se generará por
concepto de interés anual sobre el capital que piensa invertir
en el banco. Además, el programa le dirá si debe invertir o no,
considerando que se decidirá invertir cuando los intereses
excedan a $200 al año, y en ese caso desea saber cuánto
dinero tendrá al acabar el año de inversión en su cuenta. La
tasa de interés es anual

POR: Fiorela Clariza Quispe Quispe
*/

import java.util.*;

public class Ejercicio4 {

    public static void main(String[] args) {
        double capital, tasaInteres, interes, monto; // Variables
        Scanner scan = new Scanner(System.in);
        // Entradas
        System.out.print("Bienvenido(a), ingrese el capital a invertir: ");
        capital = scan.nextDouble();
        System.out.print("Ingrese la tasa de interés anual: ");
        tasaInteres = scan.nextDouble();
        // Calculando el interes
        interes = (double) Math.round((capital * (tasaInteres / 100)) * 100) / 100;
        monto = (double) Math.round((capital + interes) * 100) / 100;
        // Aplicando condicional
        if (interes > 200) {
            System.out.println("Usted debe invertir ya que genera un interés mayor a 200 dólares, siendo este "
                    + interes + " dólares.");
            System.out.println(
                    "El dinero que tendrá en su cuenta al acabar el año de inversión será: " + monto + " dólares.");
        } else {
            System.out.println("Usted no debe invertir ya que el interés es menor a 200 dólares, siendo este " + interes
                    + " dólares.");
        }
        scan.close();
    }
}
