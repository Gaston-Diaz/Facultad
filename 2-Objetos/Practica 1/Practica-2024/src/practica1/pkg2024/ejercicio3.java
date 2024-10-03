/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1.pkg2024;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author Usuario
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        
        int [][] matriz = new int[5][5];
        int [] vector = new int[5];
        for(int i = 0; i< 5; i++ ){
            vector[i] = 0;
        }
        
        int fila1 = 0;
        
        for(int i= 0; i < 5; i++){
            for(int j= 0; j < 5; j ++){
                int num = GeneradorAleatorio.generarInt(10);
                matriz[i][j] = num;
            }
        }
        System.out.println("Imprimimos la matriz");
        
        for( int i =0; i < 5; i++ ){ //punto a
            for(int j=0; j < 5; j++){
                System.out.print("[" + matriz[i][j] + "]");
                vector[j] = vector[j] + matriz[i][j]; //modificar esto para sumar por columna
            }
            fila1 = fila1 + matriz[0][i];
            System.out.println();
        }
        
        System.out.println("la fila 1 suma: " + fila1);
        System.out.println("la suma de las columnas es: ");
        for(int i = 0; i < 5; i++){
            System.out.print("["+ vector[i]+"]");
        }
        
    }
    
}
