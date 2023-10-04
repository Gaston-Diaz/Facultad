/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author gasto
 */
public class ejercicio2 {
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        int mayores = 0;
        int min = 9999;
        int dimf = 15;
        int i = 0;
        Persona [] personas = new Persona [dimf];
        
        String auxNombre = GeneradorAleatorio.generarString(10);
        int auxDni = GeneradorAleatorio.generarInt(1000);
        int auxEdad = GeneradorAleatorio.generarInt(100);
        
        Persona aux = new Persona(auxNombre,auxDni,auxEdad);
        while(i < 15 && aux.getDni() != 0){
            //agrego persona al vector
            personas[i] = aux;
            //genero otra persona
            auxNombre = GeneradorAleatorio.generarString(10);
            auxDni = GeneradorAleatorio.generarInt(1000);
            auxEdad = GeneradorAleatorio.generarInt(100);
            aux = new Persona(auxNombre,auxDni,auxEdad);
            //aumento i
            i++;
       }
        //System.out.println(personas[2].toString());
        //System.out.println(personas[13].toString());
        for(int j = 0; j < i; j++){
            System.out.println(j+" - "+ personas[j].toString());
            if(personas[j].getEdad() > 65){
                mayores++;
            }
            if(personas[j].getDni() < min){
                min = personas[j].getDni();
            }
        }
        System.out.println("La cantidad de personas que superan los 65 años es: " + mayores);
        System.out.println("El dni menor es: " + min);
    }
}
