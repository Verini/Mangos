/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apuestas;

import java.util.ArrayList;
import mangos.Columnas;
import mangos.Numero;

/**
 *
 * @author jai
 */
public class ApuestaCambioColuFila {
    
    protected Numero[] datos;
    protected ArrayList<Integer> BasesDatos;
   
    public ApuestaCambioColuFila(ArrayList BasesDatos) {
   
        Numero[] CrearDatos = new Numero[37];

        for (int i = 0; i < CrearDatos.length; i++) {
            CrearDatos[i] = new Numero();
            // System.out.println(this.datos[i]);
        }
        this.datos = CrearDatos;  
        this.BasesDatos = BasesDatos;
        
        
        
        System.out.println(mayorCambioCambio());
    }
     
    //detectamos si anterios es igual a post desde el putno de vista de las columnas y filas.
    boolean isCambio(int ind,int anterior, int post){
            boolean resul=false;
            
          if((this.isCC(ind, anterior))&&(this.isCC(anterior,post))){
              
              resul=true;
           }
            
            return resul;
    }
    
     boolean isCC(int anterior, int post){
            boolean resul=false;
            
          if((datos[BasesDatos.get(anterior)].getColumna() != datos[BasesDatos.get(post)].getColumna()) ||
          (datos[BasesDatos.get(anterior)].getDocena() != datos[BasesDatos.get(post)].getDocena())){
              resul=true;
           }
            
            return resul;
    }
    
    
    int mayorCambioCambio(){
        
        int cont=0;
        int aux=0;
        int tam = BasesDatos.size() - 1;/*Se analiza el penultimo y ultimo siempre*/ 
       int i=0;
       while(i < tam){
System.out.print(BasesDatos.size());//de 1..po eso se resta uno
            int datoIndicador = BasesDatos.get(i);//3 3 2 2
            int datoA = BasesDatos.get(i + 1);//3 2 2 1
            int datoB = BasesDatos.get(i + 2);//3 2 2 1
           if( !this.isCambio(datoIndicador,datoA ,datoB)){
               i=i+2;
               aux++;   
           }else{
                if(cont<aux){
                    cont = aux;
                }
                aux = 0;
                i++;
           }
        }
           if(cont<aux){
                    cont = aux;
                }
        
        
        return cont;
    }
}
