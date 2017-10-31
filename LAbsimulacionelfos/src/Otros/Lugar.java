
package Otros;

import java.util.ArrayList;

public class Lugar {
    
    protected int extensionTerrirotial;
    protected ArrayList<Integrante> listaIntegrantes = new ArrayList();

    public Lugar() {
    }

    public Lugar(int extensionTerrirotial) {
        this.extensionTerrirotial = extensionTerrirotial;
    }

    public int getExtensionTerrirotial() {
        return extensionTerrirotial;
    }

    public ArrayList<Integrante> getListaIntegrantes() {
        return listaIntegrantes;
    }

    public void setExtensionTerrirotial(int extensionTerrirotial) {
        this.extensionTerrirotial = extensionTerrirotial;
    }

    public void setListaIntegrantes(ArrayList<Integrante> listaIntegrantes) {
        this.listaIntegrantes = listaIntegrantes;
    }

    @Override
    public String toString() {
        return "Lugar{" + "extensionTerrirotial=" + extensionTerrirotial + ", listaIntegrantes=" + listaIntegrantes + '}';
    }
    
    
    
}
