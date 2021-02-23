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
public class ExecFac {
    
    public static void main(String[] args){
        Factura pedido1 = new Factura();
        String desc1;
        pedido1.establecerDescpieza("taladro black and decker de medio caballo de potencia para banco");
        desc1 = pedido1.obtenerDescpieza();
        System.out.println("La descripcion de la pieza es: " + desc1);
        
        int Qty1;
        pedido1.establecerQtyarticulo(126);
        Qty1 = pedido1.obtenerQtyarticulo();
        System.out.println("La cantidad de piezas disponibles es: " + Qty1);
        
        String Numdepieza1;
        pedido1.EstablecerNumdepieza("TBD16554");
        Numdepieza1 = pedido1.ObtenerNumdepieza();
        System.out.println("El numero de la pieza es: " + Numdepieza1);
        
        double Vlr1;
        pedido1.establecerVlrarticulo(39.95);
        Vlr1 = pedido1.obtenerVlrarticulo();
        System.out.println("El precio del articulo es: " + Vlr1);
       
    }

}
