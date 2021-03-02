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
public class PersonaPrestamo {
    private String nombre;
    private int edad;
    private String trabajo;
    
    private Prestamo prestamo;
    
    public PersonaPrestamo(String nombre, int edad, String trabajo)
    {
        super();
        this.nombre = nombre;
        this.edad = edad;
        this.trabajo = trabajo;
    }
    public Prestamo getPrestamo(){
        return prestamo;
    }
    public void setPrestamo(Prestamo prestamo){
        this.prestamo = prestamo;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getTrabajo(){
        return trabajo;
    }
    public void setTrabajo (String trabajo){
        this.trabajo = trabajo;
    }
}
