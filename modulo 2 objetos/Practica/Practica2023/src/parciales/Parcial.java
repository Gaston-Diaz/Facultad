/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parciales;
import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author gasto
 */
public class Parcial {
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        
        int dni = GeneradorAleatorio.generarInt(11);
        String nomp = GeneradorAleatorio.generarString(7);
        String ape = GeneradorAleatorio.generarString(5);
        String ciu = GeneradorAleatorio.generarString(10);
        Comprador c = new Comprador(dni,nomp,ape,ciu);
        
        
        System.out.println("Ingrese nombre");
        String nombre = Lector.leerString();
        System.out.println("Ingrese manzana");
        int m = Lector.leerInt();
        System.out.println("Ingrese lotes");
        int n = Lector.leerInt();
        
        Barrio b = new Barrio(nombre,m,n);
        
        int x= 2;
        int y = 2;
                
        System.out.println(b.imprimir(x, y));
        
        x= 3;
        y = 2;
        
        b.agregarComprador(c, x, y);
        
                
        System.out.println(b.imprimir(x, y));
    }
    
}
