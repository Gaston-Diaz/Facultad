/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1.pkg2024;
import PaqueteLectura.Lector;
/**
 *
 * @author Usuario
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [][] matriz = new int[8][4];
        int piso;
        int oficina;
        
        for(int i= 0; i < 8; i++){
            for(int j= 0; j < 4; j++){
                matriz[i][j] = 0;
            }
        }
        
        piso = Lector.leerInt();
        System.out.println("piso: " + piso);
        while( piso != 9){
            oficina = Lector.leerInt();
            System.out.println("oficina: " + oficina);
            matriz[piso][oficina] = matriz[piso][oficina] + 1;
            piso = Lector.leerInt();
            System.out.println("piso: " + piso);
        }
        
        for(int i= 0; i < 8; i++){
            for(int j= 0; j < 4; j++){
                System.out.print("["+ matriz[i][j] +"]");
            }
            System.out.println();
        }  
        System.out.println("imprimimos pero con un formato");
        
        for(int i= 0; i < 8; i++){
            System.out.println("piso: " + i );
            for(int j= 0; j < 4; j++){
                System.out.print(" oficina: " + j + ": " + matriz[i][j]+ " - ");
            }
            System.out.println();
        } 
    }
    
}
