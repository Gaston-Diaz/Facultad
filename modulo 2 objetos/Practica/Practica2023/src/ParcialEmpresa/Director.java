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
public class Director extends Persona{
    private double montoViaticos;
    
    //constructores
    public Director(String unNombre,int unAnio,double unSueldo,double unViatico){
        super(unNombre,unAnio,unSueldo);
        setMontoViaticos(unViatico);
    }

    public double getMontoViaticos() {
        return montoViaticos;
    }

    public void setMontoViaticos(double montoViaticos) {
        this.montoViaticos = montoViaticos;
    }
    
    @Override
    public double sueldo(){
        double aux = super.plusSueldo() + getMontoViaticos();
        return aux;
    }
    
}
