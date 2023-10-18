/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

/**
 *
 * @author Diego
 */
public abstract class Recital {
    private int diml;
    private String nombreBanda;
    private String [] listaTemas;
    
    public Recital(String unNombre, int cant){
        setNombreBanda(unNombre);
        listaTemas = new String[cant];
        diml = 0;
    }

    public String getNombreBanda() {
        return nombreBanda;
    }

    public void setNombreBanda(String nombreBanda) {
        this.nombreBanda = nombreBanda;
    }
    
    public void agregarTema(String unNombre){
        listaTemas[diml] = unNombre;
        diml = diml + 1;
    }
    
    public String actuar(){
       String aux = " Ahora tocaremos: ";
       for(int i = 0; i < diml; i++){
           aux = aux  + listaTemas[i] + " ";
       }
       return aux;
    }
    
    public abstract double calcularCosto();
}
