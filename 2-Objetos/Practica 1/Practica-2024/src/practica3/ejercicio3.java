/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

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
        Estanteria e = new Estanteria();
        
        for(int i = 0; i < 20; i ++){
        
            String nombre = GeneradorAleatorio.generarString(10);
            String biografia = GeneradorAleatorio.generarString(10);
            String origen = GeneradorAleatorio.generarString(10);
        
            Autor a = new Autor(nombre,biografia,origen);
        
            String titulo = GeneradorAleatorio.generarString(10);
            String editorial = GeneradorAleatorio.generarString(10);
            String año = GeneradorAleatorio.generarString(10);
            int isbn = GeneradorAleatorio.generarInt(30);
            double precio = GeneradorAleatorio.generarDouble(100);
        
            Libro l = new Libro(titulo,a,editorial,año,isbn,precio);
        
            e.agregarLibro(l);
        }
        
        System.out.println(e.mostrarLibros());
    }
    
}
