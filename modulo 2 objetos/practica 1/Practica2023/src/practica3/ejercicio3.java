/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;
import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;

/**
 *
 * @author gasto
 */
public class ejercicio3 {
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        //Creacion del autor
        
        String nombre = GeneradorAleatorio.generarString(10);
        String biografia = GeneradorAleatorio.generarString(30);
        String origen = GeneradorAleatorio.generarString(15);
        Autor a = new Autor(nombre,biografia,origen);
        //Creacion del libro
        
        //String titulo = GeneradorAleatorio.generarString(15);
        System.out.println("Ingrese un titulo");
        String titulo = Lector.leerString();
        String editorial = GeneradorAleatorio.generarString(8);
        int anio = GeneradorAleatorio.generarInt(3000);
        String isbn = GeneradorAleatorio.generarString(5);
        double precio = GeneradorAleatorio.generarDouble(200);
        Libro l = new Libro(titulo,editorial,anio,isbn,precio,a);
        //creacion segundo libro
        
        //titulo = GeneradorAleatorio.generarString(15);
        System.out.println("Ingrese un titulo");
        titulo = Lector.leerString();
        editorial = GeneradorAleatorio.generarString(8);
        anio = GeneradorAleatorio.generarInt(3000);
        isbn = GeneradorAleatorio.generarString(5);
        precio = GeneradorAleatorio.generarDouble(200);
        Libro l2 = new Libro(titulo,editorial,anio,isbn,precio,a);
        
        //creacion tercer libro
        
        //titulo = GeneradorAleatorio.generarString(15);
        System.out.println("Ingrese un titulo");
        titulo = Lector.leerString();
        editorial = GeneradorAleatorio.generarString(8);
        anio = GeneradorAleatorio.generarInt(3000);
        isbn = GeneradorAleatorio.generarString(5);
        precio = GeneradorAleatorio.generarDouble(200);
        Libro l3 = new Libro(titulo,editorial,anio,isbn,precio,a);
        
        System.out.println(l.toString());
        System.out.println(l2.toString());
        
        //creacion del estante
        Estante e = new Estante();
        System.out.println(e.cantidadLibros());
        e.agregarLibro(l);
        e.agregarLibro(l2);
        e.agregarLibro(l3);
        System.out.println(e.cantidadLibros());
        
        System.out.println(e.buscarLibro("libro1"));
    }
    
}
