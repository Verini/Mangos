/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mangos;

import java.util.ArrayList;


/**
 *
 * @author jai
 */
public class Analisis {

   // private Numero[] datos;
   // private ArrayList<Integer> BasesDatos;
    private Columnas Columna;
    private Color Color ;
   
   // private  Estudio Columna = new Columnas(datos, BasesDatos);
   // private Estudio Color = new Color(datos, BasesDatos);
    

    public void setBasesDatos(ArrayList BasesDatos) {
     
        Columna.setBasesDatos(BasesDatos);
       
    }

    public Analisis(ArrayList BasesDatos) {
       
        Numero[] datos = new Numero[37];
                   
        for (int i = 0; i < datos.length; i++) {
            datos[i] = new Numero();
            // System.out.println(this.datos[i]);

        }
       

        
         this.Columna = new Columnas(datos, BasesDatos);
         this.Color = new Color(datos, BasesDatos);
          
         
      
     
        //System.out.println("akiii siii " + this.datos[this.BasesDatos.get(8)].getColumna());
        //this.verBasesDatos();
    }

    public void analisis() {

    }

    @Override
    public String toString() {
       return ( this.Columna.toString());
    }

  
    
public String verColum() {
       
     
     this.verColumnas();
     
     System.out.println( "Mayor nuvero de veces seguidas Col 1: " + this.Columna.MayorSeguida(1));
     System.out.println( "Mayor nuvero de veces seguidas Col 2: " + this.Columna.MayorSeguida(2));
     System.out.println( "Mayor nuvero de veces seguidas Col 3: " + this.Columna.MayorSeguida(3));
     
     int tam = this.Columna.MayorSeguida(1);
     for (int i=0;i<=tam;i++){
         System.out.println( "Col 1 . Veces repetidas iguales a "+ i + ": " + this.Columna.MayorSeguida(1,i));
     }
     
     tam = this.Columna.MayorSeguida(2);
     for (int i=0;i<=tam;i++){
         System.out.println( "Col 2 . Veces repetidas iguales a "+ i + ": " + this.Columna.MayorSeguida(2,i));
     }
     
     tam = this.Columna.MayorSeguida(3);
     for (int i=0;i<=tam;i++){
         System.out.println( "Col 3 . Veces repetidas iguales a "+ i + ": " + this.Columna.MayorSeguida(3,i));
     }
     

System.out.println( "Cantidad de ceros en Columna 1: " + this.Columna.totalCero());


return "gcgcg";
 } 

public String verColumnas(){
        String Valor = "";
        int tTotal = this.Columna.totalColumna();
        int tCol = this.Columna.totalColumnaEn(1);
        Valor = "\nTotal de numeros: " + this.Columna.getTamBasesDatos();
        Valor =  Valor + "\nTotal que son 0: " + this.Columna.totalCero()+ "\n";
        Valor = Valor + "Tatal que son columnas: " + tTotal + "\n";
     
        float por= (float)((float)tCol/(float)tTotal)* 100;
        Valor = Valor +  "\tColumna 1: " + tCol +"   "+ String.format("%.2f", por) + "%\n";
        
        tCol = this.Columna.totalColumnaEn(2);
        por= (float)((float)tCol/(float)tTotal)* 100;
        Valor = Valor +  "\tColumna 2: " + tCol +"   "+ String.format("%.2f", por) + "%\n";
    
        tCol = this.Columna.totalColumnaEn(3);
        por= (float)((float)tCol/(float)tTotal)* 100;
        Valor = Valor +  "\tColumna 3: " + tCol + "   "+ String.format("%.2f", por) + "%\n";
        System.out.println( Valor);
        return Valor;
    }


/**
 * Todas las apuestas y datos que sacamso de dos columnas.
 * @return 
 */
public String verDosColumnas(){

   return datosDosColumnas();
}

private String datosDosColumnas(){
     String Valor = "\nConteo de dos columnas : \n";
     
     Valor = Valor +  "\tColumna 1,2: " + this.Columna.conteoDosColumnas(1, 2) + " Columna 3:"+ this.Columna.totalColumnaEn(3) +"\n";
     
     
     
     Valor = Valor +  "\tColumna 1,3: " + this.Columna.conteoDosColumnas(1, 3)+ " Columna 2:"+ this.Columna.totalColumnaEn(2) +"\n";
     Valor = Valor +  "\tColumna 2,3: " + this.Columna.conteoDosColumnas(3, 2)+ " Columna 1:"+ this.Columna.totalColumnaEn(1) +"\n";
     System.out.println( Valor);
     
     
    this.Columna.ganasApostandoDosCol(1, 2);
    this.Columna.ganasApostandoDosCol(3, 2);
    this.Columna.ganasApostandoDosCol(1, 3);
    
    
    return Valor;

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
 /* Ver algo*/
}
