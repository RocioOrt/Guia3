/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia1;

/**
 *
 * @author Rocio
 */
public class Factura {
    
    private String Numdepieza;
    private String descPieza;
    private int cantArticulo;
    private double precioArticulo;
    
    public void EstablecerNumdepieza ( String pNumdepieza)
    {
        Numdepieza = pNumdepieza;
    }
    public String ObtenerNumdepieza()
    {
        return Numdepieza;
    }
    public void establecerDescpieza ( String pDescpieza )
    {
        descPieza = pDescpieza;
    }
    public String obtenerDescpieza()
    {
        return descPieza;
    }
    public void establecerQtyarticulo ( int pQtyarticulo)
    {
        cantArticulo = pQtyarticulo;
    }
    public int obtenerQtyarticulo()
    {
        return cantArticulo;
    }
    public void establecerVlrarticulo (double pVlrarticulo)
    {
        precioArticulo  = pVlrarticulo;
    }
    public double obtenerVlrarticulo()
    {
        return precioArticulo;
    }
    
    
}
