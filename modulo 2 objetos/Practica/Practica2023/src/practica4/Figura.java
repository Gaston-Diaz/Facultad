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
public abstract class Figura {
    private String colorRelleno;
    private String colorLinea;
    
    public Figura(String unColorLinea, String unColorRelleno){
        colorRelleno = unColorRelleno;
        colorLinea  =unColorLinea;
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
    @Override
    public String toString(){
        String aux;
        aux = "El area es: "+ this.calcularArea()+" el perimetro es: "+this.calcularPerimetro()+" el color de relleno es: "+getColorRelleno()+" el color de linea es: "+getColorLinea();
        return aux;
    }
    
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    
}
