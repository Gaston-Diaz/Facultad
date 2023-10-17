/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParcialFutbol;

/**
 *
 * @author gasto
 */
public class Goleador {
    private String nombre;
    private String nombreE;
    private int goles;
    
    public Goleador(String unNombre, String unNombreE,int unosGoles){
        setNombre(unNombre);
        setNombreE(unNombreE);
        setGoles(unosGoles);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    } 
    
    @Override
    public String toString(){
        String aux;
        aux = " Nombre: "+getNombre() + " Nombre Equipo: "+getNombreE()+ " Goles: " +getGoles();
        return aux;
    }
}
