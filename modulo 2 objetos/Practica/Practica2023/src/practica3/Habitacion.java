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
public class Habitacion {
    int costoPorNoche;
    boolean ocupada;
    Persona cliente;
    
    //Constructores
    public Habitacion(){
        costoPorNoche = 100; //cambiar por costo random
        ocupada = false;
        cliente = null;
    }
    //getter y setter

    public int getCostoPorNoche() {
        return costoPorNoche;
    }

    public boolean estaOcupada() {
        return ocupada;
    }
    public void cambiarEstado(){
        ocupada = !ocupada;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    } 
    
    public void aumentarPrecio(int unPrecio){
        costoPorNoche = costoPorNoche +unPrecio;
    }
    
    @Override
    public String toString(){
        String aux;
        if(estaOcupada()){
            return aux = "habitacion libre ";
        }
        return aux = "habitacion ocupada " + " cliente: "+ getCliente().toString();
    }
    
}
