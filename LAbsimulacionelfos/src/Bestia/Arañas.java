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
public class Arañas extends Bestia{
    private String sexo;

    public Arañas(String sexo, int garras, boolean veneno) {
        super(garras, veneno);
        this.sexo = sexo;
    }

    public Arañas() {
        super();
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Arañas{" + "sexo=" + sexo + '}';
    }
    
    
    
    
    
    
    
}
