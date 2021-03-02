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
public class Roedor extends Mascota{
    public String clase;
    
    public Roedor(String nombre, String tipo_alimentacion, int edad, String clase){
        super(nombre, tipo_alimentacion , edad);
        this.clase = clase;
    }
    public String getClase(){
        return clase;
    }
    public void setClase(String clase){
        this.clase = clase;
    }
    public void mostrar(){
        System.out.println(getNombre() + "-" + getTipo_alimentacion() + "-" + getEdad() + "-" + getClase());
    }
    
}
