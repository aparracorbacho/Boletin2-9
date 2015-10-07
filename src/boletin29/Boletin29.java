/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

import java.util.Scanner;

/**
 *
 * @author aparracorbacho
 */
public class Boletin29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float billetes100, billetes20, billetes5;
        System.out.println("Introduce el numero de billetes de 100");
        Scanner billetes100Teclado = new Scanner(System.in);
        billetes100 = billetes100Teclado.nextFloat();
        System.out.println("Introduce el numero de billetes de 20");
        Scanner billetes20Teclado = new Scanner(System.in);
        billetes20 = billetes20Teclado.nextFloat();
        System.out.println("Introduce el numero de billetes de 5");
        Scanner billetes5Teclado = new Scanner(System.in);
        billetes5 = billetes5Teclado.nextFloat();
        System.out.println("El numero de euros es: "+ ((billetes100*100)+(billetes20*20)+(billetes5*5)));
    }
    
}
