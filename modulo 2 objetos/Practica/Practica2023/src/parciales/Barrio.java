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
public class Barrio {
    private String nombre;
    private Lote[][] lotes;
    
    public Barrio(String unNombre, int unM, int unN){
        nombre = unNombre;
        lotes = new Lote[unM][unN];
        
        for(int i = 0; i < unM; i++){
            for(int j = 0; j < unN; j++){
                Lote aux = new Lote();
                lotes[i][j] = aux;
            }
        }
    }
    
    public void agregarComprador(Comprador unComprador,int unN, int unM){
        if(!lotes[unN][unM].vendido()){
            lotes[unN][unM].setComprador(unComprador);
        }
    }
    
    public void incrementarManzana(int unaManzana, double unPorcentaje){
        //seguir
    }
    
    public String toString(int iM, int iN){
        String aux;
        aux = "manzana: "+ iM +" "+ lotes[iM][iN].toString();
        return aux;
    }
}
