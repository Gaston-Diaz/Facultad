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
public class Hotel {
    private Habitacion [] habitaciones;
    private int dl;
    
    //constructor
    public Hotel(int n){
        dl = n;
        habitaciones = new Habitacion[n];
        for(int i=0; i<n; i++){
            Habitacion h = new Habitacion();
            habitaciones[i] = h;
        }
    }
    public void aumentarLosPrecios(double unMonto){
        for(int i=0; i<dl;i++){
            habitaciones[i].aumentarPrecio(unMonto);
        }
    }
    
    public void asignarEnHabitacion(int habitacion, Cliente unCliente){
        habitaciones[habitacion].ingresoCliente(unCliente);
    }
    
    @Override
    public String toString(){
        String aux = "";
        for(int i=0; i<dl;i++){
            aux = aux + " Habitacion: " + i + habitaciones[i].toString();
        }
        return aux;
    }
}
