/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguir;

import java.util.ArrayList;
import mangos.Numero;

/**
 *
 * @author jai
 */
public class SeguirCambioColumnasDocenas {
    
    protected Numero[] datos;
    protected ArrayList<Integer> BasesDatos;
    
///////////////////////////BASICA///////////////////////////////////////////////
    public SeguirCambioColumnasDocenas(Numero[] datos, ArrayList BasesDatos) {
        this.datos = datos;
        this.BasesDatos = BasesDatos;
    }
    
    public SeguirCambioColumnasDocenas(ArrayList BasesDatos) {
   
        Numero[] CrearDatos = new Numero[37];

        for (int i = 0; i < CrearDatos.length; i++) {
            CrearDatos[i] = new Numero();
            // System.out.println(this.datos[i]);
        }
        this.datos = CrearDatos;  
        this.BasesDatos = BasesDatos;
    }
    public SeguirCambioColumnasDocenas(int BasesDatos) {
       Numero[] CrearDatos = new Numero[37];

        for (int i = 0; i < CrearDatos.length; i++) {
            CrearDatos[i] = new Numero();
            // System.out.println(this.datos[i]);
        }
       
        this.datos = CrearDatos;  
        
        this.BasesDatos = new ArrayList<>();   
        this.BasesDatos.add(BasesDatos);
    }
    
    public SeguirCambioColumnasDocenas(Numero[] datos, int BasesDatos) {
        this.datos = datos;
        
        this.BasesDatos = new ArrayList<>();
        
        this.BasesDatos.add(BasesDatos);
    }

    public void setBasesDatos(ArrayList<Integer> BasesDatos) {
        this.BasesDatos = BasesDatos;
    }
    
    //*Le metemos solo un entero.
    public void ingresNuevoDatos(int BasesDatos) {
        this.BasesDatos.add(BasesDatos);
    }
    
    public void showDatos(){
    
       System.out.println("Cambios de Columna: " + cambioColumna() );
       System.out.println("Repetidas Columnas: " + noCambioColumna() );
       System.out.println("Cambios de Docenas: " + cambioDocena() );
       System.out.println("Repetidas Docenas: " + noCambioDocena() );
       
       System.out.println("Cambio Docenas y Columnas cc Solo hace 5: " + cambioColumnaDocena() );
       System.out.println("Repetidas Docenas y Columnas 1 o 2: " + noCambioColumnaDocena() );
       
       System.out.println("Cuanto hace que no hice ii: " + cambioColumnaODocena() );
       System.out.println("Cuanto hace que no hice cc: " + noCambioColumnaODocena() );
       System.out.println("Cuanto hace que no hice ci: " + cambioCI() );
         System.out.println("Cuanto hace que no hice IC: " + cambioIC() );
    }
             /*REminar*/
    public int cambioCI(){
        int resul = 0;
        int tam = BasesDatos.size()-1;
          
        boolean dentro =  true;
        
        while((dentro)||(tam<0)){
          int columna = datos[BasesDatos.get((tam-1))].getColumna();
          int docena = datos[BasesDatos.get((tam-1))].getDocena();
        if((BasesDatos.get(tam)!=0)&&(BasesDatos.get(tam-1)!=0)){
           if((datos[BasesDatos.get(tam)].getColumna() == columna) ||
                (datos[BasesDatos.get(tam)].getDocena() != docena)){
                resul++;
                tam--;
            }else{
                dentro =false;
            }
          }else{
                dentro =false;
           }
        }
        
        return resul;
    }
    
         /*REminar*/
    public int cambioIC(){
        int resul = 0;
        int tam = BasesDatos.size()-1;
          
        boolean dentro =  true;
        
        while((dentro)||(tam<0)){
          int columna = datos[BasesDatos.get((tam-1))].getColumna();
          int docena = datos[BasesDatos.get((tam-1))].getDocena();
        if((BasesDatos.get(tam)!=0)&&(BasesDatos.get(tam-1)!=0)){
           if((datos[BasesDatos.get(tam)].getColumna() != columna) ||
                (datos[BasesDatos.get(tam)].getDocena() == docena)){
                resul++;
                tam--;
            }else{
                dentro =false;
            }
          }else{
                dentro =false;
           }
        }
        
        return resul;
    }
    
