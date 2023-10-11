/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parciales;

/**
 *
 * @author gasto
 */
public class Lote {
    private double precio;
    private Comprador comprador;
    
    public Lote(){
        precio = 50000;
        comprador = null;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public Comprador getComprador(){
        return comprador;
    }
    public void setComprador(Comprador unComprador){
        comprador = unComprador;
    }
    
    public boolean vendido(){
        return comprador != null;
    } 
    
    public void aumentarPrecio(double unPorcentaje){
        precio = precio * unPorcentaje;
    }
    
    @Override
    public String toString(){
        String aux;
        if(vendido()){
            aux = " Precio: "+ getPrecio() + " " + getComprador().toString();
        }else{
            aux = " "+ getPrecio() + " Disponible para la venta";
        }
        return aux;
    }
}
