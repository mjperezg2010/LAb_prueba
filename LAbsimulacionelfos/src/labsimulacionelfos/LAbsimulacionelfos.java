package labsimulacionelfos;

import Bestia.Bestia;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LAbsimulacionelfos {
    
    static ArrayList <Bestia> listbestias= new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int res = 0;
        JOptionPane.showMessageDialog(null, "Bienvenido al pueblo pelapijas y simulacion gay");
        do {
            switch (menuprincipal()) {
                case 1:
                    Agregar();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;

            }//Fin switch de la puta madre
            res=JOptionPane.showConfirmDialog(null, "¿Desea salir?","Confirmacion",JOptionPane.YES_NO_OPTION);

        } while (res == 1);//While de la ostia

    }

    public static int menuprincipal() {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu\n"
                + "1. Agregar\n"
                + "2. Modificar\n"
                + "3. Eliminar\n"
                + "4. Listar\n"
                + "5. Simulacion\n", "Mensaje", JOptionPane.DEFAULT_OPTION));

        return opcion;

    }//Fin del metp

    public static int menuObjetos() {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu\n"
                + "1. Bestia\n"
                + "2. Integrantes\n"
                + "3. Pueblo\n"
                + "4. Lugar\n"
                + "Mensaje", JOptionPane.DEFAULT_OPTION));

        return opcion;

    }

    public static void Agregar() {
        int op = menuObjetos();

        switch (op) {
            case 1:
                JOptionPane.showMessageDialog(null, "Joder su eleccion fue bestia llene los campos que se le piden");
                int menub = menubestias();
                addBestias(menub);

                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                break;

        }//Fin switch magistral

    }//Fin metodo agregar waragria

    public static int menubestias() {
        int op = Integer.parseInt(JOptionPane.showInputDialog(null, "----Menu Bestias----\n"
                + "1. Aguilas\n"
                + "2. Arañas\n"
                + "3. Balrogs\n"
                + "4. Bestias aladas\n"
                + "5. Dragones", "Menu de bestias pollonas", JOptionPane.DEFAULT_OPTION));

        return op;
    }

    public static void addBestias(int opcion) {
        int garras=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de garras (maximo 6)","Garras",JOptionPane.DEFAULT_OPTION));
        
        boolean veneno;
        int ven=JOptionPane.showConfirmDialog(null, "¿ Desea que la bestias lleva veneno?","Veneno",JOptionPane.YES_NO_OPTION);
        if (ven==0){
            veneno=true;
        }
        else{
            veneno=false;
        }
        
        
        switch (opcion) {
            case 1:
                String color=JOptionPane.showInputDialog(null, "Ingrese el color del plumaje", "Plumaje",JOptionPane.DEFAULT_OPTION);  
                
                
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                break;

        }//Fin switch ostion

    }//Fin besrias add

}//Fin de la clase

