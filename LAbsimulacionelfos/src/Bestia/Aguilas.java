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
public class Aguilas extends Bestia{
    private String colorplumaje;

    public Aguilas() {
    }

    public Aguilas(String colorplumaje, int garras, boolean veneno) {
        super(garras, veneno);
        this.colorplumaje = colorplumaje;
    }

    public String getColorplumaje() {
        return colorplumaje;
    }

    public void setColorplumaje(String colorplumaje) {
        this.colorplumaje = colorplumaje;
    }
    
    
    
}
