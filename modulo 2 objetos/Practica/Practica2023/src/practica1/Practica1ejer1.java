/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author gasto
 */
public class Practica1ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        int DimF=11;  
        int [] tabla2 = new int[DimF]; // indices de 0 a 10
        int i,aux ;
        System.out.print("La tabla del 2 es ");
        for (i=0;i<DimF;i++){
            tabla2[i]=2*i;
            System.out.print(tabla2[i] + " - ");
        }
        //aca empieza el punto 1
        aux = GeneradorAleatorio.generarInt(12);
        while(aux != 11){
           System.out.println("El numero "+ aux + " multiplicado es: " +tabla2[aux]);
           aux = GeneradorAleatorio.generarInt(12);
        }
        System.out.println("termine");
    }
    
}
