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
public class EmpresaPrestamo {
    private String cif;
    private Prestamo prestamo;
    
    public Prestamo getPrestamo()
    {
        return prestamo;
    }
    public void setPrestamo(Prestamo prestamo)
    {
        this.prestamo = prestamo;
    }
    public String getCif()
    {
        return cif;
    }
    public void setCif(String cif)
    {
        this.cif = cif;
    }
    
}
