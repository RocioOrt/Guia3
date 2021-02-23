/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2;

import java.util.HashMap;

/**
 *
 * @author Rocio
 */
public class HashMapExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<Integer, String> m = new HashMap<>();
        
        m.put(924, "Amalia Nunez");
        m.put(921, "Cindy Nero");
        m.put(700, "Cesar Vasquez");
        m.put(219, "Victor Tilla");
        m.put(537, "Alan Brito");
        m.put(605, "Esteban Quito");
               
        System.out.println("Los elementos de m son: \n" + m);
        // TODO code application logic here
    }
    
}
