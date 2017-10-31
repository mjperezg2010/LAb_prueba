/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bestia;
import java.util.Random;

/**
 *
 * @author mjper
 */
public class Bestia {
    private int garras, nivelvida;
    private boolean veneno;
    static Random ra= new Random();

    public Bestia(int garras, boolean veneno) {
        this.garras = garras;
        this.veneno = veneno;
        this.nivelvida=50+ra.nextInt(151);
    }

    public Bestia() {
    }

    public int getGarras() {
        return garras;
    }

    public void setGarras(int garras) {
        this.garras = garras;
    }

    public int getNivelvida() {
        return nivelvida;
    }

    public void setNivelvida(int nivelvida) {
        this.nivelvida = nivelvida;
    }

    public boolean getVeneno() {
        return veneno;
    }

    public void setVeneno(boolean veneno) {
        this.veneno = veneno;
    }

    @Override
    public String toString() {
        return "Bestia{" + "garras=" + garras + ", nivelvida=" + nivelvida + ", veneno=" + veneno + '}';
    }
    
    
    
    
    
    
    
    
    
}
