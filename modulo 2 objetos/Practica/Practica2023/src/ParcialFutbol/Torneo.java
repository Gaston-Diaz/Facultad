/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParcialFutbol;

/**
 *
 * @author gasto
 */
public class Torneo {
    private int dimf;
    private Fecha[] fechas; // arreglo con las fechas que contiene a los goleadores
    private int[] auxGoleadores;// arreglo de enteros que suma la cantidad de goleadores totales x fecha
    
    
    public Torneo(int cantFechas, int cantGoleadores){
        dimf = cantFechas;
        fechas = new Fecha[dimf]; // arreglo que contiene lista de fecha y goleadores
        auxGoleadores = new int[dimf];// arreglo que contiene un entero que suma los goleadores por fecha
        
        for(int i = 0; i < dimf; i++){
            Fecha aux = new Fecha(cantGoleadores);// instancio la fecha
            fechas[i] = aux; // lo guardo en el arreglo
            auxGoleadores[i]= 0; // arreglo de contadores inicialmente vacio
        }
    }
    
    public void agregarGoleadoraFecha(int fecha, Goleador unGoleador){
        fechas[fecha].agregar(unGoleador);
        auxGoleadores[fecha] = auxGoleadores[fecha] + 1;
    }
    
    @Override
    public String toString(){
        String aux = " Fecha ";
        for(int i = 0; i < dimf; i++){
            aux = aux + i + " Cantidad de Goleadores: "+ auxGoleadores[i] + fechas[i].toString();
        }
        return aux;
    }
}
