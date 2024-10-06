/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author gasto
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dl = 0;
        String local,visitante;
        int golesL, golesV;
        
        Partido [] partidos = new Partido[20];
        Partido p;
        visitante = GeneradorAleatorio.generarString(10);
        while(dl < 20 && !visitante.equals("zzz")){
            local = GeneradorAleatorio.generarString(10);
            golesV = GeneradorAleatorio.generarInt(11);
            golesL = GeneradorAleatorio.generarInt(11);
            p = new Partido(local,visitante,golesL,golesV);
            partidos[dl] = p;
            dl++;
            visitante = GeneradorAleatorio.generarString(10);
        }
        
        int i = 0;
        int cantBoca = 0;
        int cantRiver = 0;
        while(i < dl){
            if(partidos[i].hayGanador() && partidos[i].getGanador().equals("river")){
                cantRiver++;
            }
            if(partidos[i].getLocal().equals("boca")){
                cantBoca = cantBoca + partidos[i].getGolesLocal();
            }
            System.out.println(partidos[i].toString());
            i++;
        }
    }
    
}
