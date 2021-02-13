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
public class Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Inicio de aplicacion");
        System.out.println("Introducir una cadena de texto: ");
        
        String entradateclado = "";
        
        Scanner entradaEscaner = new Scanner (System.in);
        
        entradateclado = entradaEscaner.nextLine();
        
        System.out.println("Lo que escribio por teclado es \"" + entradateclado + "\"");
        
        
       
    }
    
}
