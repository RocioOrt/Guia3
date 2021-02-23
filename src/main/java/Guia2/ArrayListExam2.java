/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2;

import java.util.ArrayList;

/**
 *
 * @author Rocio
 */
public class ArrayListExam2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> Meses = new ArrayList <>();
        
        Meses.add("Enero");
        Meses.add("Febrero");
        Meses.add("Marzo");
        Meses.add("Abril");
        Meses.add("Mayo");
        Meses.add("Junio");
        Meses.add("Julio");
        Meses.add("Agosto");
        Meses.add("Septiembre");
        Meses.add("Octubre");
        Meses.add("Noviembre");
        Meses.add("Diciembre");
        
        System.out.println("Los meses del año son: " + Meses);
        
        ArrayList<String> Vehiculos  = new ArrayList <>();
        
        Vehiculos.add("Honda");
        Vehiculos.add("Toyota");
        Vehiculos.add("Lamborg");
        Vehiculos.add("Mercedes-Benz");
        Vehiculos.add("Ford");
        Vehiculos.add("Porche");
        Vehiculos.add("Ferrari");
        Vehiculos.add("Lamborghini");
        
        System.out.println("Las marcas de vehiculos son: " + Vehiculos);
        
        ArrayList<String> Ropa  = new ArrayList <>();
        
        Ropa.add("Zara");
        Ropa.add("Forever 21");
        Ropa.add("Fendy");
        Ropa.add("Adidas");
        Ropa.add("Gucci");
        Ropa.add("Versace");
        Ropa.add("Chanel");
        Ropa.add("Prada");
        
        System.out.println("Las marcas de Ropa son: " + Ropa);
        
        ArrayList<String> Pasatiempos = new ArrayList<>();
        
        Pasatiempos.add("Leer");
        Pasatiempos.add("Ver videos");
        Pasatiempos.add("Jugar Videojuegos");
        Pasatiempos.add("Dibujar");
        Pasatiempos.add("Resolver juegos de logica");
        
        System.out.println("Mis pasatiempos favoritos son: " + Pasatiempos );
        
    }
    
}
