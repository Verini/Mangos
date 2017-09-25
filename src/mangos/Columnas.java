/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mangos;

import static java.lang.reflect.Array.set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Andrés Eloy Castro Manciny.
 * @author Jairo González Lemus.
 */
public class Columnas extends Estudio {

///////////////////////////BASICA///////////////////////////////////////////////
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
        return totalColumnaEn(1) + totalColumnaEn(2) + totalColumnaEn(3);
    }

////////////////////////////////////////////////////////////////////////////////    
////////////////////////////////SOLO VER DATOS//////////////////////////////////    
    public String verColumnas() {

        this.verColumEncabezado();

        System.out.println("Mayor nuvero de veces seguidas Col 1: " + this.MayorSeguida(1));
        System.out.println("Mayor nuvero de veces seguidas Col 2: " + this.MayorSeguida(2));
        System.out.println("Mayor nuvero de veces seguidas Col 3: " + this.MayorSeguida(3) + "\n");
        
        
        for(int i= 1;i<=3;i++){
        int tam = this.MayorSeguida(i);
            if (tam != 0) {
                for (int j = 1; j <= tam; j++) {
                    System.out.println("Col "+ i +" . Veces repetidas iguales a " + j + ": " + this.vecesRepetidas(i, j));
                }
            } else {
                System.out.println("Col "+ i+" . Cambia siempre.");
            }
        }
        System.out.println();
         int tam = this.MayorTiquiTaca();
           if(tam!=0){
                for (int i = 1; i <= tam; i++) {
                    System.out.println("Veces que hace Tiquitaca iguales a " + i + ": " + this.tiquiTaca(i) +" Y cero: "+ tiquiTacaACero(i));
                }
            } else {
                System.out.println("Se Repite siempre.");
            }
     
           System.out.println();
     
           //Buscar el mayor tickita en columan
     /*      bucarmayortikitac;
           tikitacaseguidoentredoscolumnas;*/
          tiquiTacaDeColumna(1,1);
              
          tiquiTacaDeColumna(2,1);
            
          tiquiTacaDeColumna(3,1);
        
        System.out.println( "El Mayor TiquiTAca es : " +this.MayorTiquiTaca());
     
       //   System.out.println( this.tiquiTaca(1));
        verTiquiTacaColumColum();
        
        
        
        return "gcgcg";
    }

    private String verColumEncabezado() {

        String Valor = "";
        int tTotal = this.totalColumna();
        int tCol = this.totalColumnaEn(1);
        Valor = "\nTotal de numeros: " + this.getTamBasesDatos();
        Valor = Valor + "\nTotal que son 0: " + this.totalCero() + "\n";
        Valor = Valor + "Tatal que son columnas: " + tTotal + "\n";

        float por = (float) ((float) tCol / (float) tTotal) * 100;
        Valor = Valor + "\tColumna 1: " + tCol + "   " + String.format("%.2f", por) + "%\n";

        tCol = this.totalColumnaEn(2);
        por = (float) ((float) tCol / (float) tTotal) * 100;
        Valor = Valor + "\tColumna 2: " + tCol + "   " + String.format("%.2f", por) + "%\n";

        tCol = this.totalColumnaEn(3);
        por = (float) ((float) tCol / (float) tTotal) * 100;
        Valor = Valor + "\tColumna 3: " + tCol + "   " + String.format("%.2f", por) + "%\n";

        System.out.println(Valor);
        return Valor;
    }

////////////////////////////////////////////////////////////////////////////////   
/////////////////////////CONTEOS/////////////////////////////////////////////// 
/**
 *    Mira el cambio que fue a 0 en 1pro ejemplo estoy en 1 columna y cambia a 0;
 */
public int tiquiTacaACero(int cantTiquiTaca) {
        int cont1 = 0;
        int tiquiTaca = 0;

        int datoA;
        int datoB;
        int cero=0;
        int tam = Columnas.BasesDatos.size() -1;/*Se analiza el penultimo y ultimo siempre*/

        for (int i = 0; i < tam; i++) {

                datoA = datos[BasesDatos.get(i)].getColumna();//3 3 2 2
                datoB = datos[BasesDatos.get(i + 1)].getColumna();//3 2 2 1
       
                if (datoA != datoB) {
                    //3!=2 cont1=1,,2!"=1cont1=1
                        cont1++;
                        
                       if((cantTiquiTaca == cont1)&&(datoB==0)){
                         // System.out.println("ddddddddd"+cantTiquiTaca);
                             cero++;
                        }
                        
                        
                }else{
                    //3 3, 2 2 mayorTiquiTaca=1
                   
                    if(cantTiquiTaca== cont1){
                        
                       
                        tiquiTaca++;
                    }
                    cont1=0;
                }
               
            } 
        
        //Es cuando llega al final de BasesDatos y no hay repeticiones
      if(cantTiquiTaca == cont1){
          /* if((datoB==0)||(datoA==0)){
                                
                          cero++;
                        }*/
                       tiquiTaca++;
      }
        
        return cero;
    }    






