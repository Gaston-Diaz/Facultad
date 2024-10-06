/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
/**
 *
 * @author gasto
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dimI = 0;
        int dimJ = 0;
        Persona p;
        Persona [][] casting = new Persona [5][8]; 
        System.out.println("Ingrese el nombre: ");
        String nombre = Lector.leerString();
        while(dimI < 5 && !nombre.equals("zzz")){
            while(dimJ < 8 && !nombre.equals("zzz")){
                int dni = GeneradorAleatorio.generarInt(500);
                int edad = GeneradorAleatorio.generarInt(100);
                casting[dimI][dimJ] = p = new Persona(nombre,dni,edad);
                nombre = Lector.leerString();
                dimJ++;
            }
            dimI++;
        }
    }
    
}
