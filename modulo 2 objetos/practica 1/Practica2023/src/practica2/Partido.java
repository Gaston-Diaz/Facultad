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
    //Constructores
    public Partido(){
    }
    public Partido(String unLocal,String unVisitante, int unGolLocal, int unGolVisitante){
        local = unLocal;
        visitante = unVisitante;
        golesLocal = unGolLocal;
        golesVisitante = unGolVisitante;
    }
    //getter y setter
    public String getLocal(){
        return local;
    }
    public String getVisitante(){
        return visitante;
    }
    public int getGolesLocal(){
        return golesLocal;
    }
    public int getGolesVisitante(){
        return golesVisitante;
    }
    public void setLocal(String unLocal){
        local = unLocal;
    }
    public void setVisitante(String unVisitante){
        visitante = unVisitante;
    }
    public void setGolesLocal(int unGolLocal){
        golesLocal = unGolLocal;
    }
    public void setGolesVisitante(int unGolVisitante){
        golesVisitante = unGolVisitante;
    }
    public boolean hayGanador(){
        return !hayEmpate();
    }
    public boolean hayEmpate(){
        return getGolesLocal() == getGolesVisitante();
    }
    public String getGanador(){
        if(getGolesLocal()>getGolesVisitante()){
            return getLocal();
        }else{
            return getVisitante();
        }
    }
    
}
