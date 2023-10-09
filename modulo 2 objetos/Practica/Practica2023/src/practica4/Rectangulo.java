/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

/**
 *
 * @author gasto
 */
public class Rectangulo extends Figura{
    private double lado1;
    private double lado2;
    
    public Rectangulo(double unLado1, double unLado2,String colorL, String colorR){
        super(colorL,colorR);
        lado1 = unLado1;
        lado2 = unLado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    
    public double calcularArea(){
        return getLado1() * getLado2();
    }
    
    public double calcularPerimetro(){
        return 2 * (getLado1() + getLado2());
    }
    
    public String toString(){
        String aux = super.toString() + " lado1: "+getLado1()+" lado2: "+getLado2();
        return aux;
    }
    
}
