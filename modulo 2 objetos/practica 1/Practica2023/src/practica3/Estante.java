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
    private Libro [] libros = new Libro[20];
    private int diml;
    
    //Constructor vacio
    public Estante(){
        for(int i = 0; i < 20; i++){
            libros[i] = null;
        }
        diml = 0;
    }
    
    public int cantidadLibros(){
        return diml;
    }
    public boolean estaLleno(){
        return diml > libros.length;
    }
    public void agregarLibro(Libro unLibro){
        if(!this.estaLleno()){
            libros[diml] = unLibro;
            diml++;
        }
    }
    public String buscarLibro(String unNombre){
       /* String aux;
        int i = 0;
        while(i < diml && libros[i].getTitulo().equals(unNombre)){
            i++;
        }
        if(i < diml){
            aux = libros[i].toString();
        }
        else{
            aux = "No se encontro el libro";
        }
        return aux;*/
       for (int i = 0; i < diml; i++) {
        if (libros[i].getTitulo().equals(unNombre)) {
            return libros[i].toString();
        }
        }
        return "No se encontró el libro";
        }
}
