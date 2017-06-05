/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18;

/**
 *
 * @author alvar
 */
public class Correo {

    private String contenido;
    private boolean leido = false;
    
    public Correo(String s) {
        contenido = s;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }

    public String getContenido() {
        return contenido;
    }

    public boolean getLeido() {
        return leido;
    }
}