/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author gasto
 */
public class ejercicio2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        int dni;
        int edad;
        int dl = 0;
        Persona [] personas = new Persona[15];
        edad = GeneradorAleatorio.generarInt(100);
        while(edad != 0 && dl < 15){
            nombre = GeneradorAleatorio.generarString(10);
            dni = GeneradorAleatorio.generarInt(500);
            Persona p = new Persona(nombre,dni,edad);
            personas[dl] = p;
            dl++;
            edad = GeneradorAleatorio.generarInt(100);
        }
        
        System.out.println("aca se imprime el resultado del vector");
        
        int i = 0;
        int mayor65 = 0;
        int dniMin = 999;
        Persona pmin = null;
        while(i < dl){
            if(personas[i].getEdad() > 65){
                mayor65++;
            }
            if(personas[i].getDni() < dniMin){
                dniMin = personas[i].getDni();
                pmin = personas[i];
            }
            System.out.println(personas[i].toString());
            i++;
        }
        System.out.println("la cantidad de personas mayores a 65 es: " + mayor65);
        if(pmin != null){
            System.out.println("la persona con menor dni es: " + pmin.toString());
        }
    }
    
}
