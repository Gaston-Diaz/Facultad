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
    private int diml;
    private Goleador[] goleadores;
    
    public Fecha(int cant){
        setDiml(0);
        setDimf(cant);
        goleadores = new Goleador[getDimf()];
        
        for (int i= 0; i < getDimf(); i++){
            goleadores[i]= null;
        }
    }

    public int getDimf() {
        return dimf;
    }

    public void setDimf(int dimf) {
        this.dimf = dimf;
    }

    public int getDiml() {
        return diml;
    }

    public void setDiml(int diml) {
        this.diml = diml;
    }
    public void aumentarDiml(){
        diml++;
    }
   
    public void agregar(Goleador unGoleador){
        goleadores[getDiml()] = unGoleador;
        aumentarDiml();
    }
}