       /*REminar*/
    public int cambioColumnaODocena(){
        int resul = 0;
        int tam = BasesDatos.size()-1;
          
        boolean dentro =  true;
        
        while((dentro)||(tam<0)){
          int columna = datos[BasesDatos.get((tam-1))].getColumna();
          int docena = datos[BasesDatos.get((tam-1))].getDocena();
        if((BasesDatos.get(tam)!=0)&&(BasesDatos.get(tam-1)!=0)){
           if((datos[BasesDatos.get(tam)].getColumna() != columna) ||
                (datos[BasesDatos.get(tam)].getDocena() != docena)){
                resul++;
                tam--;
            }else{
                dentro =false;
            }
          }else{
                dentro =false;
           }
        }
        
        return resul;
    }
      /*REminar*/
    public int noCambioColumnaODocena(){
        int resul = 0;
        int tam = BasesDatos.size()-1;
        boolean dentro =  true;
        
        while((dentro)||(tam<0)){
          int columna = datos[BasesDatos.get((tam-1))].getColumna();
          int docena = datos[BasesDatos.get((tam-1))].getDocena();
        if((BasesDatos.get(tam)!=0)&&(BasesDatos.get(tam-1)!=0)){
           if((datos[BasesDatos.get(tam)].getColumna() == columna) ||
                (datos[BasesDatos.get(tam)].getDocena() == docena)){
                resul++;
                tam--;
            }else{
                dentro =false;
            }
          }else{
                dentro =false;
           }
        }
        
        return resul;
    }
    
    
     /*REminar*/
    public int noCambioColumnaDocena(){
        int resul = 0;
        int tam = BasesDatos.size()-1;
        boolean dentro =  true;
        
        while((dentro)||(tam<0)){
          int columna = datos[BasesDatos.get((tam-1))].getColumna();
          int docena = datos[BasesDatos.get((tam-1))].getDocena();
        if((BasesDatos.get(tam)!=0)&&(BasesDatos.get(tam-1)!=0)){
           if((datos[BasesDatos.get(tam)].getColumna() == columna) &&
                (datos[BasesDatos.get(tam)].getDocena() == docena)){
                resul++;
                tam--;
            }else{
                dentro =false;
            }
          }else{
                dentro =false;
           }
        }
        
        return resul;
    }
    
    
    /*REminar*/
    public int cambioColumnaDocena(){
        int resul = 0;
        int tam = BasesDatos.size()-1;
        boolean dentro =  true;
        
        while((dentro)||(tam<0)){
          int columna = datos[BasesDatos.get((tam-1))].getColumna();
          int docena = datos[BasesDatos.get((tam-1))].getDocena();
        if((BasesDatos.get(tam)!=0)&&(BasesDatos.get(tam-1)!=0)){
           if((datos[BasesDatos.get(tam)].getColumna() != columna) &&
                (datos[BasesDatos.get(tam)].getDocena() != docena)){
                resul++;
                tam--;
            }else{
                dentro =false;
            }
          }else{
                dentro =false;
           }
        }
        
        return resul;
    }
    
    
    public int cambioColumna(){
        int resul = 0;
        int tam = BasesDatos.size()-1;
       
        boolean dentro =  true;
        while((dentro)||(tam<0)){
          int columna = datos[BasesDatos.get((tam-1))].getColumna();
          if((BasesDatos.get(tam)!=0)&&(BasesDatos.get(tam-1)!=0)){
            if (datos[BasesDatos.get(tam)].getColumna() != columna) {
                resul++;
                tam--;
            }else{
                dentro =false;
            }
          }else{
                dentro =false;
           }
        }
        
        return resul;
    }
    
    public int noCambioColumna(){
        int resul = 0;
        int tam = BasesDatos.size()-1;
        boolean dentro =  true;
             while((dentro)||(tam<0)){
          int columna = datos[BasesDatos.get((tam-1))].getColumna();
          if((BasesDatos.get(tam)!=0)&&(BasesDatos.get(tam-1)!=0)){
            if (datos[BasesDatos.get(tam)].getColumna() == columna) {
                resul++;
                tam--;
            }else{
                dentro =false;
            }
          }else{
                dentro =false;
           }
        }
        
        return resul;
    }
    
    public int cambioDocena(){
        int resul = 0;
        int tam = BasesDatos.size()-1;
        boolean dentro =  true;      
        
       while((dentro)||(tam<0)){
          int Docena = datos[BasesDatos.get((tam-1))].getDocena();
          if((BasesDatos.get(tam)!=0)&&(BasesDatos.get(tam-1)!=0)){
            
              if(datos[BasesDatos.get(tam)].getDocena() != Docena){
                resul++;
                tam--;
            }else{
                dentro =false;
            }
          }else{
                dentro =false;
           }
        }
        
        return resul;
    }
    
    public int noCambioDocena(){
        int resul = 0;
        int tam = BasesDatos.size()-1;
        boolean dentro =  true;
             while((dentro)||(tam<0)){
          int Docena = datos[BasesDatos.get((tam-1))].getDocena();
          if((BasesDatos.get(tam)!=0)&&(BasesDatos.get(tam-1)!=0)){
            
              if(datos[BasesDatos.get(tam)].getDocena() == Docena){
                  resul++;
                  tam--;
              }else{
                  dentro =false;
              }
          }else{
                dentro =false;
           }
        }
        
        return resul;
    }
    
}
