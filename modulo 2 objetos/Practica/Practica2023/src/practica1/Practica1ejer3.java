/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
/**
 *
 * @author gasto
 */
public class Practica1ejer3 {
    public static void main(String[] args){
        int suma = 0;
        int aux;
        int i,j;
        int [] vector = new int [5];
        int [][] matriz = new int [5][5];
        System.out.println("Cargar matriz");
        for(i = 0; i < 5; i++){
            for(j = 0; j < 5; j++){
                matriz[i][j] = GeneradorAleatorio.generarInt(30);
            }
        }

        System.out.println("mostrar matriz");
        System.out.println("ingresar numero");
        aux = Lector.leerInt();
        for(i = 0; i < 5; i++){
            for(j = 0; j < 5; j++){
                System.out.print(matriz[i][j]+"  ");
                if(i == 0){
                    suma = suma + matriz[i][j]; //suma primera fila
                }
                vector[j] = vector[j] + matriz[i][j];
                if(aux == matriz[i][j]){
                    System.out.println("La posicion del numero buscado es i: " + i +" j: " + j);
                }
            }
            System.out.println();
        }
        System.out.println("la suma de la primera fila es: " + suma);
        System.out.println("el vector con las sumas es:");
        for(i = 0; i < 5; i++){
            System.out.print(vector[i]+ " ");
        }

    }
}
