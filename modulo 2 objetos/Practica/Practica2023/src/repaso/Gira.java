/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

/**
 *
 * @author Diego
 */
public class Gira extends Recital{
    private String nombreGira;
    private Fecha[] fechas;
    private int act;
    private int diml;
    
    
    public Gira(String unNombreGira, int cantFechas, String nombreBanda, int cantTemas){
        super(nombreBanda,cantTemas);
        setNombreGira(unNombreGira);
        fechas = new Fecha[cantFechas];
        act = 0;
        diml = 0;
    }

    public String getNombreGira() {
        return nombreGira;
    }

    public void setNombreGira(String nombreGira) {
        this.nombreGira = nombreGira;
    }

    public int getAct() {
        return act;
    }

    public void setAct(int act) {
        this.act = act;
    }
    
    public void agregarFecha(Fecha unaFecha){
        fechas[diml] = unaFecha;
        diml = diml + 1;
    }
    
    @Override
    public String actuar(){
        String cadena = super.actuar();
        String aux = " Buenas noches " + fechas[act].getCiudad()+ " ";
        act = act + 1;
        aux = aux + cadena;
        return aux;
    }
    
    @Override
    public double calcularCosto(){
        double aux;
        aux = 30000 * diml;
        return aux;
    }
    
}
