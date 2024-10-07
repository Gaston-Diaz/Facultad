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
public class Estanteria {
    private Libro[] libros;
    private int dl;
    
    //constructores
    
    public Estanteria(){
        libros = new Libro[20];
        dl = 0;
    }
    public int cantidadLibros(){
        return dl;
    }
    
    public boolean estaLLeno(){
        return dl == 20;
    }
    
    public void agregarLibro(Libro unLibro){
        libros[dl] = unLibro;
        dl++;
    }
    
    public String buscarLibro(String unTitulo){
        String aux = "no se encontro el libro";
        Libro auxL = null;
        int i = 0;
        while(i < dl && auxL == null){
            if(libros[i].getTitulo().equals(unTitulo)){
                auxL = libros[i];
            }
            i++;
        }
        if(auxL != null){
            return auxL.toString();
        }else{
            return aux;
        }

    }

    public String mostrarLibros(){
        String aux = "Estanteria: ";
        for(int i = 0; i < dl; i ++){
            aux = aux + libros[i].toString();
        }
        return aux;
    }
    
}
