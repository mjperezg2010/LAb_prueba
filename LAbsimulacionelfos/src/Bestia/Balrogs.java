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
public class Balrogs extends Bestia{
    private boolean latigo;

    public Balrogs() {
    }

    public Balrogs(boolean latigo, int garras, boolean veneno) {
        super(garras, veneno);
        this.latigo = latigo;
    }
    
    

    public boolean isLatigo() {
        return latigo;
    }

    public void setLatigo(boolean latigo) {
        this.latigo = latigo;
    }

    @Override
    public String toString() {
        return "Balrogs{" + "latigo=" + latigo + '}';
    }
    
    
    
}
