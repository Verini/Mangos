/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mangos;

/**
 *
 * @author jai
 */
public class Analisis {
    Numero[] datos;
    
    public Analisis() {
               
        this.datos = new Numero[37];
        
        for (int i=1; i < this.datos.length  ;i++){
            this.datos[i] = new Numero();
            System.out.println(this.datos[i]);
        }
                    
    }

    @Override
    public String toString() {
        String valor=""; 
        for (int i=1; i < this.datos.length  ;i++){
            valor =  "Analisis{" + "datos=" + this.datos[i] + '}';
             System.out.println(valor);
        }
        return valor;
    }
    /*
    *  Funciones estandar mirar dentro del vect basedatos hacer un conteo
    */
    /*
    public int contadorPar();
    public int contadorImpar();
    
    public int contadorRojo();
    public int contadorNegro();
    
    public int contadorMita1();
    public int contadorMita2();
    
    public int contadorFila1();
    public int contadorFila2();
    public int contadorFila3();
    public int contadorFila4();
    public int contadorFila5();
    public int contadorFila6();
    public int contadorFila7();
    public int contadorFila8();
    public int contadorFila9();
    public int contadorFila10();
    public int contadorFila11();
    public int contadorFila12();
    
    public int contadorColumna1();
    public int contadorColumna2();
    public int contadorColumna3();
    
    public int contadorDocena1();
    public int contadorDocena2();
    public int contadorDocena3();*/
    
}
