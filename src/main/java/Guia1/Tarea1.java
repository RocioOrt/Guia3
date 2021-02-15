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
public class Tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Valores al cuadrado");
        System.out.println("Ingrese un numero para sacar su valor al cuadrado");
        int numero ;
        int cuadrado;
        Scanner entradaEscaner  = new Scanner (System.in);
        numero = entradaEscaner.nextInt();
        cuadrado = numero * numero;
        System.out.println("El cuadrado de " + numero + " es " + cuadrado );
        // TODO code application logic here
    }
    
}
