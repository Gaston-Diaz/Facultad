/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;
//import java.util.ArrayList;
/**
 *
 * @author gasto
 */
public class Hotel {
    int cantHabitaciones;
    Habitacion[] habitaciones = new Habitacion[cantHabitaciones];
    
    //constructor
    public Hotel(int cant){
        cantHabitaciones = cant;
        
        for(int i = 0; i < cantHabitaciones; i++){
            Habitacion h = new Habitacion();
            habitaciones[i] = h;
        }
    }
    
    public void agregarCliente(int unaHabitacion, Persona unCliente){
        habitaciones[unaHabitacion].setCliente(unCliente);
    }
}
