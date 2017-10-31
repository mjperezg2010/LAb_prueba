/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pueblos;

import Bestia.Bestia;

/**
 *
 * @author mjper
 */
public class Enanos extends Pueblo {
    private Enanos enano;

    public Enanos() {
        super();
    }

    public Enanos(Enanos enano, int ataque, int defensa, int curacion) {
        super(300, 200, 50);
        this.enano = enano;
    }

    public Enanos getEnano() {
        return enano;
    }

    public void setEnano(Enanos enano) {
        this.enano = enano;
    }

    @Override
    public String toString() {
        return "Enanos{" + "enano=" + enano + '}';
    }
    
    

   
    
    
    
    
}
