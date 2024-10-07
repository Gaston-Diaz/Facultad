/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

/**
 *
 * @author Usuario
 */
public class Autor {
    private String nombre;
    private String biografia;
    private String origen;
    
    //constructores
    public Autor(){}
    
    public Autor(String unNombre, String unaBiografia, String unOrigen){
        nombre = unNombre;
        biografia = unaBiografia;
        origen = unOrigen;
    }
    //getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
    
    @Override
    public String toString(){
        String aux = " Nombre autor: " + getNombre() + " Biografia: " + getBiografia() + " Origen: " + getOrigen();
        return aux;
    }
    
}
