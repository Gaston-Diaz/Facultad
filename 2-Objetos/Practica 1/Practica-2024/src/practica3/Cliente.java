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
public class Cliente {
    private String nombre;
    private int dni;
    private int edad;
    
    //constructores
    public Cliente(){}
    
    public Cliente(String unNombre, int unDni, int unaEdad){
        nombre = unNombre;
        dni = unDni;
        edad = unaEdad;
    }
    
    //getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString(){
        String aux = " Nombre: " + getNombre() + " dni: " + getDni() + " edad: " + getEdad();
        return aux;
    }
}
