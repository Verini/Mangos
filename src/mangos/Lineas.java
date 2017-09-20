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
public class Lineas extends Estudio{

    public Lineas(Numero[] datos, ArrayList BasesDatos) {
        super(datos, BasesDatos);
    }
    
     public int totalLineasEn(int linea) {
        int totalLineas = 0;
        for (int i = 0; i < Lineas.BasesDatos.size(); i++) {

            if (datos[BasesDatos.get(i)].getLinea() == linea) {
                totalLineas++;
            }
        }
        return totalLineas;
    }
    
    public int totalLineas() {
        return totalLineasEn(1) + totalLineasEn(2)+totalLineasEn(3)+totalLineasEn(4) + totalLineasEn(5)+totalLineasEn(6)+totalLineasEn(7) + totalLineasEn(8)+totalLineasEn(9)+totalLineasEn(10) + totalLineasEn(11)+totalLineasEn(12);
    }
    
    public int vecesRepetidas(int linea, int cantidad){

        int cant=0;
                
        int n_repet=0;
        
        int anterior;
        int actual;
        
        
        
        int tam = Lineas.BasesDatos.size()-1 ;
        
        for (int i = 0; i < tam ; i++) { 
                
                if (datos[BasesDatos.get(i)].getLinea() == linea) {
                        
                        anterior= datos[BasesDatos.get(i)].getLinea();
                        actual = datos[BasesDatos.get(i+1)].getLinea();
                            
                          
                              
                              
                              
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
    
    
    
    
    
    
    public int MayorSeguida(int linea, int num) {
        int Mayor_seguida = 0;
        int cont1 = -1;

        for (int i = 0; i < Lineas.BasesDatos.size(); i++) {
            if (datos[BasesDatos.get(i)].getLinea() == linea) {

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

    public int MayorSeguida(int linea) {
        int Mayor_seguida = 0;
        int cont1 = -1;

        for (int i = 0; i < Lineas.BasesDatos.size(); i++) {
            if (datos[BasesDatos.get(i)].getLinea() == linea) {

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

    public int totalCero() {
        int cont1 = 0;

        for (int i = 0; i < Lineas.BasesDatos.size(); i++) { 
                    if(datos[BasesDatos.get(i)].getValor() == 0) {
                       
                         cont1++;
                    }
        }
        return cont1++;
    }



}

    