/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial;

/**
 *
 * @author gasto
 */
public class Barrio {
    private int manzana;
    private int lote;
    private String nombre;
    private Lote[][] lotes;
    
    public Barrio(String unNombre, int unM, int unL){
        nombre = unNombre;
        setManzana(unM);
        setLote(unL);
        lotes = new Lote[getManzana()][getLote()];
        
        for(int i = 0; i < getManzana(); i++){
            for(int j = 0; j < getLote(); j++){
                Lote aux = new Lote();
                lotes[i][j] = aux;
            }
        }
    }

    public int getManzana() {
        return manzana;
    }

    public void setManzana(int manzana) {
        this.manzana = manzana;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarComprador(Comprador unComprador,int unM, int unL){
        if(!lotes[unM][unL].vendido()){
            lotes[unM][unL].setComprador(unComprador);
        }
    }
    
    public void incrementarManzana(int unaManzana, double unPorcentaje){
        //seguir
    }
    
    public String imprimir(int iM, int iL){
        String aux;
        aux = "manzana: "+ iM +" "+ "Lote: "+iL+lotes[iM][iL].toString();
        return aux;
    }
}
