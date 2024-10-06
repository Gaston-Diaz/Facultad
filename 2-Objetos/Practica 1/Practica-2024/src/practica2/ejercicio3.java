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
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dimI = 0;
        int dimJ;
        Persona p;
        Persona [][] casting = new Persona [5][8]; 
        System.out.println("Ingrese el nombre: ");
        String nombre = Lector.leerString();
        //String nombre = GeneradorAleatorio.generarString(10);
        while(dimI < 5 && !nombre.equals("zzz")){
            dimJ = 0;
            while(dimJ < 8 && !nombre.equals("zzz")){
                int dni = GeneradorAleatorio.generarInt(500);
                int edad = GeneradorAleatorio.generarInt(100);
                casting[dimI][dimJ] = p = new Persona(nombre,dni,edad);
          //      nombre = GeneradorAleatorio.generarString(10);
                System.out.println("Ingrese el nombre: ");
                nombre = Lector.leerString();
                dimJ++;
            }
            dimI++;
        }
        for(int i =0; i < dimI; i++){
            System.out.println("Dia " + i);
            for(int j = 0; j < 8 ; j++){
                System.out.print(" Turno: " + j + "- ");
                if(casting[i][j]==null){
                    System.out.print("disponible");
                }else{
                    System.out.print(casting[i][j].toString());
                    }
            }
            System.out.println();
        }
    }
    
}
