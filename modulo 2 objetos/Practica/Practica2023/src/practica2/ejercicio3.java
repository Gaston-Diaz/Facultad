/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;
import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author gasto
 */
public class ejercicio3 {
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        Persona [][] concurso = new Persona[5][8];
        int i = 0; 
        /*System.out.println("Ingrese nombre");
        String auxNombre = Lector.leerString();*/
        String auxNombre = GeneradorAleatorio.generarString(10);
        int auxDni = GeneradorAleatorio.generarInt(1000);
        int auxEdad = GeneradorAleatorio.generarInt(100);
        Persona p = new Persona(auxNombre,auxDni,auxEdad);
        while(i < 5 && !p.getNombre().equals("zzz")){
            int j = 0;
            while(j < 8 && !p.getNombre().equals("zzz")){
                concurso[i][j] = p;
                
                /*System.out.println("Ingrese nombre");
                auxNombre = Lector.leerString*/
                auxNombre = GeneradorAleatorio.generarString(10);
                auxDni = GeneradorAleatorio.generarInt(1000);
                auxEdad = GeneradorAleatorio.generarInt(100);
                p = new Persona(auxNombre,auxDni,auxEdad);
                j++;
            }
            i++;
        }
        System.out.println("termine");
        for(int auxi=0; auxi < i;auxi++){
            for(int auxj=0; auxj < 8;auxj++){
                System.out.println("dia: "+auxi+" turno: "+auxj+" "+concurso[auxi][auxj].toString());
            }
        }
    }
    
}
