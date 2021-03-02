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
public class Prestamo {
    
    private String plazo;
    private double VlrPrestamo;
    private double intereses;
    
    public String getPlazo ()
    {
        return plazo;
    }
    public void setPlazo(String plazo)
    {
        this.plazo = plazo;
    }
    public double getVlrPrestamo()
    {
        return VlrPrestamo;
    }
    public void setVlrPrestamo(double VlrPrestamo)
    {
        this.VlrPrestamo = VlrPrestamo;
    }
    public double getIntereses()
    {
        return intereses;
    }
    public Prestamo(String plazo, double VlrPrestamo, double intereses)
    {
        super();
        this.VlrPrestamo = VlrPrestamo;
        this.plazo = plazo;
        this.intereses = intereses;
    }
}
