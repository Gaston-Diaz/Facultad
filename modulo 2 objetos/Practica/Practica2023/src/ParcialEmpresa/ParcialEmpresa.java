/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParcialEmpresa;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
/**
 *
 * @author gasto
 */
public class ParcialEmpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        //GENERAR UN DIRECTOR
        String auxNomD = GeneradorAleatorio.generarString(10);
        int auxAnioD = GeneradorAleatorio.generarInt(2024);
        int auxDniD = GeneradorAleatorio.generarInt(3000);
        double auxSueldoD = GeneradorAleatorio.generarDouble(3000);
        double auxViaticosD = GeneradorAleatorio.generarDouble(3000);
        Director d = new Director(auxNomD,auxAnioD,auxDniD,auxSueldoD,auxViaticosD);
        
        //GENERAR EMPRESA
        String auxNomE = GeneradorAleatorio.generarString(10);
        String auxDirE = GeneradorAleatorio.generarString(10);
        System.out.println("Ingrese la cantidad de sucursales");
        int cant = Lector.leerInt();
        Empresa e = new Empresa(auxNomE,auxDirE,d,cant);
        
        //Mostrar empresa
        System.out.println(e.toString());
        
    }
    
}
