/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

/**
 *
 * @author gasto
 */
public class Partido {
    private String local;
    private String visitante;
    private int golesLocal;
    private int golesVisitante;
    
    //constructores
    public Partido(){}
    
    public Partido(String unLocal, String unVisitante, int cantLocal, int cantvisitante){
        local = unLocal;
        visitante = unVisitante;
        golesLocal = cantLocal;
        golesVisitante = cantvisitante;
    }
    
    //getter y setter

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getVisitante() {
        return visitante;
    }

    public void setVisitante(String visitante) {
        this.visitante = visitante;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }
    
    public boolean hayGanador(){
        return getGolesLocal() > getGolesVisitante() || getGolesVisitante() > getGolesLocal();
    }
    
    public String getGanador(){
        if(getGolesLocal() > getGolesVisitante()){
            return getLocal();
        }else{
            return getVisitante();
        }
    }
    
    public boolean hayEmpate(){
        return getGolesLocal() == getGolesVisitante();
    }
    
    @Override
    public String toString(){
    String aux;
    aux = getLocal() + " - " + getGolesLocal() + " VS " + getGolesVisitante() + " - " + getVisitante();
    return aux;
    }
            
}
