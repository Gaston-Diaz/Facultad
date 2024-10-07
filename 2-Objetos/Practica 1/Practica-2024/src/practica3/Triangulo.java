/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

/**
 *
 * @author Usuario
 */
public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    private String colorRelleno;
    private String colorLinea;
    
    //constructores
    public Triangulo(){}
    
    public Triangulo(double unLado1,double unLado2, double unLado3, String unColorR, String unColorL){
        lado1 = unLado1;
        lado2 = unLado2;
        lado3 = unLado3;
        colorRelleno = unColorR;
        colorLinea = unColorL;
    }
    //GETTER Y SETTER

    public double getLado1() {
        return lado1;
    }
    public double getLado2() {
        return lado2;
    }
    public double getLado3() {
        return lado3;
    }
    

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }
    public void setLado2(double lado2) {
        this.lado1 = lado2;
    }
    public void setLado3(double lado3) {
        this.lado1 = lado3;
    }

    public String getColorRelleno() {
        return colorRelleno;
    }

    public void setColorRelleno(String colorRelleno) {
        this.colorRelleno = colorRelleno;
    }

    public String getColorLinea() {
        return colorLinea;
    }

    public void setColorLinea(String colorLinea) {
        this.colorLinea = colorLinea;
    }
    
    public double perimetro(){
        return getLado1() + getLado2() + getLado3();
    }
    public double area(){
        double s = (getLado1() + getLado2() + getLado3())/2;
        double a = s - getLado1();
        double b = s - getLado2();
        double c = s - getLado3();
        return Math.sqrt(s*a*b*c);
    }
}
