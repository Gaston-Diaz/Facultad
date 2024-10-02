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
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int DF = 11; //DECLARO LA DIMENCION FISICA
        int [] tabla2 = new int[DF];  // DECLARO EL VECTOR CON LA DIMENCION 
        for(int i = 0; i < DF; i++){
            tabla2[i]= 2*i;
        }
        for(int j= 0; j< DF; j++){
            System.out.print(j + " = " + tabla2[j] + " ; ");
        }
        int num = GeneradorAleatorio.generarInt(12);
        while(num != 11){
            System.out.println(" numero aleatorio " + num);
            System.out.println(" numero en la tabla " + tabla2[num]);
            num = GeneradorAleatorio.generarInt(12);
        }
    }
    
}
