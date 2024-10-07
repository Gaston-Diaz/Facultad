/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;
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
        double lado1 = GeneradorAleatorio.generarDouble(10);
        double lado2 = GeneradorAleatorio.generarDouble(10);
        double lado3 = GeneradorAleatorio.generarDouble(10);
        String colorR = GeneradorAleatorio.generarString(5);
        String colorL = GeneradorAleatorio.generarString(5);
        
        Triangulo t = new Triangulo(lado1,lado2,lado3,colorR,colorL);
        
        System.out.println("El area es: " + t.area());
        System.out.println("El perimetro es: " + t.perimetro());
        System.out.println("El color de linea es: " + t.getColorLinea());
        System.out.println("El color de relleno es: " + t.getColorRelleno());
    }
    
}
