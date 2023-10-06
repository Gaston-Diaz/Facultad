/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;
import PaqueteLectura.Lector;

/**
 *
 * @author gasto
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese nombre");
        String nombre = Lector.leerString();
        System.out.println("Ingrese dni");
        int dni = Lector.leerInt();
        System.out.println("Ingrese edad");
        int edad = Lector.leerInt();
        Persona p1 = new Persona(nombre,dni,edad);
        System.out.println("aca se empiezan a imprimir los datos");
        System.out.println(p1.getNombre());
        System.out.println(p1.getDni());
        System.out.println(p1.getEdad());
        System.out.println(p1.toString());
    }
    
}
