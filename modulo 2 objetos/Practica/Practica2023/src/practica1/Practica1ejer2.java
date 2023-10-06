/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;
import PaqueteLectura.Lector;
/**
 *
 * @author gasto
 */
public class Practica1ejer2 {
    public static void main (String[] args){
        int fin = 14; //cantidad de jugadores
        int [] jugador = new int[fin];
        int i,prom,cant;
        cant = 0;
        prom = 0;
        for (i=0; i < fin; i++){
            System.out.println("Ingrese altura");
            jugador[i] = Lector.leerInt();
        }
        System.out.print("imprimir vector");
        for(i=0; i < fin; i++){
            System.out.print(jugador[i]+ " - ");
            prom = prom + jugador[i];
        }
        prom = prom / fin;
        System.out.println("el promedio es: " + prom);
        for(i=0; i<fin;i++){
            if(prom < jugador[i])
                cant++;
        }
        System.out.println("La cantidad de jugadores que pasan el promedio es: " + cant);
    } 
}
