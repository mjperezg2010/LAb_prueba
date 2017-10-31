/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Otros;

import Bestia.Bestia;

/**
 *
 * @author mjper
 */
public class Integrante {
    protected String Nombre,Apellido,Altura,fecha;
    protected Bestia beast;

    public Integrante(String Nombre, String Apellido, String Altura, String fecha, Bestia beast) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Altura = Altura;
        this.fecha = fecha;
        this.beast = beast;
    }

    public Integrante() {
    }

    
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getAltura() {
        return Altura;
    }

    public void setAltura(String Altura) {
        this.Altura = Altura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Bestia getBeast() {
        return beast;
    }

    public void setBeast(Bestia beast) {
        this.beast = beast;
    }

    @Override
    public String toString() {
        return "Integrante{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Altura=" + Altura + ", fecha=" + fecha + ", beast=" + beast + '}';
    }
    
    
  
    
}
