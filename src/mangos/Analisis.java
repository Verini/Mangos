/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mangos;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author jai
 */
public class Analisis {

   // private Numero[] datos;
   // private ArrayList<Integer> BasesDatos;
    private Columnas Columna;
    private Color Color ;
   private Docenas Docena;
   private Lineas Linea;
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
         this.Docena= new Docenas(datos, BasesDatos);
         this.Linea = new Lineas(datos, BasesDatos);  
         
      
     
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
     for (int i=1;i<=tam;i++){
          
          System.out.println( "Col 1 . Veces repetidas iguales a "+ i + ": " + this.Columna.vecesRepetidas(1,i));
     
     
     }
     
     tam = this.Columna.MayorSeguida(2);
     for (int i=1;i<=tam;i++){
         System.out.println( "Col 2 . Veces repetidas iguales a "+ i + ": " + this.Columna.vecesRepetidas(2,i));
     }
     
     tam = this.Columna.MayorSeguida(3);
     for (int i=1;i<=tam;i++){
         System.out.println( "Col 3 . Veces repetidas iguales a "+ i + ": " + this.Columna.vecesRepetidas(3,i));
     }
     

System.out.println( "Cantidad de ceros en Columna 1: " + this.Columna.totalCero());


return "gcgcg";
 } 

public String verDocen() {
       
     
     this.verDocenas();
     
     System.out.println( "Mayor nuvero de veces seguidas Docena 1: " + this.Docena.MayorSeguida(1));
     System.out.println( "Mayor nuvero de veces seguidas Docena 2: " + this.Docena.MayorSeguida(2));
     System.out.println( "Mayor nuvero de veces seguidas Docena 3: " + this.Docena.MayorSeguida(3));
   
    
     
     
     
     int tam = this.Docena.MayorSeguida(1);
     for (int i=1;i<=tam;i++){
          
          System.out.println( "Doce 1 . Veces repetidas iguales a "+ i + ": " + this.Docena.vecesRepetidas(1,i));
     
     
     }
     
     tam = this.Docena.MayorSeguida(2);
     for (int i=1;i<=tam;i++){
         System.out.println( "Doce 2 . Veces repetidas iguales a "+ i + ": " + this.Docena.vecesRepetidas(2,i));
     }
     
     tam = this.Docena.MayorSeguida(3);
     for (int i=1;i<=tam;i++){
         System.out.println( "Doce 3 . Veces repetidas iguales a "+ i + ": " + this.Docena.vecesRepetidas(3,i));
     }
     

System.out.println( "Cantidad de ceros en Docena 1: " + this.Docena.totalCero());


return "gcgcg";
 } 
