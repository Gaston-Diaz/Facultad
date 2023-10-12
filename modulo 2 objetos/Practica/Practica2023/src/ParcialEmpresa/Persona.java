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
public abstract class Persona {
    private String nombre;
    private int Ingreso;
    private double sueldoBasico;
    
    //constructores
    public Persona(String unNombre,int unAnio, double unSueldo){
        setNombre(unNombre);
        setIngreso(unAnio);
        setSueldoBasico(unSueldo);
    } 
    //getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIngreso() {
        return Ingreso;
    }

    public void setIngreso(int Ingreso) {
        this.Ingreso = Ingreso;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
    
}
