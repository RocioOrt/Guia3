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
public class Tarea4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Promedio de notas");
        System.out.println("Ingrese las 3 notas cuyo promedio desee conocer: ");
        float nota1;
        float nota2;
        float nota3;
        float promedio;
        Scanner entrada = new Scanner (System.in);
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();
        promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("El promedio de las notas es: " + promedio);
        
        // TODO code application logic here
    }
    
}
