/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author fojomars
 */
public class Boletin29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String opcion;
        ArrayList<Barco> alquiler = new ArrayList<>();
        do{
           opcion = JOptionPane.showInputDialog("Menú\n1. Añadir barco\n2. Visualizar barcos\n3. Salir");
           switch(opcion){
               case "1": String[] barcos = {"Embarcación deportista","Yate","Velero"};
                   int opcion2 = JOptionPane.showOptionDialog (null, " Salir a tomar alg?", "Cita", 
                           JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, barcos, barcos[0]);
                   switch(opcion2){
                       case 0: break;
                       case 1: break;
                       case 2: break;
                   }
                   break;
               case "2": 
                   for(int i=0;i<alquiler.size();i++){
                       System.out.println(alquiler.get(i).toString());
                   }
                   break;
               case "3": System.exit(0);
               default: break;
           }
        }while(opcion!="3");
    }
}
    

