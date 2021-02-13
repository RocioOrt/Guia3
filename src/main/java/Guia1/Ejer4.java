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
public class Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Inicio de programa");
        System.out.println("Introducir dos numeros enteros por favor: ");
        
        int numero1;
        int numero2;
        int resultado;
        Scanner entradaescaner = new Scanner (System.in);
        
        numero1 = entradaescaner.nextInt();
        numero2 = entradaescaner.nextInt();
        resultado = numero1 + numero2;
        System.out.println("La sumatoria de los dos numeros ingresados por teclado es: " + resultado);
        // TODO code application logic here
    }
    
}
