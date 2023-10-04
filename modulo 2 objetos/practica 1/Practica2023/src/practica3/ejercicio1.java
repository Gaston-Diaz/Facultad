/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;
import PaqueteLectura.Lector;
/**
 *
 * @author gasto
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double lado1,lado2,lado3;
        String colorR,colorL;
        System.out.println("Ingresar lado 1");
        lado1 = Lector.leerDouble();
        System.out.println("Ingresar lado 2");
        lado2 = Lector.leerDouble();
        System.out.println("Ingresar lado 3");
        lado3 = Lector.leerDouble();
        System.out.println("Ingresar color de linea");
        colorL = Lector.leerString();
        System.out.println("Ingresar color de relleno");
        colorR = Lector.leerString();
        
        Triangulo t = new Triangulo(lado1,lado2,lado3,colorR,colorL);
        
        System.out.println("el area del triangulo es: " + t.calcularArea());
        System.out.println("el perimetro del triangulo es: " + t.calcularPerimetro());
    }
    
}
