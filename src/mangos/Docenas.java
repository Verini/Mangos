/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mangos;

import java.util.ArrayList;

/**
 *
 * @author Andrés
 */
public class Docenas extends Estudio {

    public Docenas(Numero[] datos, ArrayList BasesDatos) {
        super(datos, BasesDatos);
    }
    
     public int totalDocenasEn(int docena) {
        int totalDocenas = 0;
        for (int i = 0; i < Docenas.BasesDatos.size(); i++) {

            if (datos[BasesDatos.get(i)].getDocena() == docena) {
                totalDocenas++;
            }
        }
        return totalDocenas;
    }
    
    public int totalDocenas() {
        return totalDocenasEn(1) + totalDocenasEn(2)+totalDocenasEn(3);
    }
    
    public int vecesRepetidas(int docena, int cantidad){

        int cant=0;
                
        int n_repet=0;
        
        int anterior;
        int actual;
        
        
        
        int tam = Docenas.BasesDatos.size()-1 ;
        
        for (int i = 0; i < tam ; i++) { 
                
                if (datos[BasesDatos.get(i)].getDocena() == docena) {
                        
                        anterior= datos[BasesDatos.get(i)].getDocena();
                        actual = datos[BasesDatos.get(i+1)].getDocena();
                            
                          
                              
                              
                              
                        if(anterior == actual){
                               
                                n_repet++;
                        }else{
                             if( n_repet == cantidad ){
                                 
                                 
                                 if(actual==0){
                                   //   System.out.println("anterio:  "+ anterior + " actual ; " +actual + "cant " + cant);
                                 
                                 }
                                 
                                 cant++;
                             } 
                            
                             n_repet = 0;
                          
                          
                        }
                        
                }
                   
        }
        
        
        
         if( n_repet == cantidad ){
                                 cant++;
                             } 
        return cant;
    
 


} 
    
    
    
    
    
    
    public int MayorSeguida(int docena, int num) {
        int Mayor_seguida = 0;
        int cont1 = -1;

        for (int i = 0; i < Columnas.BasesDatos.size(); i++) {
            if (datos[BasesDatos.get(i)].getDocena() == docena) {

                cont1++;
                if (num == cont1) {
                    Mayor_seguida++;
                }

            } else {
                cont1 = -1;
            }

        }
        return Mayor_seguida;
    }

    public int MayorSeguida(int docena) {
        int Mayor_seguida = 0;
        int cont1 = -1;

        for (int i = 0; i < Columnas.BasesDatos.size(); i++) {
            if (datos[BasesDatos.get(i)].getDocena() == docena) {

                cont1++;

                if (Mayor_seguida <= cont1) {
                    Mayor_seguida = cont1;

                }

            } else {

                cont1 = -1;

            }

        }
        return Mayor_seguida;
    }

 public int conteoDosColumnas(int col1,int col2){
        return this.totalDocenasEn(col1) + this.totalDocenasEn(col2);
 }
    

 public boolean ganasApostandoDosCol(int col1,int col2){
     
           int fichasGan = this.totalDocenasEn(col1) + this.totalDocenasEn(col2);
           
           int cero = totalCero();
           int fichasPer = ((totalDocenas()-fichasGan) + cero)*2;
           
           int val = fichasGan - fichasPer ;
           System.out.println("Columnas " + col1 + " "+ col2 + ": " + val);
           return true;
 }

    /**
     * Cantidad de 0 que hay en las tres docenas.
     *
     * @return La suma de la cantidad de 0 de las 3 docenas.
     */
    public int totalCero() {
        int cont1 = 0;

        for (int i = 0; i < Columnas.BasesDatos.size(); i++) { 
                    if(datos[BasesDatos.get(i)].getValor() == 0) {
                       
                         cont1++;
                    }
        }
        return cont1++;
    }

/**
*    Esta funcion devuelve la cantidad de veces qeu se acierta apostando a no repetir
*   en docenas, mirara cuando repita n_repetir veces y en la docena docena.
*    
     * @param docena    Columna que seleccionamos.
     * @param n_repetir  Cuando se apuesta a repetir.
     * @return cont1 que sera el numero de veces que se acierta.
*/       
public int aNoRepetir(int docena, int n_repetir){
        int cont1 = 0;
        int contR = 0;
        
        int datoA;
        int datoB;
        
        int tam = Columnas.BasesDatos.size()-1;
        
        for (int i = 0; i < tam ; i++) { 
                
                if (datos[BasesDatos.get(i)].getDocena() == docena) {
                        contR++;
                        
                        if(contR == n_repetir){
                            
                            datoA = datos[BasesDatos.get(i)].getDocena();
                            datoB = datos[BasesDatos.get(i+1)].getDocena();
                            
                            if(datoA !=datoB){
                               
                                 cont1++;
                            }
                        }
                }else{
                        contR = 0;
                
                }
                   
        }
        return cont1++;
}
/**
*    Esta funcion devuelve la cantidad de veces qeu se acierta apostando a repetir
*   en docenas, mirara cuando repita n_repetir veces y en la docena docena.
*    
     * @param docena    Columna que seleccionamos.
     * @param n_repetir  Cuando se apuesta a repetir.
     * @return cont1 que sera el numero de veces que se acierta.
*/     

public int aRepetir(int docena, int n_repetir){
        int cont1 = 0;
        int contR = 0;
        
        int datoA;
        int datoB;
        
        int tam = Columnas.BasesDatos.size()-1;
        
        for (int i = 0; i < tam ; i++) { 
                
                if (datos[BasesDatos.get(i)].getDocena() == docena) {
                        contR++;
                        
                        if(contR == n_repetir){
                            
                            datoA = datos[BasesDatos.get(i)].getDocena();
                            datoB = datos[BasesDatos.get(i+1)].getDocena();
                            
                            if(datoA ==datoB){
                               
                                 cont1++;
                            }
                        }
                }else{
                        contR = 0;
                
                }
                   
        }
        return cont1++;
}

/**
*    Esta funcion devuelve la cantidad de veces que se puede apostar a repetir
*   n_repetir en todo nuesto vecotr.
*    
     * @param docena    Columna que seleccionamos.
     * @param n_repetir  Cuando se apuesta a repetir.
     * @return cont1 que sera el numeor de veces que se puesta.
*/       
public int vecesRepetir(int docena, int n_repetir){
        int cont1 = 0;
        int contR = 0;
        
        int datoA;
        int datoB;
        
        int tam = Columnas.BasesDatos.size()-1;
        
        for (int i = 0; i < tam ; i++) { 
                
                if (datos[BasesDatos.get(i)].getDocena() == docena) {
                        contR++;
                        
                        if(contR == n_repetir){                     
                                 cont1++;
                            
                        }
                }else{
                        contR = 0;
                
                }
                   
        }
        return cont1++;
}

    
}
