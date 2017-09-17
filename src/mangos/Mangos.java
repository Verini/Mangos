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
        int[]  datos={35,27,0,0,18,29,27,7,23,20,3,11,2,12,36,29,23,15,34,0,19,30,1}
      
        for (int i = 0; i < 100; i++) {

          //  BasesDatos.add((int) (Math.random() * (37 - 0)));
            //  System.out.println(BasesDatos.get(i));

        }
        
        
        
          for (int i = 0; i < datos.length; i++) {

             BasesDatos.add( datos[i]);
        

        }
     
        
        
        
        
        
        
        Analisis Juego = new Analisis(BasesDatos);

        System.out.println("___________________________________________");
        //Juego.toString();

        Juego.verColumnas();

        System.out.println("___________________________________________");
        Juego.datosApuestaNoRepetir();
        //Juego.datosApuestaRepetir();
         Juego.nCalientes();
    }

}
