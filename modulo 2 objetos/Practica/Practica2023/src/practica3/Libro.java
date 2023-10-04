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
public class Libro {
    private String titulo;
    private String editorial;
    private int anioEdicion;
    private String ISBN;
    private double precio;
    private Autor primerAutor;
    
    //Constructores
    public Libro(){
    }
    public Libro(String unTitulo,String unaEditorial,int unAnio, String unISBN,double unPrecio, Autor unAutor){
        titulo = unTitulo;
        editorial = unaEditorial;
        anioEdicion = unAnio;
        ISBN = unISBN;
        precio = unPrecio;
        primerAutor = unAutor;
    }
    //getter y setter

    public String getTitulo() {
        return titulo;
    }
    public String getEditorial() {
        return editorial;
    }
    public int getAnioEdicion() {
        return anioEdicion;
    }
    public String getISBN() {
        return ISBN;
    }
    public double getPrecio() {
        return precio;
    }
    public Autor getPrimerAutor(){
        return primerAutor;
    }
            
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    } 
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public void setAnioEdicion(int anioEdicion) {
        this.anioEdicion = anioEdicion;
    } 
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setPrimerAutor(Autor unAutor){
        primerAutor = unAutor;
    }
    
    @Override
    public String toString(){
        String aux;
        aux = "Titulo: "+getTitulo()+" editorial: "+getEditorial()+" año edicion: "+getAnioEdicion()+" ISBN: "+getISBN()+" precio: "+getPrecio() +" datos autor: "+ getPrimerAutor().toString();
        return aux;
    }
}
