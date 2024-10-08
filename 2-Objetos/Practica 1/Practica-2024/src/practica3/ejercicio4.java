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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = GeneradorAleatorio.generarString(10);
        int dni = GeneradorAleatorio.generarInt(500);
        int edad = GeneradorAleatorio.generarInt(99);
        
        Cliente c = new Cliente(nombre,dni,edad);
        
        Hotel h = new Hotel(3);
        
        h.asignarEnHabitacion(1, c);
        
        System.out.println(h.toString());
    }
    
}
