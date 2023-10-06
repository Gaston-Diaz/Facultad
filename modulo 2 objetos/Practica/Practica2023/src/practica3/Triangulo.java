/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

/**
 *
 * @author gasto
 */
public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    private String colorR;
    private String colorL;
    //constructores
    public Triangulo(){
    }
    public Triangulo(double unLado1,double unLado2,double unLado3,String unColorR, String unColorL){
        lado1 = unLado1;
        lado2 = unLado2;
        lado3 = unLado3;
        colorR = unColorR;
        colorL = unColorL;
    }
    //getter y setter

    public double getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public String getColorR() {
        return colorR;
    }

    public void setColorR(String colorR) {
        this.colorR = colorR;
    }

    public String getColorL() {
        return colorL;
    }

    public void setColorL(String colorL) {
        this.colorL = colorL;
    }
    
    public double calcularArea(){
        double s = (getLado1()+getLado2()+getLado3())/2;
        double cuenta =(s*(s-getLado1())*(s-getLado2())*(s-getLado3()));
        return Math.sqrt(cuenta);
    } 
    
    public double calcularPerimetro(){
        return getLado1()+getLado2()+getLado3();
    }
}
