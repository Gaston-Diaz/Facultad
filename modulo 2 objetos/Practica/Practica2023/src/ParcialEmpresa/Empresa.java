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
    private int dimf;
    private String nombre;
    private String direccion;
    private Director director;
    private Encargado[] sucursales;
    
    //constructores
    public Empresa(String unNombre, String unaDireccion, Director unDirector, int cant){
        setDimf(cant);
        setNombre(unNombre);
        setDireccion(unaDireccion);
        setDirector(unDirector);
        sucursales = new Encargado[getDimf()];
        
        for(int i = 0; i < getDimf(); i++){
            sucursales[i] = null;
        }
    }
    //getter y setter

    public int getDimf() {
        return dimf;
    }

    public void setDimf(int dimf) {
        this.dimf = dimf;
    }
    
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
    
    public void agregarEncargado(Encargado unEncargado, int pos){
        sucursales[pos] = unEncargado;
    }
    public double mostrarSueldoDirector(){
        return getDirector().sueldo();
    }
    
    @Override
    public String toString(){
        String aux;
        aux = "Nombre empresa: "+ getNombre()+" Direccion: "+getDireccion() + " Director: "+getDirector().toString();
        for(int i = 0; i < getDimf(); i++){
            aux = aux + " Sucursal Nro: " + i + " Encargado: ";
            if(sucursales[i] == null){
                aux = aux + "Sin encargado";
            }else{
                aux = aux + sucursales[i].toString();
            }
        }
        return aux;
    }
}
 