/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
/**
 *
 * @author gasto
 */
public class ejercicio4 {
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        
        Hotel h = new Hotel(5);
        
        System.out.println(h.toString(2));
        
        String auxnombre = Lector.leerString();
        int auxDni = Lector.leerInt();
        int auxEdad = Lector.leerInt();
        
        Persona p1 = new Persona(auxnombre,auxDni,auxEdad);
        
        System.out.println(h.agregarCliente(2, p1));
        
        System.out.println(h.toString(2));
        
        System.out.println(h.agregarCliente(2, p1));
         
    }
    
}
