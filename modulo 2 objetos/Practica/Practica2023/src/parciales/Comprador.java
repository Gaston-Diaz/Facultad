/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parciales;

/**
 *
 * @author gasto
 */
public class Comprador {
    
    private int dni;
    private String nombre;
    private String apellido;
    private String ciudad;
    
    // constructores
    public Comprador(){
    }
    public Comprador(int unDni,String unNombre,String unApellido,String unaCiudad){
        dni = unDni;
        nombre = unNombre;
        apellido = unApellido;
        ciudad = unaCiudad;
    }
    //getter y setter

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
   
    @Override
    public String toString(){
        String aux;
        aux = " Dni: "+getDni() + " Nombre: " + getNombre() + " Apellido: " + getApellido() + " Ciudad: " + getCiudad()+ " ";
        return aux;
    }
}
