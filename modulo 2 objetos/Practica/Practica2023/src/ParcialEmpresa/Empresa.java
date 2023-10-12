/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParcialEmpresa;

/**
 *
 * @author gasto
 */
public class Empresa {
    private String nombre;
    private String direccion;
    private Director director;
    private Encargado[] sucursales;
    
    //constructores
    public Empresa(String unNombre, String unaDireccion, Director unDirector, int cant){
        setNombre(unNombre);
        setDireccion(unaDireccion);
        setDirector(unDirector);
        sucursales = new Encargado[cant];
        
        for(int i = 0; i < cant; i++){
            sucursales[i] = null;
        }
    }
    //getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
    
}
