/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2;

import java.util.HashSet;

/**
 *
 * @author Rocio
 */
public class HashSetExam2 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet<String> Dias = new HashSet <>();
        
        Dias.add("Lunes");
        Dias.add("Martes");
        Dias.add("Miercoles");
        Dias.add("Jueves");
        Dias.add("Viernes");
        Dias.add("Sabado");
        Dias.add("Domingo");
        
        Dias.add("Jueves");
        Dias.add("Domingo");
        
        System.out.println("Los dias de la semana son: \n" + Dias );
        
        HashSet<String> Hobbies = new HashSet <>();
        
        Hobbies.add("Pintar");
        Hobbies.add("Dibujar");
        Hobbies.add("Ver series");
        Hobbies.add("Leer");
        Hobbies.add("Jugar videojuegos");
        Hobbies.add("Resolver puzzles");
        Hobbies.add("Tomar siesta");
        Hobbies.add("Escuchar musica")
        
        Hobbies.add("Dibujar");
        Hobbies.add("Leer");
        
        System.out.println("Algunos hobbies son: \n" + Hobbies);
        
        HashSet<String> Ingredientes = new HashSet<>();
        
        Ingredientes.add("Harina");
        Ingredientes.add("Huevos");
        Ingredientes.add("Mantequilla");
        Ingredientes.add("Cacao en polvo");
        Ingredientes.add("Chocolate de cocina");
        Ingredientes.add("Polvo para hornear");
        Ingredientes.add("Aceite");
        Ingredientes.add("Bicarbonato de sodio");
        Ingredientes.add("Agua");
        Ingredientes.add("Vainilla");
        Ingredientes.add("Azucar");
        Ingredientes.add("Sal");
        
        Ingredientes.add("Huevos");
        Ingredientes.add("Agua");
        Ingredientes.add("Mantequilla");
        Ingredientes.add("Aceite");
        
        System.out.println("Algunos ingredientes para hacer un pastel de chocolate son: \n" + Ingredientes);
        
    }
    
}
