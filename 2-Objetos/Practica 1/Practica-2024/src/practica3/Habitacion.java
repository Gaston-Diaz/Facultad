/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author Usuario
 */
public class Habitacion {
    private double costoXnoche;
    private boolean ocupada;
    private Cliente cli;
    
    //constructor
    public Habitacion(){
        costoXnoche = GeneradorAleatorio.generarDouble(8000);
        ocupada = false;
        cli = null;
    }
    
    public boolean estaOcupada(){
        return ocupada;
    }
    
    public void aumentarPrecio(double monto){
        costoXnoche = monto;
    }
    
    public void ingresoCliente(Cliente unCli){
        cli = unCli;
    }
    
    @Override
    public String toString(){
        String aux = " Costo: " + costoXnoche + " libre: " + estaOcupada();  
        if(estaOcupada()){
            aux = aux + " cliente: " + cli.toString();
        }
        return aux;
    }
}
