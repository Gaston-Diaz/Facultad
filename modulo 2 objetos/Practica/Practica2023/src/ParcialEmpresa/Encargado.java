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
public class Encargado extends Persona {
    private int cantEmpleados;
    
    //construtores
    public Encargado(String unNombre,int unAnio,double unSueldo,int empleados){
        super(unNombre,unAnio,unSueldo);
        setCantEmpleados(empleados);
        
    }
    //getter y setter

    public int getCantEmpleados() {
        return cantEmpleados;
    }

    public void setCantEmpleados(int cantEmpleados) {
        this.cantEmpleados = cantEmpleados;
    }
    
}
