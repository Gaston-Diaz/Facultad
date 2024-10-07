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
public class Libro {
    private String titulo;
    private Autor primerAutor;
    private String editorial;
    private String añoEdicion;
    private int ISBN;
    private double precio;
    
    //constructores
    public Libro(){}
    
    public Libro(String unTitulo, Autor unAutor, String unaEditorial, String unAño, int unISBN, double unPrecio){
        titulo = unTitulo;
        primerAutor = unAutor;
        editorial = unaEditorial;
        añoEdicion = unAño;
        ISBN = unISBN;
        precio = unPrecio;
    }
    
    //getter y setter

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getPrimerAutor() {
        return primerAutor;
    }

    public void setPrimerAutor(Autor autor) {
        this.primerAutor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAñoEdicion() {
        return añoEdicion;
    }

    public void setAñoEdicion(String añoEdicion) {
        this.añoEdicion = añoEdicion;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString(){
        String aux = "Titulo: " + getTitulo() + " Primer Autor: " + primerAutor.toString() + " editorial: " + getEditorial() + " año de edicion: " + getAñoEdicion() + " ISBN: " + getISBN() + " precio: " + getPrecio();
        return aux;
    }
}
