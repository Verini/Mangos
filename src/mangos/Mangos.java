/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mangos;

import apuestas.ApuestaCambioColuFila;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import seguir.SeguirCambioColumnasDocenas;


/**
 *
 * @author Andrés
 */
public class Mangos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      
    // utilizarAleatorio();
    // utilzarDatos();
    utilzarDatosColumFila();
      //  seguir();
    }
    
    
    
    public static void seguir(){
        Scanner entrada = new Scanner(System.in);
        int nuevoDato;
        System.out.print("Ingrese numero: "); 
        SeguirCambioColumnasDocenas Datos =new SeguirCambioColumnasDocenas(0); 
        while(true){
            nuevoDato = entrada.nextInt();
            Datos.ingresNuevoDatos(nuevoDato);
            Datos.showDatos();
            System.out.print("Ingrese numero: ");
        }
    }
    public static void utilizarAleatorio() {

        ArrayList BasesDatos = new ArrayList<>();
        
       

        Random rand = new Random();
        int x = rand.nextInt(100);
        for (int i = 0; i < 100;i++) {

            BasesDatos.add((int) (Math.random() * (37 - 0)));
            // System.out.println(BasesDatos.get(i));

        }

        
       ApuestaCambioColuFila Apu = new ApuestaCambioColuFila(BasesDatos);
      
                
        Analisis Juego = new Analisis(BasesDatos);
        

        System.out.println("___________________________________________");
  //Juego.toString();
//Juego.AnalizaApuesta();
      // Juego.verFuncionesColumnas();
     //  Juego.analizarElCambioEnApuestas();
        //    Juego.verNumeros(33);
       //  Juego.verFuncionesLineas();
        //Juego.verFuncionesDocenas();
      Juego.verFuncionesCombinadas();
    }
    
    
   public static void utilzarDatosColumFila() {

        ArrayList BasesDatos = new ArrayList<>();
        int[] datos = {1,1,36,1};
           

     
        for (int i = 0; i < datos.length; i++) {

            BasesDatos.add(datos[i]);

        }
       ApuestaCambioColuFila Apu = new ApuestaCambioColuFila(BasesDatos);
        Analisis Juego = new Analisis(BasesDatos);

        System.out.println("___________________________________________");
       // Juego.toString();
  //Juego.toString();
//Juego.AnalizaApuesta();
        //Juego.verFuncionesColumnas();
      
        
        // Juego.verFuncionesLineas();
        //Juego.verFuncionesDocenas();
       Juego.verFuncionesCombinadas();

    }



    

    public static void utilzarDatos() {

        ArrayList BasesDatos = new ArrayList<>();
        int[] datos = {1,1, 1, 2,2};
           
            
            
            
            /*{19, 25, 10, 5, 1, 32, 21, 2, 14, 20, 20, 12, 12, 35, 26, 10,28, 34, 21, 24, 13, 5, 18, 6, 33, 26, 9, 34, 9, 1, 3, 5, 20, 19, 1, 0, 32, 32, 33, 30, 6, 18, 8, 5, 23, 18, 7, 25, 36, 14, 16, 6, 18, 9, 6, 12, 15, 32, 1, 9, 30, 23, 1, 2, 17, 9, 14, 22, 12, 10, 30, 22, 2,
            4, 6, 6, 35, 5, 32, 6, 4, 36, 10, 5, 34, 13, 16, 1, 8, 19, 35, 25, 29, 27, 0, 27, 16, 24, 32, 29, 25,
            19, 25, 24, 17, 21, 6, 6, 14, 33, 30, 7, 32, 20, 4, 14, 9, 32, 28, 36, 0, 26, 36, 15, 26, 27, 17, 35, 5, 17, 19, 23, 29, 23, 35, 1, 4, 23, 3, 28, 10, 36, 23, 18, 7, 35, 5, 23, 9, 19, 5, 5, 20, 9, 32, 5, 18, 6, 18, 18, 27, 36, 19, 6, 34, 32, 21, 17, 32, 25, 32, 6, 32, 7, 18, 20, 0, 31, 2, 27, 34, 20, 12, 14, 10, 27, 10, 27, 6, 20, 12, 22,
            30, 10, 1, 36, 32, 0, 22, 4, 24, 26, 28, 33, 30, 15, 21, 29, 27, 31};
*/
        for (int i = 0; i < datos.length; i++) {

            BasesDatos.add(datos[i]);

        }

        Analisis Juego = new Analisis(BasesDatos);

        System.out.println("___________________________________________");
       // Juego.toString();
  Juego.toString();
Juego.AnalizaApuesta();
        //Juego.verFuncionesColumnas();
      
        
        // Juego.verFuncionesLineas();
        //Juego.verFuncionesDocenas();
        //Juego.verFuncionesCombinadas();

    }

}
