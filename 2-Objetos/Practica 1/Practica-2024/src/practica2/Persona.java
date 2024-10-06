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
public class Persona {
    private String nombre;
    private int dni;
    private int edad;
    
    public Persona(){
    }
    
    public Persona(String unNombre, int unDni, int unaEdad){
        nombre = unNombre;
        dni = unDni;
        edad = unaEdad;
    }
    //getter
    public String getNombre(){
        return nombre;
    }
    public int getDni(){
        return dni;
    }
    public int getEdad(){
        return edad;
    }
    // setter
    public void setNombre(String unNombre){
        nombre = unNombre;
    }
    public void setDni(int unDni){
        dni = unDni;
    }
    public void setEdad(int unaEdad){
        edad = unaEdad;
    }
    
    @Override
    public String toString(){
        String aux;
        aux = "mi nombre es " + getNombre() + ", mi DNI es " + getDni() + " y mi edad es " + getEdad();
        return aux;
    }
}
