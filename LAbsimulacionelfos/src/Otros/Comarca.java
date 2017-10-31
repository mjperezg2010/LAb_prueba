
package Otros;

public class Comarca extends Lugar{
    //100 en cada poer a los Hobbits
    private int numeroCasas;

    public Comarca(int numeroCasas) {
        this.numeroCasas = numeroCasas;
    }

    public Comarca(int numeroCasas, int extensionTerrirotial) {
        super(extensionTerrirotial);
        this.numeroCasas = numeroCasas;
    }

    public Comarca() {
    }

    public int getNumeroCasas() {
        return numeroCasas;
    }

    public void setNumeroCasas(int numeroCasas) {
        this.numeroCasas = numeroCasas;
    }

    @Override
    public String toString() {
        return "Comarca{" + "numeroCasas=" + numeroCasas + '}';
    }
    
    
}