//TiquiTaca
    public int tiquiTaca(int cantidad) {
        int cont1 = 0;
        int tiquiTaca = 0;

        int datoA=0;
        int datoB=0;

        int tam = Columnas.BasesDatos.size() -1;/*Se analiza el penultimo y ultimo siempre*/

        for (int i = 0; i < tam; i++) {

                datoA = datos[BasesDatos.get(i)].getColumna();//3 3 2 2
                datoB = datos[BasesDatos.get(i + 1)].getColumna();//3 2 2 1
       
                if (datoA != datoB) {
                    //3!=2 cont1=1,,2!"=1cont1=1
                        cont1++;
                }else{
                    //3 3, 2 2 mayorTiquiTaca=1
                    if(cantidad== cont1){
                        tiquiTaca++;
                    }
                    cont1=0;
                }
               
            } 
        
        //Es cuando llega al final de BasesDatos y no hay repeticiones
      if(cantidad == cont1){
                       tiquiTaca++;
      }
        
        return tiquiTaca;
    }
 
    //TiquiTaca
    public int tiquiTacaDeColumna(int columna,int cantidad) {
        int cont1 = 0;
        int tiquiTaca = 0;

 
 List<Integer> list = new ArrayList<Integer>();
        int datoA=0;
        int datoB=0;

        int tam = Columnas.BasesDatos.size() -1;/*Se analiza el penultimo y ultimo siempre*/

        for (int i = 0; i < tam; i++) {
           
            if(datos[BasesDatos.get(i)].getColumna()==columna){
                datoA = datos[BasesDatos.get(i)].getColumna();//1
                datoB = datos[BasesDatos.get(i + 1)].getColumna();//3 
       
                if (datoA != datoB) {
                    //3!=2 cont1=1,,2!"=1cont1=1
                         tiquiTaca++;
                }else{
                    if( tiquiTaca!=0){
                        list.add(tiquiTaca);
                        tiquiTaca=0;
                    
                    }
                    
                }
               
            } 
        }
     Iterator<Integer> myListIterator = list.iterator();
                
      System.out.print("Mirar Columna TiquiTaca columna " + columna +":" );
      
      if(!list.isEmpty()){
              int max=0;   
           int min=100;
          
     while (myListIterator.hasNext()) {
                    Integer dato = myListIterator.next();
                  
                   System.out.print(dato+" ");
                    if(dato>max){
                      max = dato;
                  }
                  
                 if(dato< min){
                      min = dato;
                  }
                   
                }
                 System.out.println();
        
           
              System.out.print("\tMinimo : " + min);
         System.out.println(" Max : " + max);
      }else{
             System.out.println(" Se repite siempre");
      
      }
       

    //System.out.println("Mayor numeor de verces " + columna +":" );          
                 
        return tiquiTaca;
    }
    
