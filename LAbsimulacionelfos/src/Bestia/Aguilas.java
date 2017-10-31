
package Bestia;

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