public String verLine() {
       
     
     this.verLineas();
     
     System.out.println( "Mayor nuvero de veces seguidas Linea 1: " + this.Linea.MayorSeguida(1));
     System.out.println( "Mayor nuvero de veces seguidas Linea 2: " + this.Linea.MayorSeguida(2));
     System.out.println( "Mayor nuvero de veces seguidas Linea 3: " + this.Linea.MayorSeguida(3));
     System.out.println( "Mayor nuvero de veces seguidas Linea 4: " + this.Linea.MayorSeguida(4));
     System.out.println( "Mayor nuvero de veces seguidas Linea 5: " + this.Linea.MayorSeguida(5));
     System.out.println( "Mayor nuvero de veces seguidas Linea 6: " + this.Linea.MayorSeguida(6));
     System.out.println( "Mayor nuvero de veces seguidas Linea 7: " + this.Linea.MayorSeguida(7));
     System.out.println( "Mayor nuvero de veces seguidas Linea 8: " + this.Linea.MayorSeguida(8));
     System.out.println( "Mayor nuvero de veces seguidas Linea 9: " + this.Linea.MayorSeguida(9));
     System.out.println( "Mayor nuvero de veces seguidas Linea 10: " + this.Linea.MayorSeguida(10));
     System.out.println( "Mayor nuvero de veces seguidas Linea 11: " + this.Linea.MayorSeguida(11));
     System.out.println( "Mayor nuvero de veces seguidas Linea 12: " + this.Linea.MayorSeguida(12));
     
   
    
     
     
     
     int tam = this.Linea.MayorSeguida(1);
     for (int i=1;i<=tam;i++){
          
          System.out.println( "Line 1 . Veces repetidas iguales a "+ i + ": " + this.Linea.vecesRepetidas(1,i));
     
     }
     
     tam = this.Linea.MayorSeguida(2);
     for (int i=1;i<=tam;i++){
         System.out.println( "Line 2 . Veces repetidas iguales a "+ i + ": " + this.Linea.vecesRepetidas(2,i));
     }
     
     tam = this.Linea.MayorSeguida(3);
     for (int i=1;i<=tam;i++){
         System.out.println( "Line 3 . Veces repetidas iguales a "+ i + ": " + this.Linea.vecesRepetidas(3,i));
     }
     
     tam = this.Linea.MayorSeguida(4);
     for (int i=1;i<=tam;i++){
         System.out.println( "Line 4 . Veces repetidas iguales a "+ i + ": " + this.Linea.vecesRepetidas(4,i));
     }
     
     tam = this.Linea.MayorSeguida(5);
     for (int i=1;i<=tam;i++){
         System.out.println( "Line 5 . Veces repetidas iguales a "+ i + ": " + this.Linea.vecesRepetidas(5,i));
     }
     
     tam = this.Linea.MayorSeguida(6);
     for (int i=1;i<=tam;i++){
         System.out.println( "Line 6 . Veces repetidas iguales a "+ i + ": " + this.Linea.vecesRepetidas(6,i));
     }
     
     tam = this.Linea.MayorSeguida(7);
     for (int i=1;i<=tam;i++){
         System.out.println( "Line 7 . Veces repetidas iguales a "+ i + ": " + this.Linea.vecesRepetidas(7,i));
     }
     
     tam = this.Linea.MayorSeguida(8);
     for (int i=1;i<=tam;i++){
         System.out.println( "Line 8 . Veces repetidas iguales a "+ i + ": " + this.Linea.vecesRepetidas(8,i));
     }
     
     tam = this.Linea.MayorSeguida(9);
     for (int i=1;i<=tam;i++){
         System.out.println( "Line 9 . Veces repetidas iguales a "+ i + ": " + this.Linea.vecesRepetidas(9,i));
     }
     
     tam = this.Linea.MayorSeguida(10);
     for (int i=1;i<=tam;i++){
         System.out.println( "Line 10 . Veces repetidas iguales a "+ i + ": " + this.Linea.vecesRepetidas(10,i));
     }
     
     tam = this.Linea.MayorSeguida(11);
     for (int i=1;i<=tam;i++){
         System.out.println( "Line 11 . Veces repetidas iguales a "+ i + ": " + this.Linea.vecesRepetidas(11,i));
     }
     
     tam = this.Linea.MayorSeguida(12);
     for (int i=1;i<=tam;i++){
         System.out.println( "Line 12 . Veces repetidas iguales a "+ i + ": " + this.Linea.vecesRepetidas(12,i));
     }


System.out.println( "Cantidad de ceros en Linea 1: " + this.Linea.totalCero());


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

public String verDocenas(){
        String Valor = "";
        int tTotal = this.Docena.totalDocenas();
        int tCol = this.Docena.totalDocenasEn(1);
        Valor = "\nTotal de numeros: " + this.Docena.getTamBasesDatos();
        Valor =  Valor + "\nTotal que son 0: " + this.Docena.totalCero()+ "\n";
        Valor = Valor + "Tatal que son docenas: " + tTotal + "\n";
     
        float por= (float)((float)tCol/(float)tTotal)* 100;
        Valor = Valor +  "\tDocena 1: " + tCol +"   "+ String.format("%.2f", por) + "%\n";
        
        tCol = this.Docena.totalDocenasEn(2);
        por= (float)((float)tCol/(float)tTotal)* 100;
        Valor = Valor +  "\tDocena 2: " + tCol +"   "+ String.format("%.2f", por) + "%\n";
    
        tCol = this.Docena.totalDocenasEn(3);
        por= (float)((float)tCol/(float)tTotal)* 100;
        Valor = Valor +  "\tDocena 3: " + tCol + "   "+ String.format("%.2f", por) + "%\n";
        System.out.println( Valor);
        return Valor;
    }

public String verLineas(){
        String Valor = "";
        int tTotal = this.Linea.totalLineas();
        int tCol = this.Linea.totalLineasEn(1);
        Valor = "\nTotal de numeros: " + this.Linea.getTamBasesDatos();
        Valor =  Valor + "\nTotal que son 0: " + this.Linea.totalCero()+ "\n";
        Valor = Valor + "Tatal que son Lineas: " + tTotal + "\n";
     
        float por= (float)((float)tCol/(float)tTotal)* 100;
        Valor = Valor +  "\tLinea 1: " + tCol +"   "+ String.format("%.2f", por) + "%\n";
        
        tCol = this.Linea.totalLineasEn(2);
        por= (float)((float)tCol/(float)tTotal)* 100;
        Valor = Valor +  "\tLinea 2: " + tCol +"   "+ String.format("%.2f", por) + "%\n";
    
        tCol = this.Linea.totalLineasEn(3);
        por= (float)((float)tCol/(float)tTotal)* 100;
        Valor = Valor +  "\tLinea 3: " + tCol + "   "+ String.format("%.2f", por) + "%\n";
        
        tCol = this.Linea.totalLineasEn(4);
        por= (float)((float)tCol/(float)tTotal)* 100;
        Valor = Valor +  "\tLinea 4: " + tCol +"   "+ String.format("%.2f", por) + "%\n";
        
        tCol = this.Linea.totalLineasEn(5);
        por= (float)((float)tCol/(float)tTotal)* 100;
        Valor = Valor +  "\tLinea 5: " + tCol +"   "+ String.format("%.2f", por) + "%\n";
        
        tCol = this.Linea.totalLineasEn(6);
        por= (float)((float)tCol/(float)tTotal)* 100;
        Valor = Valor +  "\tLinea 6: " + tCol +"   "+ String.format("%.2f", por) + "%\n";
        
        tCol = this.Linea.totalLineasEn(7);
        por= (float)((float)tCol/(float)tTotal)* 100;
        Valor = Valor +  "\tLinea 7: " + tCol +"   "+ String.format("%.2f", por) + "%\n";
        
        tCol = this.Linea.totalLineasEn(8);
        por= (float)((float)tCol/(float)tTotal)* 100;
        Valor = Valor +  "\tLinea 8: " + tCol +"   "+ String.format("%.2f", por) + "%\n";
        
        tCol = this.Linea.totalLineasEn(9);
        por= (float)((float)tCol/(float)tTotal)* 100;
        Valor = Valor +  "\tLinea 9: " + tCol + "   "+ String.format("%.2f", por) + "%\n";
        
        tCol = this.Linea.totalLineasEn(10);
        por= (float)((float)tCol/(float)tTotal)* 100;
        Valor = Valor +  "\tLinea 10: " + tCol +"   "+ String.format("%.2f", por) + "%\n";
        
        tCol = this.Linea.totalLineasEn(11);
        por= (float)((float)tCol/(float)tTotal)* 100;
        Valor = Valor +  "\tLinea 11: " + tCol +"   "+ String.format("%.2f", por) + "%\n";
        
        tCol = this.Linea.totalLineasEn(12);
        por= (float)((float)tCol/(float)tTotal)* 100;
        Valor = Valor +  "\tLinea 12: " + tCol +"   "+ String.format("%.2f", por) + "%\n";
      
        
        System.out.println( Valor);
        return Valor;
    }

public void CombinacionDocenasColumnas(){
    
    this.Columna.CombinacionDocenasColumnas();
    
}

public void CombinacionDocenasColumnasLineas(){
    
    this.Columna.CombinacionDocenasColumnasLineas();
    
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

public String nCalientes(){

    return this.Columna.nCalientes();
}

public String noRepetir(int columna){
   
    System.out.println( "Apuesta: No se repite en la columan "+ columna+" en repetición x");
    int tam = this.Columna.MayorSeguida(columna)+1;
    
    int cont_ganadas=0;
    int cont_apuestas=0;
    int ganas=0;
    int pierdes=0;
    int total =0;
    float por;
    System.out.println( "Repet x  | Ganadas --> %  | Perdidas --> % | TotalApu | %GanadasT | %PerdidasT");
   
    
    for (int i=0;i<=tam&&tam!=1;i++){
        ganas = this.Columna.aNoRepetir(columna, i);
        total =this.Columna.vecesRepetir(columna, i);
        cont_ganadas = cont_ganadas +ganas;
        cont_apuestas=cont_apuestas+ total;
    }
    
    for (int i=1;i<=tam&&tam!=1;i++){
        ganas = this.Columna.aNoRepetir(columna, i);
        total =this.Columna.vecesRepetir(columna, i);
        pierdes=(total-ganas);
        
       
        por = (float)((float)(100*ganas)/(float)total);
        System.out.print( "\t"  + i + "   " + String.format("%02d",ganas ) + " --> " + String.format("%03.2f", por ) + "%   ");
        
        por = (float)((float)(100*pierdes)/(float)total);
        System.out.print( String.format("%02d",pierdes )+ " --> "+ String.format("%03.2f", por )+ "%    "+ String.format("%02d",total )+ "    \t" );
        
        por = (float)((float)(100*ganas)/(float)cont_apuestas);
        System.out.print( String.format("%03.2f", por )+ "%  " );
        
        por = (float)((float)(100*pierdes)/(float)cont_apuestas);
        System.out.println( String.format("%03.2f", por )+ "%      " );
        
       
        }
System.out.println( "Totales: "    + "\t" +cont_ganadas + "\t" + (cont_apuestas-cont_ganadas)+ "\t" +cont_apuestas);
 System.out.println("___________________________________________");
return "";
}

public String noRepetirDocena(int docena){
   
    System.out.println( "Apuesta: No se repite en la Docena "+ docena+" en repetición x");
    int tam = this.Docena.MayorSeguida(docena)+1;
    
    int cont_ganadas=0;
    int cont_apuestas=0;
    int ganas=0;
    int pierdes=0;
    int total =0;
    float por;
    System.out.println( "Repet x  | Ganadas --> %  | Perdidas --> % | TotalApu | %GanadasT | %PerdidasT");
   
    
    for (int i=1;i<=tam&&tam!=1;i++){
        ganas = this.Docena.aNoRepetir(docena, i);
        total =this.Docena.vecesRepetir(docena, i);
        cont_ganadas = cont_ganadas +ganas;
        cont_apuestas=cont_apuestas+ total;
    }
    
    for (int i=1;i<=tam&&tam!=1;i++){
        ganas = this.Docena.aNoRepetir(docena, i);
        total =this.Docena.vecesRepetir(docena, i);
        pierdes=(total-ganas);
        
       
        por = (float)((float)(100*ganas)/(float)total);
        System.out.print( "\t"  + i + "   " + String.format("%02d",ganas ) + " --> " + String.format("%03.2f", por ) + "%   ");
        
        por = (float)((float)(100*pierdes)/(float)total);
        System.out.print( String.format("%02d",pierdes )+ " --> "+ String.format("%03.2f", por )+ "%    "+ String.format("%02d",total )+ "    \t" );
        
        por = (float)((float)(100*ganas)/(float)cont_apuestas);
        System.out.print( String.format("%03.2f", por )+ "%  " );
        
        por = (float)((float)(100*pierdes)/(float)cont_apuestas);
        System.out.println( String.format("%03.2f", por )+ "%      " );
        
       
        }
System.out.println( "Totales: "    + "\t" +cont_ganadas + "\t" + (cont_apuestas-cont_ganadas)+ "\t" +cont_apuestas);
 System.out.println("___________________________________________");
return "";
}



public String ultimaNvecesRepe(){

            this.Columna.ultimaColumRepe();
//this.Columna.columnaUltTquiTaca();
this.Columna.vecesUltTquiTaca();



return "";


}



public String datosApuestaNoRepetir(){
    
    noRepetir(1);
    
    noRepetir(2);
     
      noRepetir(3);
    
  /*  noRepetirDocena(1);
    
        noRepetirDocena(2);
        
            noRepetirDocena(3);
    */  
    /*
    tam = this.Columna.MayorSeguida(2)+1;
   for (int i=1;i<=tam&&tam!=1;i++){
         System.out.println( "Apuesta: No se repite en la columan 2 en repetición " + i + ": "+ this.Columna.aNoRepetir(2, i));
         System.out.println("\tDe un total de apuestas de :" + this.Columna.vecesRepetir(2, i));
    }
   
    tam = this.Columna.MayorSeguida(3)+1;
   for (int i=1;i<=tam&&tam!=1;i++){
         System.out.println( "Apuesta: No se repite en la columan 3 en repetición " + i + ": "+ this.Columna.aNoRepetir(3, i));
        System.out.println("\tDe un total de apuestas de :" + this.Columna.vecesRepetir(3, i));
    }
   
    */
    
    return "";
}

public String datosApuestaRepetir(){
    
    
    
    int tam = this.Columna.MayorSeguida(1)+1;
    for (int i=1;i<=tam;i++){
         System.out.println( "Apuesta: No se repite en la columan 1 en repetición " + i + ": "+ this.Columna.aRepetir(1, i));
         System.out.println("\tDe un total de apuestas de :" + this.Columna.vecesRepetir(1, i));
    }
    
    tam = this.Columna.MayorSeguida(2)+1;
    for (int i=1;i<=tam;i++){
         System.out.println( "Apuesta: No se repite en la columan 2 en repetición " + i + ": "+ this.Columna.aRepetir(2, i));
         System.out.println("\tDe un total de apuestas de :" + this.Columna.vecesRepetir(2, i));
    }
   
    tam = this.Columna.MayorSeguida(3)+1;
    for (int i=1;i<=tam;i++){
         System.out.println( "Apuesta: No se repite en la columan 3 en repetición " + i + ": "+ this.Columna.aRepetir(3, i));
        System.out.println("\tDe un total de apuestas de :" + this.Columna.vecesRepetir(3, i));
    }
   
    
    return "";
}


/////////////////////////////////MIRAR COMO GANAR ESTA APUESTA/////////////////
  public void apuestaDosColumANoRepetirYCero(){
  
        int ganarC1 = this.Columna.vecesRepetidas(1,6);
        int ganarC2 = this.Columna.vecesRepetidas(2,6);
        int ganarC3 = this.Columna.vecesRepetidas(3,6);
        
        System.out.println("Se apuesta al cambio:");
        ////Perdidas son las repetida mayores a 6 si las tienes.
        int perderC1=0;
        int perderC2=0;
        int perderC3=0;
        int ceroC1=this.Columna.vecesRepetidasQueLleganCero(1,6);
        int ceroC2=this.Columna.vecesRepetidasQueLleganCero(2,6);
        int ceroC3=this.Columna.vecesRepetidasQueLleganCero(3,6);
        
        
        
        if(6 < this.Columna.MayorSeguida(1)){
                   
            int tam = this.Columna.MayorSeguida(1)+ 1;
            for (int i=7;i<=tam;i++){
                  System.out.println("\tCol 1 : i="+i+"  " + this.Columna.vecesRepetidas(1, i));
             if(this.Columna.vecesRepetir(1, i)!=0){
                 perderC1 = perderC1 + this.Columna.vecesRepetidas(1, i);
             }
            }
        
        }
   
        
       if(6 < this.Columna.MayorSeguida(2)){
                   
            int tam = this.Columna.MayorSeguida(2)+ 1;
            for (int i=7;i<=tam;i++){
                  System.out.println("\tCol 2 :" + this.Columna.vecesRepetidas(2, i));
             if(this.Columna.vecesRepetidas(2, i)!=0){
                 perderC2 = perderC2 + this.Columna.vecesRepetidas(2, i);
             }
            }
        
        }
        if(6 < this.Columna.MayorSeguida(3)){
                   
            int tam = this.Columna.MayorSeguida(3)+ 1;
            for (int i=7;i<=tam;i++){
                  System.out.println("\tCol3 :" + this.Columna.vecesRepetidas(3, i));
                if(this.Columna.vecesRepetir(3, i)!=0){
                 perderC3 = perderC3 + this.Columna.vecesRepetidas(3, i);
                }
            }
        
        }
      
        
        
        
        System.out.println("Col 1 . Veces repetidas iguales a 6: " + ganarC1 );
        System.out.println("Col 2 . Veces repetidas iguales a 6: " + ganarC2 );
        System.out.println("Col 3 . Veces repetidas iguales a 6: " + ganarC3 );
        System.out.println("Total Ganadas: " + (ganarC1 + ganarC2+ ganarC3) );
        
        
        System.out.println("Col 1 . Veces repetidas iguales a 6: " + perderC1 );
        System.out.println("Col 2 . Veces repetidas iguales a 6: " + perderC2 );
        System.out.println("Col 3 . Veces repetidas iguales a 6: " + perderC3 );
        System.out.println("Total Perdidas: " + (perderC1 + perderC2+ perderC3) );
        
        
        
         
         
         
         
         
        System.out.println("Veces 0 cuadno caen 0:" +ceroC1);
        System.out.println("Veces 0 cuadno caen 0:" +ceroC2);
        System.out.println("Veces 0 cuadno caen 0:" +ceroC3);
        System.out.println("Total Caidas en Cero: " + (ceroC1 + ceroC2+ ceroC3) );
        
        
        System.out.println("Fichas Perdidas: " + (perderC1 + perderC2+ perderC3)*5 );
        System.out.println("Fichas Ganadas en columnas: " + (ganarC1 + ganarC2+ ganarC3) );
        System.out.println("Fichas Caidas en Cero: " + (ceroC1 + ceroC2+ ceroC3)*(32) );
       int fichasG = (ganarC1 + ganarC2+ ganarC3)+((ceroC1 + ceroC2+ ceroC3)*(32));
       int fichasP = (perderC1 + perderC2+ perderC3)*5;
  
       System.out.println("Resultado: " + (fichasG - fichasP) );
        
  }
  public void apuestaDosColumANoRepetirYCero(int dato){
  
        int ganarC1 = this.Columna.vecesRepetidas(1,dato);
        int ganarC2 = this.Columna.vecesRepetidas(2,dato);
        int ganarC3 = this.Columna.vecesRepetidas(3,dato);
        
        System.out.println("Se apuesta al cambio:");
        ////Perdidas son las repetida mayores a 6 si las tienes.
        int perderC1=0;
        int perderC2=0;
        int perderC3=0;
        int ceroC1=this.Columna.vecesRepetidasQueLleganCero(1,dato);
        int ceroC2=this.Columna.vecesRepetidasQueLleganCero(2,dato);
        int ceroC3=this.Columna.vecesRepetidasQueLleganCero(3,dato);
        
        
        
        if(6 < this.Columna.MayorSeguida(1)){
                   
            int tam = this.Columna.MayorSeguida(1)+ 1;
            for (int i=dato+1;i<=tam;i++){
                  //System.out.println("\tCol 1 : i="+i+"  " + this.Columna.vecesRepetidas(1, i));
             if(this.Columna.vecesRepetir(1, i)!=0){
                 perderC1 = perderC1 + this.Columna.vecesRepetidas(1, i);
             }
            }
        
        }
   
        
       if(6 < this.Columna.MayorSeguida(2)){
                   
            int tam = this.Columna.MayorSeguida(2)+ 1;
            for (int i=dato+1;i<=tam;i++){
                //  System.out.println("\tCol 2 :" + this.Columna.vecesRepetidas(2, i));
             if(this.Columna.vecesRepetidas(2, i)!=0){
                 perderC2 = perderC2 + this.Columna.vecesRepetidas(2, i);
             }
            }
        
        }
        if(6 < this.Columna.MayorSeguida(3)){
                   
            int tam = this.Columna.MayorSeguida(3)+ 1;
            for (int i=dato+1;i<=tam;i++){
                  //System.out.println("\tCol3 :" + this.Columna.vecesRepetidas(3, i));
                if(this.Columna.vecesRepetir(3, i)!=0){
                 perderC3 = perderC3 + this.Columna.vecesRepetidas(3, i);
                }
            }
        
        }
      
        
        
        
        System.out.println("Col 1 . Veces repetidas iguales a 6: " + ganarC1 );
        System.out.println("Col 2 . Veces repetidas iguales a 6: " + ganarC2 );
        System.out.println("Col 3 . Veces repetidas iguales a 6: " + ganarC3 );
        System.out.println("Total Ganadas: " + (ganarC1 + ganarC2+ ganarC3) );
        
        
        System.out.println("Col 1 . Veces repetidas iguales a 6: " + perderC1 );
        System.out.println("Col 2 . Veces repetidas iguales a 6: " + perderC2 );
        System.out.println("Col 3 . Veces repetidas iguales a 6: " + perderC3 );
        System.out.println("Total Perdidas: " + (perderC1 + perderC2+ perderC3) );
        
        
        
         
         
         
         
         
        System.out.println("Veces 0 cuadno caen 0:" +ceroC1);
        System.out.println("Veces 0 cuadno caen 0:" +ceroC2);
        System.out.println("Veces 0 cuadno caen 0:" +ceroC3);
        System.out.println("Total Caidas en Cero: " + (ceroC1 + ceroC2+ ceroC3) );
        
        int fichasG = (ganarC1 + ganarC2+ ganarC3)+((ceroC1 + ceroC2+ ceroC3)*(36-4));
        int fichasP = (perderC1 + perderC2+ perderC3)*5;
  
        System.out.println("Fichas Perdidas: " +  fichasP );
        System.out.println("Fichas Ganadas en columnas: " + (ganarC1 + ganarC2+ ganarC3) );
        System.out.println("Fichas Caidas en Cero: " + (ceroC1 + ceroC2+ ceroC3)*(36-4) );
       
       System.out.println("Resultado: " + ((fichasG+32) - fichasP) );
        
  }
  
  

    private Object getContentPane() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
