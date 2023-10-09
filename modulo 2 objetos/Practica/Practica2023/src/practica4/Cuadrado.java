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
public class Cuadrado extends Figura{
    private double lado;
    
    public Cuadrado(double unLado, String unColorL,String unColorR){
        super(unColorL, unColorR);
        lado = unLado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    public double calcularArea(){
        return Math.pow(getLado(), 2);
    }
    
    public double calcularPerimetro(){
        return getLado()*4;
    }
    
    public String toString(){
        String aux = super.toString() + " lado: "+getLado();
        return aux;
    }
}
