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
public class CompositionPrestamo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Prestamo prestamo1 = new Prestamo ("60 meses", 5000 , 11.95);
        Prestamo prestamo2 = new Prestamo ("48 meses", 35000, 6);
        PersonaPrestamo p = new PersonaPrestamo("Pepe Perez Pereira" , 23 , "Estudiante");
        p.setPrestamo(prestamo1);
        EmpresaPrestamo e = new EmpresaPrestamo();
        e.setCif("A50356");
        e.setPrestamo(prestamo2);
        
        
        System.out.println("Prestamo personal:" + p.getNombre());
        System.out.println("Valor del Prestamo: " + p.getPrestamo().getVlrPrestamo());
        System.out.println("Intereses: " + p.getPrestamo().getIntereses() + "%" );
        System.out.println("-----------------------------");
        System.out.println("Prestamo empresarial: " + e.getCif());
        System.out.println("Valor del Prestamo: " + e.getPrestamo().getVlrPrestamo());
        System.out.println("Intereses: " + e.getPrestamo().getIntereses() + "%" );
    }
    
}
