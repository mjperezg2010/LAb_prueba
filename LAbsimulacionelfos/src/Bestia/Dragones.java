/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bestia;

/**
 *
 * @author mjper
 */
public class Dragones extends Bestia{
    private String longitudala;

    public Dragones() {
        super();
    }

    public Dragones(String longitudala, int garras, boolean veneno) {
        super(garras, veneno);
        this.longitudala = longitudala;
    }

    public String getLongitudala() {
        return longitudala;
    }

    public void setLongitudala(String longitudala) {
        this.longitudala = longitudala;
    }

    @Override
    public String toString() {
        return "Dragones{" + "longitudala=" + longitudala + '}';
    }
    
    
    
    
    
    
    
}
