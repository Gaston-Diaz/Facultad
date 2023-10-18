/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

/**
 *
 * @author Diego
 */
public class Evento extends Recital{
    private String motivo;
    private String contratante;
    private String dia;
    
    public Evento(String unMotivo, String unContratante, String unDia, String nombreBanda, int cant){
        super(nombreBanda,cant);
        setMotivo(unMotivo);
        setContratante(unContratante);
        setDia(unDia);
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getContratante() {
        return contratante;
    }

    public void setContratante(String contratante) {
        this.contratante = contratante;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
    
    
    @Override
    public String actuar(){
        String cadena = super.actuar();
        String aux;
        if(getMotivo()== "beneficio"){
            aux = " Recuerden colaborar con… " + getContratante() + " " + cadena;
        }else{
            if(getMotivo()== "tv"){
                aux = " Saludos amigos televidentes "+ " " + cadena;
            }else{
                aux = "Un feliz cumpleaños para… " +  getContratante()+ " "+ cadena;
            }
        }
        return aux;
    }
    
    @Override
    public double calcularCosto(){
        double aux;
        if(getMotivo() == "beneficio"){
            aux = 0;
        }else{
            if(getMotivo() == "tv"){
                aux = 50000;
            }else{
                aux = 150000;
            }
        }
        return aux;
    }
    
}
