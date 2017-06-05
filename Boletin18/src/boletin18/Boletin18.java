/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18;

import javax.swing.JOptionPane;

/**
 *
 * @author alvar
 */
public class Boletin18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion=10;
        Buzon miBuzon=new Buzon();
        
        do{
        opcion=Integer.parseInt(JOptionPane.showInputDialog("Buzón de correo\nElige una opcion:\n1.Escribir correo"
                + "\n2.Mostrar correo\n3.Mostrar correos sin leer\n4.Mostrar primer correo sin leer"
                + "\n5.Muestra el siguiente correo guardado:\n6.Eliminar el siguiente correo: n\n0.Salir"));
                
        switch(opcion){
            case 1:
                miBuzon.engade(new Correo(JOptionPane.showInputDialog("Escribe tu correo")));
                break;
            case 2:
                System.out.println(miBuzon.Correos());
                break;
            case 3:
                System.out.println(miBuzon.noLeidos());
                break;
            case 5:
                System.out.println(miBuzon.Mostrar(Integer.parseInt(JOptionPane.showInputDialog("Introduce el correo que quieres leer"))));
                break;
            case 4:
                System.out.println(miBuzon.mostrarNoLeido());
                break;
            case 6:
                miBuzon.elimina(Integer.parseInt(JOptionPane.showInputDialog("Introduce el correo que debe eliminarse")));
                break;
            case 0:
                System.out.println("Saliendo de la bandeja de correo");
                break;
            default:
                System.out.println("No disponible");
                break;
        }
        }while(opcion!=0);
        
    }
    
}