
package Otros;

public class Mordor extends Lugar{
    
    private int numGuardianes;

    public Mordor(int numGuardianes) {
        this.numGuardianes = numGuardianes;
    }

    public Mordor(int numGuardianes, int extensionTerrirotial) {
        super(extensionTerrirotial);
        this.numGuardianes = numGuardianes;
    }

    public Mordor() {
    }

    public int getNumGuardianes() {
        return numGuardianes;
    }

    public void setNumGuardianes(int numGuardianes) {
        this.numGuardianes = numGuardianes;
    }

    @Override
    public String toString() {
        return "Mordor{" + "numGuardianes=" + numGuardianes + '}';
    }
    
    
    
}
