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
public class ejercicio4 {
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        Persona [][] concurso = new Persona[5][8]; 
        //inicializo un arreglo con elementos nulos para poder preguntar mas adelante si es vacio
        for(int y = 0; y < 5; y++){
            for(int z = 0; z < 8; z++){
                concurso[y][z]=null;
            }
        }
        //cargo la primer persona
        System.out.println("Ingrese nombre");
        String auxNombre = Lector.leerString();
        //String auxNombre = GeneradorAleatorio.generarString(10);
        int auxDni = GeneradorAleatorio.generarInt(1000);
        int auxEdad = GeneradorAleatorio.generarInt(100);
        System.out.println("Ingrese el dia");
        int auxDia = Lector.leerInt();
        Persona p = new Persona(auxNombre,auxDni,auxEdad);
        //mientras no sea la condicio de corte
        while(!p.getNombre().equals("zzz")){
            int j = 0;
            while(concurso[auxDia][j] != null && j < 8){
                j++;
            }
            if( j > 8){
                System.out.println("no hay disponibilidad para esa fecha, por favor ingrese una nueva:");
                auxDia = Lector.leerInt();
            }
            else{
                System.out.println("La persona se registro con exito");
                concurso[auxDia][j] = p;
                //Ingresar una nueva persona
                System.out.println("Ingrese nombre");
                auxNombre = Lector.leerString();
                //String auxNombre = GeneradorAleatorio.generarString(10);
                auxDni = GeneradorAleatorio.generarInt(1000);
                auxEdad = GeneradorAleatorio.generarInt(100);
                System.out.println("Ingrese el dia");
                auxDia = Lector.leerInt();
                p = new Persona(auxNombre,auxDni,auxEdad);
            }
        }
        System.out.println("termine");
        for(int auxi=0; auxi < 5;auxi++){
            for(int auxj=0; auxj < 8;auxj++){
                if(concurso[auxi][auxj] != null){
                    System.out.println("dia: "+auxi+" turno: "+auxj+" "+concurso[auxi][auxj].toString());
                }
                else{
                    System.out.println("dia: "+auxi+" turno: "+auxj+": libre");
                }
            }
        }
    }
    
}
