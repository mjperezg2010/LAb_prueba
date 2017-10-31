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
    private int longitudala;

    public Dragones() {
        super();
    }

    public Dragones(int longitudala, int garras, boolean veneno) {
        super(garras, veneno);
        this.longitudala = longitudala;
    }

    public int getLongitudala() {
        return longitudala;
    }

    public void setLongitudala(int longitudala) {
        this.longitudala = longitudala;
    }

    @Override
    public String toString() {
        return "Dragones{" + "longitudala=" + longitudala + '}';
    }
    
    
    
    
    
    
    
}
