/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mangos;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Andrés
 */
public class Columnas extends Estudio {

    //columnas.
    private int total_c1;
    private int total_c2;
    private int total_c3;

    
    
    
    
    
    
    private int Mayor_seguida_c1;
    private int Mayor_seguida_c2;
    private int Mayor_seguida_c3;
    private int contNumVeces;
    private int contTotalSecion;
    
    /**
     * HAcer lo del grafica con lo del mayor seguido.
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
     * @param BasesDatos Se quiere generar una grafiaca en la que se vea en x
     * las veces seguidad que se da un saldo de c1 a c2 pr ejemplo y ver cuantas
     * veces se repite que seria la y.
     *
     */
    public Columnas(Numero[] datos, ArrayList BasesDatos) {
        super(datos, BasesDatos);
        
        
        
        this.total_c1 = 0;
        this.total_c2 = 0;
        this.total_c3 = 0;
        this.Mayor_seguida_c1 = 0;
        this.Mayor_seguida_c2 = 0;
        this.Mayor_seguida_c3 = 0;
        this.contNumVeces = 0;
        
        
        
        this.contTotalSecion= 0;
        
        this.totalColumna();
        this.MayorSeguida();

    }

    private void totalColumna() {

        for (int i = 0; i < this.BasesDatos.size(); i++) {

            if (datos[BasesDatos.get(i)].getColumna() == 1) {
                this.total_c1++;
            }
            if (datos[BasesDatos.get(i)].getColumna() == 2) {
                this.total_c2++;
            }
            
            if (datos[BasesDatos.get(i)].getColumna() == 3) {
                this.total_c3++;
            }
            
        }
    }

    private void MayorSeguida() {
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        for (int i = 0; i < this.BasesDatos.size(); i++) {
            if (datos[BasesDatos.get(i)].getColumna() == 1) {
                  cont1++;   
            
            }else{
                  if(this.Mayor_seguida_c1 < cont1){
                        this.Mayor_seguida_c1= cont1;

                  }
                    if(cont1 > 1){
                        contNumVeces++;
                    }
                  cont1 = 0;
                  
                  contTotalSecion++;
                  
                  
            }
            if (datos[BasesDatos.get(i)].getColumna() == 2) {
                  cont2++;   
            
            }else{
                  if(this.Mayor_seguida_c2 < cont2){
                        this.Mayor_seguida_c2= cont2;
                        
                  }
                  
                  cont2 = 0;
            }
            if (datos[BasesDatos.get(i)].getColumna() == 3) {
                  cont3++;   
            
            }else{
                  if(this.Mayor_seguida_c3 < cont3){
                        this.Mayor_seguida_c3= cont3;
                        
                  }
                  
                  cont3 = 0;
            }
            
           
            
            
            
        }
    }

    public void verTotalColumnas() {

        System.out.println(this.total_c1 + "  " + this.total_c2 + "  " + this.total_c3);
        
        System.out.println(this.Mayor_seguida_c1 + " " + this.Mayor_seguida_c2 + " " + this.Mayor_seguida_c3);
        System.out.println(this.contNumVeces+ " "+  contTotalSecion);
    }

}
