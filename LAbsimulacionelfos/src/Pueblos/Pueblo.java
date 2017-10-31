/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pueblos;

import Bestia.Bestia;
import Otros.Integrante;
import java.util.ArrayList;

/**
 *
 * @author mjper
 */
public class Pueblo {
    public ArrayList <Integrante> listintegrante = new ArrayList();
    
    protected int ataque,defensa,curacion;

    public Pueblo(int ataque, int defensa, int curacion) {
        
        this.ataque = ataque;
        this.defensa = defensa;
        this.curacion = curacion;
    }

    public Pueblo() {
    }

    public ArrayList<Integrante> getListintegrante() {
        return listintegrante;
    }

    public void setListintegrante(ArrayList<Integrante> listintegrante) {
        this.listintegrante = listintegrante;
    }

    

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getCuracion() {
        return curacion;
    }

    public void setCuracion(int curacion) {
        this.curacion = curacion;
    }

    @Override
    public String toString() {
        return "Pueblo{" + "listintegrante=" + listintegrante +  ", ataque=" + ataque + ", defensa=" + defensa + ", curacion=" + curacion + '}';
    }
    
    
    
    
    
}