/**
 *  Este es el conteo de las veces que pasa la columA a la columb
 *  da igual si esta o no repetida anterioridad, si son reptedidas da igual todo.
     * @param columA Columna donde estoy
     * @param columB Columna a donde voy
     * @return Cuantas veces se cumple que la columA va a columB
 */
 public int totalTiquiTacaDeColumAColum(int columA,int columB) {

        int tiquiTaca = 0;
        int datoA=0;
        int datoB=0;

        int tam = Columnas.BasesDatos.size() -1;/*Se analiza el penultimo y ultimo siempre*/

        for (int i = 0; i < tam; i++) {
            datoA = datos[BasesDatos.get(i)].getColumna();//1
            datoB = datos[BasesDatos.get(i + 1)].getColumna();//3 
            if((datoA==columA)&&(datoB==columB)){
                tiquiTaca++;
            }
               
        } 
        return tiquiTaca;
    }
 
 /*
 * Cantidad de veces qeu puede cambiar.
 */
  public int totalTiquiTacaDeColumACulaquierOtra(int columA) {

        int tiquiTaca = 0;
        int datoA=0;
        int datoB=0;

        int tam = Columnas.BasesDatos.size() -1;/*Se analiza el penultimo y ultimo siempre*/

        for (int i = 0; i < tam; i++) {
            datoA = datos[BasesDatos.get(i)].getColumna();//1
            datoB = datos[BasesDatos.get(i + 1)].getColumna();//3 
            if((datoA==columA)&&(datoB!=columA)){
                tiquiTaca++;
            }
               
        } 
        return tiquiTaca;
    }
 
 
  public int trazaDeRepeticiones(){
      //qeu se vea algo como lo k sigue 0{2}2{2}02{2}  2repeticion{3clumna.}o{2 veces la 3 clumna.}
  return 1;
  }
  
  
  
  
 public int seguidasTiquiTacaDeColumAColum(int columA,int columB,int repe) {
       int tiquiTaca =-1;
       int cont=0;
        int datoA=0;
        int datoB=0;
        List<Integer> list = new ArrayList<Integer>();
        int tam = Columnas.BasesDatos.size() -1;/*Se analiza el penultimo y ultimo siempre*/

        for (int i = 0; i < tam; i++) {
            
            datoA = datos[BasesDatos.get(i)].getColumna();//1
            if(datoA==columA){
                // System.out.println("EStasw es mi i:"+i);
                datoB = datos[BasesDatos.get(i + 1)].getColumna();//3 
                if(datoB==columB){
                    tiquiTaca++;
                    cont=0;/*se poneen e0*/
                }else{
                     
                    if(datoB==datoA){
                        //System.out.println("Se repite"+ cont + "i: "+i+"valor"+ BasesDatos.get(i));
                        cont++;//se a repetido.
                         //System.out.println();
                    }else{
                        /*Se a apostado a la otra columna hay un tikitaca al a otra columna.*/
                        if(cont==repe){
                       
                       
                        }
                        //System.out.println("otroooo"+ cont); 
                          if(tiquiTaca>=0){
                             // list.add( tiquiTaca);
                          } 
                         if(datoB!=0) 
                           list.add( tiquiTaca);
                         tiquiTaca=0;
                       
                         cont = 0;//Empieza el conteo de repeticil
                    
                    
                    
                   }
                   
                }
            }
        } 
         Iterator<Integer> myListIterator = list.iterator();
            int ganamos=0;
            int perdemos=0;
          while (myListIterator.hasNext()) {
                    Integer dato = myListIterator.next();
                  
                   System.out.print(dato+" ");
                   if(dato == 0 ){
                     perdemos++;
                   }else{
                     ganamos++;
                   }
                   
                  }
       //0 son la sposible posibilidade k se repita y no lo hiso lso uno es k fue seguida un vez. 
        System.out.println("Total de posibles:" + list.size());
        System.out.println("Total de saltos de la columna " +columA+ " a otra: "+ this.totalTiquiTacaDeColumACulaquierOtra(columA));
        System.out.println("Son a 0:" +this.totalTiquiTacaDeColumAColum(columA,0));
        System.out.println("Salta a la columna "+columB+": " + this.totalTiquiTacaDeColumAColum(columA,columB));
         
       System.out.println("Jugando apostar a la otra columna");
       perdemos =(this.totalTiquiTacaDeColumACulaquierOtra(columA)-this.totalTiquiTacaDeColumAColum(columA,columB));
       System.out.println("Perdemos:" + perdemos);
       ganamos = (this.totalTiquiTacaDeColumAColum(columA,columB));
       System.out.println("Ganos:" + ganamos);
       
       System.out.println("Rsultado:" + ((ganamos*2)-perdemos));
         
        return tiquiTaca;
     
      
  }   
 
 public void apuestaAColumContrariaYunaficha(){
 
 
 
 
 }
  
  
    public void verTiquiTacaColumColum(){
        
        System.out.println("Total de veces que va de una columna a otra :");
        System.out.println("De Columna 1 a 0: " +  this.totalTiquiTacaDeColumAColum(1,0));  
        System.out.println("De Columna 1 a 2: " +  this.totalTiquiTacaDeColumAColum(1,2));  
        System.out.println("De Columna 1 a 3: " +  this.totalTiquiTacaDeColumAColum(1,3)); 
        System.out.println("De Columna 2 a 0: " +  this.totalTiquiTacaDeColumAColum(2,0));  
        System.out.println("De Columna 2 a 1: " +  this.totalTiquiTacaDeColumAColum(2,1)); 
        System.out.println("De Columna 2 a 3: " +  this.totalTiquiTacaDeColumAColum(2,3));
        System.out.println("De Columna 3 a 0: " +  this.totalTiquiTacaDeColumAColum(3,0));  
        System.out.println("De Columna 3 a 1: " +  this.totalTiquiTacaDeColumAColum(3,1)); 
        System.out.println("De Columna 3 a 2: " +  this.totalTiquiTacaDeColumAColum(3,2));            
           
        System.out.println( );
              seguidasTiquiTacaDeColumAColum(1,2,1);  System.out.println( );
                seguidasTiquiTacaDeColumAColum(1,3,1);  System.out.println( );
                
                seguidasTiquiTacaDeColumAColum(2,3,1);  System.out.println( );
                 seguidasTiquiTacaDeColumAColum(2,1,1);  System.out.println( );
                 
                   seguidasTiquiTacaDeColumAColum(3,1,1);  System.out.println( );
                 seguidasTiquiTacaDeColumAColum(3,2,1);  System.out.println( );
                 
     /*          seguidasTiquiTacaDeColumAColum(1,2,2);  System.out.println( );
                seguidasTiquiTacaDeColumAColum(1,2,3);  System.out.println( );
                 seguidasTiquiTacaDeColumAColum(1,2,4);  System.out.println( );
                  seguidasTiquiTacaDeColumAColum(1,2,5);  System.out.println( );
                   seguidasTiquiTacaDeColumAColum(1,2,6);  System.out.println( );
                   seguidasTiquiTacaDeColumAColum(1,2,7);  System.out.println( );
                   seguidasTiquiTacaDeColumAColum(1,2,8);  System.out.println( );
                   seguidasTiquiTacaDeColumAColum(1,2,9);  System.out.println( );
                   seguidasTiquiTacaDeColumAColum(1,2,10);  System.out.println( );
         seguidasTiquiTacaDeColumAColum(1,3,2);  System.out.println( )
             seguidasTiquiTacaDeColumAColum(2,1,2);  System.out.println( )
              seguidasTiquiTacaDeColumAColum(2,3,2);  System.out.println( )
               seguidasTiquiTacaDeColumAColum(3,1,2);  System.out.println( )
                seguidasTiquiTacaDeColumAColum(3,2,2);  System.out.println( )*/
        
    }
    
    public int vecesRepetidas(int columna, int cantidad) {

        int cant = 0;

        int n_repet = 0;

        int anterior;
        int actual;

        int tam = Columnas.BasesDatos.size()-1;

        for (int i = 0; i < tam; i++) {

            if (datos[BasesDatos.get(i)].getColumna() == columna) {

                anterior = datos[BasesDatos.get(i)].getColumna();
                actual = datos[BasesDatos.get(i + 1)].getColumna();

                if (anterior == actual) {
                    n_repet++;
                } else {
                    if (n_repet == cantidad) {

                        /*if (actual == 0) {
                            //   System.out.println("anterio:  "+ anterior + " actual ; " +actual + "cant " + cant);
                            i++;//Incremento la i por k es cero en la siguiente estara i+c se pasarala i y alsigueitne.
                        }*/

                        cant++;
                    }

                    n_repet = 0;

                }

            }

        }

        if (n_repet == cantidad) {
            cant++;
        }
        return cant;

    }

    public int vecesRepetidasQueLleganCero(int columna, int cantidad) {

        int cant = 0;

        int n_repet = 0;

        int anterior;
        int actual;

        int tam = Columnas.BasesDatos.size() - 1;

        for (int i = 0; i < tam; i++) {

            if (datos[BasesDatos.get(i)].getColumna() == columna) {

                anterior = datos[BasesDatos.get(i)].getColumna();
                actual = datos[BasesDatos.get(i + 1)].getColumna();

                if (anterior == actual) {

                    n_repet++;
                } else {
                    if (n_repet == cantidad) {

                        if ((actual == 0)) {
                            cant++;
                        }

                    }

                    n_repet = 0;

                }

            }

        }

        return cant;

    }
    
 //hace un tikitaca
