
package Otros;

public class Gondor extends Lugar{
    
    private int numParajesSecretos;

    public Gondor(int numParajesSecretos) {
        this.numParajesSecretos = numParajesSecretos;
    }

    public Gondor(int numParajesSecretos, int extensionTerrirotial) {
        super(extensionTerrirotial);
        this.numParajesSecretos = numParajesSecretos;
    }

    public Gondor() {
    }

    public int getNumParajesSecretos() {
        return numParajesSecretos;
    }

    public void setNumParajesSecretos(int numParajesSecretos) {
        this.numParajesSecretos = numParajesSecretos;
    }

    @Override
    public String toString() {
        return "Gondor{" + "numParajesSecretos=" + numParajesSecretos + '}';
    }
    
    
    
}
