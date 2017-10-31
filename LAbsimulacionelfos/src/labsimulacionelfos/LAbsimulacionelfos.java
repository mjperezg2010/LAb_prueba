
package labsimulacionelfos;

import javax.swing.JOptionPane;

/**
 *
 * @author mjper
 */
public class LAbsimulacionelfos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int res=0;
        do{
            switch (menu()){
                case 1:
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
            
            
            
            
        }while(res==1);//While de la ostia
        
        
        
        
        
        
        
       
        
        
    }
    
    public static int menu(){
        int opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "Menu\n"
                + "1. Agregar\n"
                + "2. Modificar\n"
                + "3. Eliminar\n"
                + "4 Listar\n"
                + "5. Simulacion\n","Mensaje",JOptionPane.DEFAULT_OPTION));
        
        return opcion;
        
    }//Fin del metp
    
}//Fin de la clase
