/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18;

import java.util.ArrayList;

/**
 *
 * @author alvar
 */
public class Buzon {
    
    private ArrayList<Correo> buzon= new ArrayList();
    
    public int Correos(){
        return buzon.size();
    }
    
    public void engade(Correo c){
        buzon.add(c);
    }
    
    public boolean noLeidos(){
        
        boolean senler=false;
        for(int i=0;i<buzon.size();i++){
            if(buzon.get(i).getLeido()==false){
                senler=true;
            }
        }
        return senler;
    }
    
    public String mostrarNoLeido(){
        int primerNoLeido=-1;
        try{
        for (int i=0;i<buzon.size();i++){
            if(buzon.get(i).getLeido()==false&&primerNoLeido==-1){
                primerNoLeido=i;
            }
        }
        Correo c=buzon.get(primerNoLeido);
        c.setLeido(true);
        buzon.set(primerNoLeido, c);
        return buzon.get(primerNoLeido).getContenido();}
        catch(ArrayIndexOutOfBoundsException e){
            String err="No hay correos sin leer";
            return err;
                    
                    
        }
    }
    
    public String Mostrar(int k){

        Correo c=buzon.get(k-1);
        c.setLeido(true);
        buzon.set(k-1, c);
        return buzon.get(k-1).getContenido();
    }
    
    public void elimina(int k){
        buzon.remove(k-1);
    }
}