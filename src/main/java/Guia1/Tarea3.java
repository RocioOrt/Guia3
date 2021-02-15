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
public class Tarea3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Perimetro de un triangulo");
        System.out.println("Ingrese el valor de los tres lados del triangulo: ");
        double lado1 ;
        double lado2;
        double lado3;
        double perimetro;
        Scanner entradaEscaner  = new Scanner (System.in);
        lado1 = entradaEscaner.nextDouble();
        lado2 = entradaEscaner.nextDouble();
        lado3 = entradaEscaner.nextDouble();
        perimetro =(lado1 + lado2 + lado3) ;
        System.out.println("El perimetro del triangulo es " + perimetro );
        // TODO code application logic here
    }
    
}
