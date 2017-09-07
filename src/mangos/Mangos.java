/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mangos;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Andrés
 */
public class Mangos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                     
           Random rand = new Random();
           int x = rand.nextInt(100);
           
           ArrayList BasesDatos = new ArrayList<>();
           for(int i=0;i <100 ;i++){
                   
               BasesDatos.add((int)(Math.random()*(37-0)));
         //  System.out.println(BasesDatos.get(i));
            
           }
     
           Analisis Juego =  new Analisis(BasesDatos);
           Juego.analisis();
           Juego.verColumnasRepetidas();
        
    }
    
}
