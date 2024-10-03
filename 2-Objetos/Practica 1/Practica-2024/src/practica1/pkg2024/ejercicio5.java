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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] matriz = new int [4][10];
        int num;
        int [] vector = new int[4];
        for(int i = 0; i< 4; i++ ){
            vector[i] = 0;
        }
        
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 10; j++){
                matriz[i][j] = 0;
            }
        }
        
        for(int i = 0; i < 3; i++){
            System.out.print("califique atencion");
            num = Lector.leerInt();
            matriz[0][num] = matriz[0][num] + 1;
            System.out.print("calidad de comidad");
            num = Lector.leerInt();
            matriz[1][num] = matriz[1][num] + 1;
            System.out.print("precio");
            num = Lector.leerInt();
            matriz[2][num] = matriz[2][num] + 1;
            System.out.print("ambiente");
            num = Lector.leerInt();
            matriz[3][num] = matriz[3][num] + 1;
        }
        
        for(int i = 0; i < 4; i++){
            int suma = 0;
            int totalCalificaciones = 0;
            for(int j = 0; j < 10; j++){
                System.out.print("[" + matriz[i][j] + "]");
                suma= suma + matriz[i][j] * j;  
                totalCalificaciones= totalCalificaciones + matriz[i][j]; 
            }
       
            int promedio = suma / totalCalificaciones;
            System.out.println("promedio: " +promedio);
        }
    }
    
}
