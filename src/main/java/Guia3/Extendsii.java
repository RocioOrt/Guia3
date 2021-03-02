/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3;

/**
 *
 * @author Rocio
 */
public class Extendsii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ave ave = new Ave("Piolin", "Alpiste", 2, "Canarion Amarillo");
        Tortuga tortuga = new Tortuga ("Flash","Vegetariana", 3, "Tortuga Mora");
        Roedor roedor = new Roedor ("Furret", "Especial" , 1, "Huron");
        
        System.out.println("--------------------------------");
        ave.mostrar();
        System.out.println("--------------------------------");
        tortuga.mostrar();
        System.out.println("--------------------------------");
        roedor.mostrar();
        System.out.println("--------------------------------");
        // TODO code application logic here
    }
    
}
