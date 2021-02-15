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
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Area de un triangulo");
        float base ;
        float altura;
        float area;
        Scanner entradaEscaner  = new Scanner (System.in);
        System.out.println("Ingrese el valor de la base del triangulo: ");
        base = entradaEscaner.nextFloat();
        System.out.println("Ingrese el valor de la altura del triangulo: ");
        altura = entradaEscaner.nextFloat();
        area = (base * altura) / 2;
        System.out.println("El area del triangulo es " + area + " Cm^2");
        // TODO code application logic here
    }
    
}
