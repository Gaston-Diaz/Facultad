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
public class Estante {
    private int df;
    private Libro[] libros;
    private int diml;
    
    //Constructor vacio
    public Estante(){
        df = 20;
        libros = new Libro[df];
        for(int i = 0; i < df; i++){
            libros[i] = null;
        }
        diml = 0;
    }
        public Estante(int unDf){
        df = unDf;
        libros = new Libro[df];
        for(int i = 0; i < df; i++){
            libros[i] = null;
        }
        diml = 0;
    }
    public int cantidadLibros(){
        return diml;
    }
    public boolean estaLleno(){
        return diml > df;
    }
    public void agregarLibro(Libro unLibro){
        if(!this.estaLleno()){
            libros[diml] = unLibro;
            diml++;
        }
        
    }
    public Autor buscarLibro(String unNombre){
       boolean ok = false;  //para cortar si lo encontre
       Autor a = null;     //para guardar el autor si lo encuentro
       int i= 0;           //indice para avanzar en el vector
       while((i < diml) && (!ok)){ //si no llegue al final y no encontre al autor
           if (libros[i].getTitulo().equals(unNombre)) {//si es el autor
                a =  libros[i].getPrimerAutor(); //guardo los datos del autor
                ok = true;                  //cambio el estado el ok
            }
           else{
               i++;//incremento el indice para avanzar
           }
        }
        return a;//retorno el autor o null si no lo encontre
        }
}
