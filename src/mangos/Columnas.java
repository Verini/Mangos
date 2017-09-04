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
public class Columnas extends Estudio{
      //columnas.
      private int total_c1;
      private int total_c2;
      private int total_c3;
      
      private int Mayor_seguida_c1;
      private int Mayor_seguida_c2;
      private int Mayor_seguida_c3;
      
      
      /**
           HAcer lo del grafica con lo del mayor seguido.       
       */
      
      /**  
       * Cuantas veces seguidad hace un salto de columna hacia la misma columna
      */
      private int Mayor_rep_sal_c1_c2;
      private int Mayor_rep_sal_c1_c3;
      private int Mayor_rep_sal_c2_c1;
      private int Mayor_rep_sal_c2_c3;
      private int Mayor_rep_sal_c3_c1;
      private int Mayor_rep_sal_c3_c2;
      
      
      
      /**
       * 
       * @param datos
       * @param BasesDatos
       * Se quiere generar una grafiaca en la que se vea en x las veces seguidad que se da un saldo de c1 a c2 pr ejemplo 
       * y ver cuantas veces se repite que seria la y.
       * 
       */
      
      
      
      
      
      
      
    public Columnas(Numero[] datos, ArrayList BasesDatos) {
           super(datos, BasesDatos);
        
    }
           
        
    
     
     
       
}
