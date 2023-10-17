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
public class Fecha {
    private int dimf;
    private int cantGoleadores;
    private Goleador[] goleadores;
    
    public Fecha(int cant){
        cantGoleadores = 0;
        dimf = cant;
        goleadores = new Goleador[cant];
        
        for (int i= 0; i < dimf; i++){
            goleadores[i]= null;
        }
    }
 
    public int getCantGoleadores() {
        return cantGoleadores;
    }

    public void setCantGoleadores(int cantGoleadores) {
        this.cantGoleadores = cantGoleadores;
    }
    
    public void agregar(int pos, Goleador unGoleador){
        goleadores[pos] = unGoleador;
    }
}