public int MayorTiquiTaca(){
        int cont1 = 0;
        int mayorTiquiTaca = 0;

        int datoA;
        int datoB;

        int tam = Columnas.BasesDatos.size() - 1;/*Se analiza el penultimo y ultimo siempre*/

        for (int i = 0; i < tam; i++) {

                datoA = datos[BasesDatos.get(i)].getColumna();//3 3 2 2
                datoB = datos[BasesDatos.get(i + 1)].getColumna();//3 2 2 1
       
                if (datoA != datoB) {
                    //3!=2 cont1=1,,2!"=1cont1=1
                        cont1++;
                }else{
                    //3 3, 2 2 mayorTiquiTaca=1
                    if(mayorTiquiTaca < cont1){
                        mayorTiquiTaca = cont1;
                    }
                    cont1=0;
                }
               
            } 
        
        //Es cuando llega al final de BasesDatos y no hay repeticiones
        if(mayorTiquiTaca < cont1){
             mayorTiquiTaca = cont1;
        }
        
        return mayorTiquiTaca;
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

    public int conteoDosColumnas(int col1, int col2) {
        return this.totalColumnaEn(col1) + this.totalColumnaEn(col2);
    }

    /**
     * Esta funcion devuelve la cantidad de veces qeu se acierta apostando a no
     * repetir en columnas, mirara cuando repita n_repetir veces y en la columna
     * columna.
     *
     * @param columna Columna que seleccionamos.
     * @param n_repetir Cuando se apuesta a repetir.
     * @return cont1 que sera el numero de veces que se acierta.
     */
    public int aNoRepetir(int columna, int n_repetir) {
        int cont1 = 0;
        int contR = 0;

        int datoA;
        int datoB;

        int tam = Columnas.BasesDatos.size() - 1;

        for (int i = 0; i < tam; i++) {

            if (datos[BasesDatos.get(i)].getColumna() == columna) {
                contR++;

                if (contR == n_repetir) {

                    datoA = datos[BasesDatos.get(i)].getColumna();
                    datoB = datos[BasesDatos.get(i + 1)].getColumna();

                    if (datoA != datoB) {

                        cont1++;
                    }
                }
            } else {
                contR = 0;

            }

        }
        return cont1++;
    }

    /**
     * Esta funcion devuelve la cantidad de veces qeu se acierta apostando a
     * repetir en columnas, mirara cuando repita n_repetir veces y en la columna
     * columna.
     *
     * @param columna Columna que seleccionamos.
     * @param n_repetir Cuando se apuesta a repetir.
     * @return cont1 que sera el numero de veces que se acierta.
     */
    public int aRepetir(int columna, int n_repetir) {
        int cont1 = 0;
        int contR = 0;

        int datoA;
        int datoB;

        int tam = Columnas.BasesDatos.size() - 1;

        for (int i = 0; i < tam; i++) {

            if (datos[BasesDatos.get(i)].getColumna() == columna) {
                contR++;

                if (contR == n_repetir) {

                    datoA = datos[BasesDatos.get(i)].getColumna();
                    datoB = datos[BasesDatos.get(i + 1)].getColumna();

                    if (datoA == datoB) {

                        cont1++;
                    }
                }
            } else {
                contR = 0;

            }

        }
        return cont1++;
    }

    /**
     * Esta funcion devuelve la cantidad de veces que se puede apostar a repetir
     * n_repetir en todo nuesto vecotr.
     *
     * @param columna Columna que seleccionamos.
     * @param n_repetir Cuando se apuesta a repetir.
     * @return cont1 que sera el numeor de veces que se puesta.
     */
    public int vecesRepetir(int columna, int n_repetir) {
        int cont1 = 0;
        int contR = 0;

        int datoA;
        int datoB;

        int tam = Columnas.BasesDatos.size() - 1;

        for (int i = 0; i < tam; i++) {

            if (datos[BasesDatos.get(i)].getColumna() == columna) {
                contR++;

                if (contR == n_repetir) {
                    cont1++;

                }
            } else {
                contR = 0;

            }

        }
        return cont1++;
    }

    public int columnaUltTquiTaca() {
        int cont = 0;
        int tam = Columnas.BasesDatos.size() - 1;
        int columna = 0;
        boolean salir = false;

        while (!salir) {

            columna = datos[BasesDatos.get(tam)].getColumna();

            if (datos[BasesDatos.get(tam - 1)].getColumna() != columna) {
                cont++;
            } else if (cont >= 1) {
                salir = true;

            }
            tam--;

        }
        System.out.print("\nTiquiTaca Columna: " + columna + " NumeroVeces: " + cont);

        return columna;
    }

    public int vecesUltTquiTaca() {
        int cont = 0;
        int tam = Columnas.BasesDatos.size() - 1;
        int columna = 0;
        boolean salir = false;

        while (!salir) {

            columna = datos[BasesDatos.get(tam)].getColumna();

            if (datos[BasesDatos.get(tam - 1)].getColumna() != columna) {
                cont++;
            } else if (cont >= 1) {
                salir = true;

            }
            tam--;

        }

        System.out.print("\nTiquiTaca " + cont + "\n");
        System.out.print("Estoy en la Columna : " + datos[BasesDatos.get(Columnas.BasesDatos.size() - 1)].getColumna());
        return cont;

    }

    public int ultimaColumRepe() {

        int cont = 0;
        int tam = Columnas.BasesDatos.size() - 1;
        int columna = 0;
        boolean salir = false;

        while (!salir) {

            columna = datos[BasesDatos.get(tam)].getColumna();

            if (datos[BasesDatos.get(tam - 1)].getColumna() == columna) {
                cont++;

            } else if (cont >= 1) {
                salir = true;

            }
            tam--;

        }
        System.out.print("Columna: " + columna + " NumeroVeces: " + cont);
        return columna;
    }

    public int numVecesUltColRepe() {
        int cont = 0;
        int tam = Columnas.BasesDatos.size();
        int columna = 0;
        boolean salir = false;

        while (!salir) {

            columna = datos[BasesDatos.get(tam)].getColumna();

            if (datos[BasesDatos.get(tam - 1)].getColumna() == columna) {
                cont++;

            } else if (cont >= 1) {
                salir = true;

            }
            tam--;

        }
        System.out.print("Columna: " + columna + " NumeroVeces: " + cont);
        return cont;
    }

////////////////////////////////////////////////////////////////////////////////   
    /////////////////////////APUESTAS//////////////////////////////////////////////   
    private boolean datosDosColumnas(int col1, int col2) {

        int fichasGan = this.totalColumnaEn(col1) + this.totalColumnaEn(col2);
        int cero = this.totalCero();
        int fichasPer = ((totalColumna() - fichasGan) + cero) * 2;
        int val = fichasGan - fichasPer;
        System.out.println("\tFichas que se Ganan solo apostando Columnas " + col1 + " " + col2 + ": " + val);
        return true;
    }

    public String apostarDosCol() {

        String Valor = "\nConteo de dos columnas : \n";

        Valor = Valor + "\tColumna 1,2: " + this.conteoDosColumnas(1, 2) + " Columna 3:" + this.totalColumnaEn(3) + "\n";
        Valor = Valor + "\tColumna 1,3: " + this.conteoDosColumnas(1, 3) + " Columna 2:" + this.totalColumnaEn(2) + "\n";
        Valor = Valor + "\tColumna 2,3: " + this.conteoDosColumnas(3, 2) + " Columna 1:" + this.totalColumnaEn(1) + "\n";
        System.out.println(Valor);
        System.out.println("\tHacer apuestas :");
        this.datosDosColumnas(1, 2);
        this.datosDosColumnas(3, 2);
        this.datosDosColumnas(1, 3);

        return Valor;
    }

    public String verNoRepetir(int columna) {

        System.out.println("Apuesta: No se repite en la columan " + columna + " en repetición x");
        int tam = this.MayorSeguida(columna) + 1;

        int cont_ganadas = 0;
        int cont_apuestas = 0;
        int ganas = 0;
        int pierdes = 0;
        int total = 0;
        float por;
        System.out.println("Repet x  | Ganadas --> %  | Perdidas --> % | TotalApu | %GanadasT | %PerdidasT");

        for (int i = 0; i <= tam && tam != 1; i++) {
            ganas = this.aNoRepetir(columna, i);
            total = this.vecesRepetir(columna, i);
            cont_ganadas = cont_ganadas + ganas;
            cont_apuestas = cont_apuestas + total;
        }

        for (int i = 1; i <= tam && tam != 1; i++) {
            ganas = this.aNoRepetir(columna, i);
            total = this.vecesRepetir(columna, i);
            pierdes = (total - ganas);

            por = (float) ((float) (100 * ganas) / (float) total);
            System.out.print("\t" + i + "   " + String.format("%02d", ganas) + " --> " + String.format("%03.2f", por) + "%   ");

            por = (float) ((float) (100 * pierdes) / (float) total);
            System.out.print(String.format("%02d", pierdes) + " --> " + String.format("%03.2f", por) + "%    " + String.format("%02d", total) + "    \t");

            por = (float) ((float) (100 * ganas) / (float) cont_apuestas);
            System.out.print(String.format("%03.2f", por) + "%  ");

            por = (float) ((float) (100 * pierdes) / (float) cont_apuestas);
            System.out.println(String.format("%03.2f", por) + "%      ");

        }
        System.out.println("Totales: " + "\t" + cont_ganadas + "\t" + (cont_apuestas - cont_ganadas) + "\t" + cont_apuestas);
        System.out.println("___________________________________________");
        return "";
    }

    public void apuestaDosColumANoRepetirYCero() {

        int ganarC1 = this.vecesRepetidas(1, 6);
        int ganarC2 = this.vecesRepetidas(2, 6);
        int ganarC3 = this.vecesRepetidas(3, 6);

        System.out.println("Se apuesta al cambio:");
        ////Perdidas son las repetida mayores a 6 si las tienes.
        int perderC1 = 0;
        int perderC2 = 0;
        int perderC3 = 0;
        int ceroC1 = this.vecesRepetidasQueLleganCero(1, 6);
        int ceroC2 = this.vecesRepetidasQueLleganCero(2, 6);
        int ceroC3 = this.vecesRepetidasQueLleganCero(3, 6);

        if (6 < this.MayorSeguida(1)) {

            int tam = this.MayorSeguida(1) + 1;
            for (int i = 7; i <= tam; i++) {
                System.out.println("\tCol 1 : i=" + i + "  " + this.vecesRepetidas(1, i));
                if (this.vecesRepetir(1, i) != 0) {
                    perderC1 = perderC1 + this.vecesRepetidas(1, i);
                }
            }

        }

        if (6 < this.MayorSeguida(2)) {

            int tam = this.MayorSeguida(2) + 1;
            for (int i = 7; i <= tam; i++) {
                System.out.println("\tCol 2 :" + this.vecesRepetidas(2, i));
                if (this.vecesRepetidas(2, i) != 0) {
                    perderC2 = perderC2 + this.vecesRepetidas(2, i);
                }
            }

        }
        if (6 < this.MayorSeguida(3)) {

            int tam = this.MayorSeguida(3) + 1;
            for (int i = 7; i <= tam; i++) {
                System.out.println("\tCol3 :" + this.vecesRepetidas(3, i));
                if (this.vecesRepetir(3, i) != 0) {
                    perderC3 = perderC3 + this.vecesRepetidas(3, i);
                }
            }

        }

        System.out.println("Col 1 . Veces repetidas iguales a 6: " + ganarC1);
        System.out.println("Col 2 . Veces repetidas iguales a 6: " + ganarC2);
        System.out.println("Col 3 . Veces repetidas iguales a 6: " + ganarC3);
        System.out.println("Total Ganadas: " + (ganarC1 + ganarC2 + ganarC3));

        System.out.println("Col 1 . Veces repetidas iguales a 6: " + perderC1);
        System.out.println("Col 2 . Veces repetidas iguales a 6: " + perderC2);
        System.out.println("Col 3 . Veces repetidas iguales a 6: " + perderC3);
        System.out.println("Total Perdidas: " + (perderC1 + perderC2 + perderC3));

        System.out.println("Veces 0 cuadno caen 0:" + ceroC1);
        System.out.println("Veces 0 cuadno caen 0:" + ceroC2);
        System.out.println("Veces 0 cuadno caen 0:" + ceroC3);
        System.out.println("Total Caidas en Cero: " + (ceroC1 + ceroC2 + ceroC3));

        System.out.println("Fichas Perdidas: " + (perderC1 + perderC2 + perderC3) * 5);
        System.out.println("Fichas Ganadas en columnas: " + (ganarC1 + ganarC2 + ganarC3));
        System.out.println("Fichas Caidas en Cero: " + (ceroC1 + ceroC2 + ceroC3) * (32));
        int fichasG = (ganarC1 + ganarC2 + ganarC3) + ((ceroC1 + ceroC2 + ceroC3) * (32));
        int fichasP = (perderC1 + perderC2 + perderC3) * 5;

        System.out.println("Resultado: " + (fichasG - fichasP));

    }

    public void apuestaDosColumANoRepetirYCero(int dato) {

        int ganarC1 = this.vecesRepetidas(1, dato);
        int ganarC2 = this.vecesRepetidas(2, dato);
        int ganarC3 = this.vecesRepetidas(3, dato);

        System.out.println("Se apuesta al cambio:");
        ////Perdidas son las repetida mayores a 6 si las tienes.
        int perderC1 = 0;
        int perderC2 = 0;
        int perderC3 = 0;
        int ceroC1 = this.vecesRepetidasQueLleganCero(1, dato);
        int ceroC2 = this.vecesRepetidasQueLleganCero(2, dato);
        int ceroC3 = this.vecesRepetidasQueLleganCero(3, dato);

        if (6 < this.MayorSeguida(1)) {

            int tam = this.MayorSeguida(1) + 1;
            for (int i = dato + 1; i <= tam; i++) {
                //System.out.println("\tCol 1 : i="+i+"  " + this.Columna.vecesRepetidas(1, i));
                if (this.vecesRepetir(1, i) != 0) {
                    perderC1 = perderC1 + this.vecesRepetidas(1, i);
                }
            }

        }

        if (6 < this.MayorSeguida(2)) {

            int tam = this.MayorSeguida(2) + 1;
            for (int i = dato + 1; i <= tam; i++) {
                //  System.out.println("\tCol 2 :" + this.Columna.vecesRepetidas(2, i));
                if (this.vecesRepetidas(2, i) != 0) {
                    perderC2 = perderC2 + this.vecesRepetidas(2, i);
                }
            }

        }
        if (6 < this.MayorSeguida(3)) {

            int tam = this.MayorSeguida(3) + 1;
            for (int i = dato + 1; i <= tam; i++) {
                //System.out.println("\tCol3 :" + this.Columna.vecesRepetidas(3, i));
                if (this.vecesRepetir(3, i) != 0) {
                    perderC3 = perderC3 + this.vecesRepetidas(3, i);
                }
            }

        }

        System.out.println("Col 1 . Veces repetidas iguales a 6: " + ganarC1);
        System.out.println("Col 2 . Veces repetidas iguales a 6: " + ganarC2);
        System.out.println("Col 3 . Veces repetidas iguales a 6: " + ganarC3);
        System.out.println("Total Ganadas: " + (ganarC1 + ganarC2 + ganarC3));

        System.out.println("Col 1 . Veces repetidas iguales a 6: " + perderC1);
        System.out.println("Col 2 . Veces repetidas iguales a 6: " + perderC2);
        System.out.println("Col 3 . Veces repetidas iguales a 6: " + perderC3);
        System.out.println("Total Perdidas: " + (perderC1 + perderC2 + perderC3));

        System.out.println("Veces 0 cuadno caen 0:" + ceroC1);
        System.out.println("Veces 0 cuadno caen 0:" + ceroC2);
        System.out.println("Veces 0 cuadno caen 0:" + ceroC3);
        System.out.println("Total Caidas en Cero: " + (ceroC1 + ceroC2 + ceroC3));

        int fichasG = (ganarC1 + ganarC2 + ganarC3) + ((ceroC1 + ceroC2 + ceroC3) * (36 - 4));
        int fichasP = (perderC1 + perderC2 + perderC3) * 5;

        System.out.println("Fichas Perdidas: " + fichasP);
        System.out.println("Fichas Ganadas en columnas: " + (ganarC1 + ganarC2 + ganarC3));
        System.out.println("Fichas Caidas en Cero: " + (ceroC1 + ceroC2 + ceroC3) * (36 - 4));

        System.out.println("Resultado: " + ((fichasG + 32) - fichasP));

    }

    public String datosApuestaRepetir() {

        int tam = this.MayorSeguida(1) + 1;
        for (int i = 1; i <= tam; i++) {
            System.out.println("Apuesta: No se repite en la columan 1 en repetición " + i + ": " + this.aRepetir(1, i));
            System.out.println("\tDe un total de apuestas de :" + this.vecesRepetir(1, i));
        }

        tam = this.MayorSeguida(2) + 1;
        for (int i = 1; i <= tam; i++) {
            System.out.println("Apuesta: No se repite en la columan 2 en repetición " + i + ": " + this.aRepetir(2, i));
            System.out.println("\tDe un total de apuestas de :" + this.vecesRepetir(2, i));
        }

        tam = this.MayorSeguida(3) + 1;
        for (int i = 1; i <= tam; i++) {
            System.out.println("Apuesta: No se repite en la columan 3 en repetición " + i + ": " + this.aRepetir(3, i));
            System.out.println("\tDe un total de apuestas de :" + this.vecesRepetir(3, i));
        }

        return "";
    }

////////////////////////////////////////////////////////////////////////////////   

    /*
    public void verTotalColumnas() {

        System.out.println(this.total_c1 + "  " + this.total_c2 + "  " + this.total_c3);
        
        System.out.println(this.Mayor_seguida_c1 + " " + this.Mayor_seguida_c2 + " " + this.Mayor_seguida_c3);
        System.out.println(this.contNumVeces+ " "+  contTotalSecion);
    }
     */
}
