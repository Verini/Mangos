/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apuestas;

import java.util.ArrayList;
import mangos.Numero;

/**
 *
 * @author jai
 */
public class ApuestaColor {

    int vGWin;
    int vGLose;

    int vRWin;
    int vNWin;

    int vRLose;
    int vNLose;

    int cMayorSeguidasWin;
    int cMayorSeguidasLose;//Para ver cuantar te puede poner por debajo

    int cMayorSeguidasWinR;
    int cMayorSeguidasLoseR;

    int cMayorSeguidasWinN;
    int cMayorSeguidasLoseN;

    public int cantidaFicharApuesta(int dato) {
        return (dato * 2);
    }
//HAcer variante de k si pierdo 4 veces seguidas dejar de apostar.empezra de nuevo.
    public ApuestaColor(Numero[] datos, ArrayList<Integer> BasesDatos) {
        int tam = BasesDatos.size() - 1;
        this.vGWin = 0;
        this.vGLose = 0;

        this.vRWin = 0;
        this.vNWin = 0;

        this.vRLose = 0;
        this.vNLose = 0;

        this.cMayorSeguidasWin = 0;
        this.cMayorSeguidasLose = 0;//Para ver cuantar te puede poner por debajo

        this.cMayorSeguidasWinR = 0;
        this.cMayorSeguidasLoseR = 0;

        this.cMayorSeguidasWinN = 0;
        this.cMayorSeguidasLoseN = 0;

        int contRG = 0;
        int contNG = 0;
        int contRP = 0;
        int contNP = 0;
        int fichasR = 0;
        int fichasN = 0;
        
        
        for (int i = 0; i < tam; i++) {

            //si es rojo
            boolean colorAnterior = datos[BasesDatos.get(i)].isColor();
            boolean colorNext = datos[BasesDatos.get(i + 1)].isColor();

            //int ceroAnterior = BasesDatos.get(i);
            //int ceroNext = BasesDatos.get(i+1);
            //if((ceroAnterior != 0)&&(ceroNext != 0)){
            if (colorAnterior == colorNext) {
                this.vGWin++;
              
                if (colorAnterior == true) {
                  
                   // System.out.print(fichas );
                    this.vRWin++;
                     contRG++;
                     fichasR = (fichasR-1) + cantidaFicharApuesta(contRP);
                    //Seguidas_ganadas compruevo 
                    if (contRP > cMayorSeguidasLoseR) {
                        cMayorSeguidasLoseR = contRP;

                    }

                    contRP = 0;
                   

                } else {
                
                  //   System.out.print(fichas );
                    this.vNWin++;
                    //Seguidas_ganadas compruevo 
                    contNG++;
                    fichasN = (fichasN-1) + cantidaFicharApuesta(contNP);
                    if (contNP > cMayorSeguidasLoseN) {
                        cMayorSeguidasLoseN = contNP;

                    }

                    contNP = 0;
                    

                }

            } else {

                this.vGLose++;
               
                if (colorAnterior == true) {
                   
                    //  System.out.print(fichas );
                    fichasR = fichasR - cantidaFicharApuesta(contRP);
                    this.vRLose++;
                     contRP++;
                    
                     
                    
//Seguidas_ganadas compruevo 
                    if (contRG > cMayorSeguidasWinR) {
                        cMayorSeguidasWinR = contRG;
                    }

                   
                    contRG = 0;

                } else {
                  
                   //  System.out.print(fichas );
                    this.vNLose++;
                     fichasN = fichasN - cantidaFicharApuesta(contNP);
                     contNP++;
                      
                    if (contNG > cMayorSeguidasWinN) {
                        cMayorSeguidasWinN = contNG;

                    }
                   
                    contNG = 0;
                }
            }

        }
     System.out.println(fichasR  + " " +fichasN );
     
     if((contRG != 0)&&(contRG > this.cMayorSeguidasWinR)) {
                        this.cMayorSeguidasWinR = contRG;
     }
     if((contRP != 0)&&(contRP > this.cMayorSeguidasLoseR)) {
                        this.cMayorSeguidasLoseR = contRP;
     }
     
   
     if((contNG != 0)&&(contNG > this.cMayorSeguidasWinN)) {
                        this.cMayorSeguidasWinN = contNG;
     }
      
      
      if((contNP != 0)&&(contNP > this.cMayorSeguidasLoseN)) {
                        this.cMayorSeguidasLoseN = contNP;
     }
     
     ////////////////////////
     if( this.cMayorSeguidasLoseN>this.cMayorSeguidasLoseR){
          this.cMayorSeguidasLose =  this.cMayorSeguidasLoseN;
     }else{
         this.cMayorSeguidasLose =  this.cMayorSeguidasLoseR;
     }
     
     if( this.cMayorSeguidasWinN> this.cMayorSeguidasWinR){
          cMayorSeguidasWin =  cMayorSeguidasWinN;
     }else{
         cMayorSeguidasWin =  cMayorSeguidasWinR;
     }
     

    }

    @Override
    public String toString() {
        
        
        
        return verMayoresSPerdidas();
                
                
               /* + "\nApuestaColor{" + "vGWin=" + vGWin + ", \nvGLose=" + vGLose + ", \n vRWin=" + 
                vRWin + ", \n vNWin=" + vNWin + ", \n vRLose=" + vRLose + 
                ", \n vNLose=" + vNLose +
                ", \n cMayorSeguidasWinR=" + cMayorSeguidasWinR + ","
                + " \n cMayorSeguidasLoseR=" + cMayorSeguidasLoseR + 
                ", \n cMayorSeguidasWinN=" + cMayorSeguidasWinN + 
                ", \n cMayorSeguidasLoseN=" + cMayorSeguidasLoseN + '}';*/
                
                
   }

   private String verMayores(){            
           return "Mayor de veces Seguidas Win: \t" + cMayorSeguidasWin + 
                  "\nMayor de veces Seguidas Lose: \t" + cMayorSeguidasLose; 
   }
 
   private String verMayoresSGanadas(){            
           return "Mayor de veces Seguidas Win Rojo: \t" + cMayorSeguidasWinR + 
                  "\nMayor de veces Seguidas Win Negro: \t" + cMayorSeguidasWinN; 
   }
   
   private String verMayoresSPerdidas(){            
           return "Mayor de veces Seguidas Lose Rojo: \t" + cMayorSeguidasLoseR + 
                  "\nMayor de veces Seguidas Lose  Negro: \t" + cMayorSeguidasLoseN; 
   }
   
   
}
