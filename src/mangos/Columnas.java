/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mangos;

import java.util.ArrayList;

/**
 *
 * @author Andrés Eloy Castro Manciny.
 * @author Jairo González Lemus.
 */
public class Columnas extends Estudio {

    public Columnas(Numero[] datos, ArrayList BasesDatos) {
        super(datos, BasesDatos);
    }
    
    public int totalColumnaEn(int columna) {
        int totalColumna = 0;
        for (int i = 0; i < Columnas.BasesDatos.size(); i++) {

            if (datos[BasesDatos.get(i)].getColumna() == columna) {
                totalColumna++;
            }
        }
        return totalColumna;
    }
    
    public int totalColumna() {
        return totalColumnaEn(1) + totalColumnaEn(2)+totalColumnaEn(3);
    }
    
    
    
    
    
    
    public int MayorSeguida(int columna, int num) {
        int Mayor_seguida = 0;
        int cont1 = -1;

        for (int i = 0; i < Columnas.BasesDatos.size(); i++) {
            if (datos[BasesDatos.get(i)].getColumna() == columna) {

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

    public int MayorSeguida(int columna) {
        int Mayor_seguida = 0;
        int cont1 = -1;

        for (int i = 0; i < Columnas.BasesDatos.size(); i++) {
            if (datos[BasesDatos.get(i)].getColumna() == columna) {

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
        return this.totalColumnaEn(col1) + this.totalColumnaEn(col2);
 }
    

 public boolean ganasApostandoDosCol(int col1,int col2){
     
           int fichasGan = this.totalColumnaEn(col1) + this.totalColumnaEn(col2);
           
           int cero = totalCero();
           int fichasPer = ((totalColumna()-fichasGan) + cero)*2;
           
           int val = fichasGan - fichasPer ;
           System.out.println("Columnas " + col1 + " "+ col2 + ": " + val);
           return true;
 }

    /**
     * Cantidad de 0 que hay en las tres columnas.
     *
     * @return La suma de la cantidad de 0 de las 3 columnas.
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
*   en columnas, mirara cuando repita n_repetir veces y en la columna columna.
*    
     * @param columna    Columna que seleccionamos.
     * @param n_repetir  Cuando se apuesta a repetir.
     * @return cont1 que sera el numero de veces que se acierta.
*/       
public int aNoRepetir(int columna, int n_repetir){
        int cont1 = 0;
        int contR = 0;
        
        int datoA;
        int datoB;
        
        int tam = Columnas.BasesDatos.size()-1;
        
        for (int i = 0; i < tam ; i++) { 
                
                if (datos[BasesDatos.get(i)].getColumna() == columna) {
                        contR++;
                        
                        if(contR == n_repetir){
                            
                            datoA = datos[BasesDatos.get(i)].getColumna();
                            datoB = datos[BasesDatos.get(i+1)].getColumna();
                            
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
*   en columnas, mirara cuando repita n_repetir veces y en la columna columna.
*    
     * @param columna    Columna que seleccionamos.
     * @param n_repetir  Cuando se apuesta a repetir.
     * @return cont1 que sera el numero de veces que se acierta.
*/     

public int aRepetir(int columna, int n_repetir){
        int cont1 = 0;
        int contR = 0;
        
        int datoA;
        int datoB;
        
        int tam = Columnas.BasesDatos.size()-1;
        
        for (int i = 0; i < tam ; i++) { 
                
                if (datos[BasesDatos.get(i)].getColumna() == columna) {
                        contR++;
                        
                        if(contR == n_repetir){
                            
                            datoA = datos[BasesDatos.get(i)].getColumna();
                            datoB = datos[BasesDatos.get(i+1)].getColumna();
                            
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
     * @param columna    Columna que seleccionamos.
     * @param n_repetir  Cuando se apuesta a repetir.
     * @return cont1 que sera el numeor de veces que se puesta.
*/       
public int vecesRepetir(int columna, int n_repetir){
        int cont1 = 0;
        int contR = 0;
        
        int datoA;
        int datoB;
        
        int tam = Columnas.BasesDatos.size()-1;
        
        for (int i = 0; i < tam ; i++) { 
                
                if (datos[BasesDatos.get(i)].getColumna() == columna) {
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



    /*
    public void verTotalColumnas() {

        System.out.println(this.total_c1 + "  " + this.total_c2 + "  " + this.total_c3);
        
        System.out.println(this.Mayor_seguida_c1 + " " + this.Mayor_seguida_c2 + " " + this.Mayor_seguida_c3);
        System.out.println(this.contNumVeces+ " "+  contTotalSecion);
    }
     */
}
