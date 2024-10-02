/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1.pkg2024;
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
        int total = 0;
        int cantidad = 0;
        int promedio;
        int DF = 15; //declaro la dimension fisica
        int [] alturas = new int[DF]; // declaro el vector
        for(int i=0; i < DF; i++){
            int num = GeneradorAleatorio.generarInt(221);
            alturas[i] = num;
        }
        for(int j=0; j < DF; j++){
            total = total + alturas[j];
            System.out.println(alturas[j]);
        }
        promedio = total/DF;
        System.out.print("Promedio: " + promedio);
        
        for(int z=0; z < DF; z++){
            if(alturas[z] > promedio){
                cantidad = cantidad + 1;
            }
        }
        System.out.println(" superan el promedio: " + cantidad);
    }
    
}
