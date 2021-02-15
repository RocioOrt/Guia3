/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia1;

import java.util.Scanner;

/**
 *
 * @author Rocio
 */
public class Tarea5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Conversion de Dolares a Euros");
        System.out.println("Ingrese su valor en dolares:");
        double dolares ;
        double euros ;
        Scanner entradaEscaner  = new Scanner (System.in);
        dolares = entradaEscaner.nextDouble();
        euros = (dolares * 0.82) ;
        System.out.println("La cantidad de " + dolares + " dolares en euros es " + euros + " euros.");
        // TODO code application logic here
    }
    
}
